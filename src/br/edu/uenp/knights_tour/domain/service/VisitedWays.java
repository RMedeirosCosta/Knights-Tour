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
	 * @param parent - Posição pai, onde vai ser verificado qual os caminhos possíveis que não foram adicionados na hie-
	 * rarquia.
	 * 
	 * @return Retorna todas as posições possíveis da posição passada no parâmetro que não foram adicionadas em nenhuma hierarquia.
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
	 * @param parent - Posição na qual será criada sua hierarquia. (Seus nós)
	 * 
	 * @throws DestinationLocationFound - Se lançar essa exceção, significa que o usuário selecionou uma posição de destino
	 * e foi construído os caminhos até ela.
	 */
    public void buildHierarchy(Location parent) throws DestinationLocationFound {
    	// Pegos as posições possíveis de se movimentar que não estejam em nenhuma hierarquia.
    	Set<Location> nodesNotAdded = this.getNodesNotAdded(parent);
    	
    	/**
    	 *  Se não tiver nenhuma possível posição que não esteja adicionada na lista
    	 *  então o método é finalizado 
    	 */    	
    	if (nodesNotAdded.isEmpty())
    		return;
    	
    	// Crio os filhos
    	parent.createNodes();
    	
    	// Itero nas posições possívei
    	for (Location destination : nodesNotAdded) {
    		Location node;
    		
    		try {    			
    			node = new Location(destination.getX(), destination.getY(), parent);
    			
    			// Adiciono aos filhos
    			parent.getNodes().add(node);
    			
    			/**
    			 *  Se uma posição de destino foi selecionada pelo usuário e esse nó é essa posição, então
    			 *  a exceção de posição de destino encontrada é disparada 
    			 */
    			if ((this.destination != null) && (this.destination.equals(node)))
    				throw new DestinationLocationFound(node);    			
    		} catch(LocationOffTheBoardException ex) {
    			throw new InvalidParameterException(ex.getMessage());
    		}
		}
    	
    	// Depois desse processo eu crio a hierarquia recursivamente para os filhos dessa posição
    	for (Location node : parent.getNodes()) {
			this.buildHierarchy(node);
		}
    }
}
