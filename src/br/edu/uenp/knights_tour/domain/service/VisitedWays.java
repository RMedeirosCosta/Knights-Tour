package br.edu.uenp.knights_tour.domain.service;

import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.Set;

import br.edu.uenp.knights_tour.domain.entity.Location;
import br.edu.uenp.knights_tour.domain.exception.DestinationLocationFound;
import br.edu.uenp.knights_tour.domain.exception.LocationOffTheBoardException;

public class VisitedWays {
	
	private Location destination;	
	
	public void setDestination(Location destination) {
		this.destination = destination;
	}

	/**
	 * 
	 * @param parent - Posi��o pai, onde vai ser verificado qual os caminhos poss�veis que n�o foram adicionados na hie-
	 * rarquia.
	 * 
	 * @return Retorna todas as posi��es poss�veis da posi��o passada no par�metro que n�o foram adicionadas em nenhuma hierarquia.
	 */
	private Set<Location> getNodesNotAdded(Location parent) {
    	Set<Location> nodes = new HashSet<>();
    	
    	for (Location n : parent.getLocationsDestination()) {
			if (!parent.wayAlreadyAdded(n))
				nodes.add(n);
		}		
    	
    	return nodes;
	}
	
	/**
	 * 
	 * @param parent - Posi��o na qual ser� criada sua hierarquia. (Seus n�s)
	 * 
	 * @throws DestinationLocationFound - Se lan�ar essa exce��o, significa que o usu�rio selecionou uma posi��o de destino
	 * e foi constru�do os caminhos at� ela.
	 */
    public void buildHierarchy(Location parent) throws DestinationLocationFound {
    	// Pegos as posi��es poss�veis de se movimentar que n�o estejam em nenhuma hierarquia.
    	Set<Location> nodesNotAdded = this.getNodesNotAdded(parent);
    	
    	/**
    	 *  Se n�o tiver nenhuma poss�vel posi��o que n�o esteja adicionada na lista
    	 *  ent�o o m�todo � finalizado 
    	 */    	
    	if (nodesNotAdded.isEmpty())
    		return;
    	
    	// Crio os filhos
    	parent.createNodes();
    	
    	// Itero nas posi��es poss�vei
    	for (Location destination : nodesNotAdded) {
    		Location node;
    		
    		try {    			
    			node = new Location(destination.getX(), destination.getY(), parent);
    			
    			// Adiciono aos filhos
    			parent.getNodes().add(node);
    			
    			/**
    			 *  Se uma posi��o de destino foi selecionada pelo usu�rio e esse n� � essa posi��o, ent�o
    			 *  a exce��o de posi��o de destino encontrada � disparada 
    			 */
    			if ((this.destination != null) && (this.destination.equals(node)))
    				throw new DestinationLocationFound(node);    			
    		} catch(LocationOffTheBoardException ex) {
    			throw new InvalidParameterException(ex.getMessage());
    		}
		}
    	
    	// Depois desse processo eu crio a hierarquia recursivamente para os filhos dessa posi��o
    	for (Location node : parent.getNodes()) {
			this.buildHierarchy(node);
		}
    }
}
