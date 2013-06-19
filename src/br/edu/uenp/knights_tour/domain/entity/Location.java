package br.edu.uenp.knights_tour.domain.entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import br.edu.uenp.knights_tour.domain.exception.LocationOffTheBoardException;
import br.edu.uenp.knights_tour.domain.value_object.DeltaCollection;
import br.edu.uenp.knights_tour.domain.value_object.DeltaXY;

public class Location {
    
    private       Integer 	    x;
    private       Integer       y;
	private 	  Location 	    parent;
	private 	  Set<Location> nodes;
	
    public Location(Integer x, Integer y) throws LocationOffTheBoardException{
        // Verifico se a posição existe no tabuleiro de acordo com as coordenadas passadas        
        if (((x <= 0) || (x > 8)) || ((y <= 0) || (y > 8)))
            throw new LocationOffTheBoardException();
        
        this.x = x;
        this.y = y;
        this.nodes = null;
    }
    
    public Location(Integer x, Integer y, Location parent) throws LocationOffTheBoardException{
        this(x, y);
        this.parent = parent;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }
    
	public Location getLevel() {
		return parent;		
	}
	
	public Set<Location> getNodes() {
		return nodes;
	}
	
	public void setNodes(Set<Location> nodes) {
		this.nodes = nodes;
	}    
	
	public Location getParent(){
		return this.parent;
	}
    
    @Override
    public String toString(){
        return "x: "+this.x.toString()+", y: "+this.y.toString();
        
    }
    
    public String toStringClear(){
    	return "x"+this.x.toString()+" y"+this.y.toString();
    }
    
    @Override
    public boolean equals(Object posicao){
        if (!(posicao instanceof Location))
           return false; 
        
        return (this.toString().equals(posicao.toString()));
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.x);
        hash = 67 * hash + Objects.hashCode(this.y);
        return hash;
    }
    
    public Set<Location> getLocationsDestination(){
    	// Classe estática que retorna os deltas
        Set<DeltaXY> deltaCollection = DeltaCollection.getDeltaCollection();
        Set<Location> result = new HashSet<>();
        
        for (DeltaXY deltaXY : deltaCollection) {
            
            // Analiso primeiro pelo delta do x e pelo delta do y
            Location locationDestination;
            
            try {
            	locationDestination = new Location((this.x+deltaXY.getdX()), (this.y+deltaXY.getdY()));
              	result.add(locationDestination);
              	
            } catch (LocationOffTheBoardException ex) {} // Se capturar a exceção nada ocorre. Apenas não é adicionado na lista de movimentos possíveis
            
            // Depois inverto conforme documento do *.pdf
            try {
            	locationDestination = new Location((this.x+deltaXY.getdY()), (this.y+deltaXY.getdX()));            	
              	result.add(locationDestination);
                
            } catch (LocationOffTheBoardException ex) {} // O mesmo acontece para esse caso.            
        }

        return result;
    }
    
    private Location getRoot(Location node) {
    	Location parent = this.parent;
    	Location root	= this;
    	
    	while (parent != null) {
			root   = parent;    		
			parent = parent.getParent();
		}
    	
    	return root;
    }
    
    public boolean wayAlreadyAdded(Location newNode) {
    	Location root = this.getRoot(newNode);
    	
    	return this.wayAlreadyAddedInNode(root, newNode);
    }
    
    public void createNodes() {
    	this.nodes = new HashSet<>();
    }
    
    private boolean wayAlreadyAddedInNode(Location node, Location newNode) {
    	if (node.getNodes() == null) 
    		return node.equals(newNode);
    	
    	for (Location n : node.getNodes()) {
    		if(this.wayAlreadyAddedInNode(n, newNode))
    			return true;
			}
    		
    	return node.equals(newNode);
    }
}
