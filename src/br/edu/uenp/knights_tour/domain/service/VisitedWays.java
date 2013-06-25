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

	private Set<Location> getNodesNotAdded(Location parent) {
    	Set<Location> nodes = new HashSet<>();
    	
    	for (Location n : parent.getLocationsDestination()) {
			if (!parent.wayAlreadyAdded(n))
				nodes.add(n);
		}		
    	
    	return nodes;
	}
	
    public void buildHierarchy(Location parent) throws DestinationLocationFound {
    	Set<Location> nodesNotAdded = this.getNodesNotAdded(parent);
    	
    	if (nodesNotAdded.isEmpty())
    		return;
    	
    	parent.createNodes();
    	
    	for (Location destination : nodesNotAdded) {
    		Location node;
    		
    		try {    			
    			node = new Location(destination.getX(), destination.getY(), parent);
    			parent.getNodes().add(node);
    			
    			if ((this.destination != null) && (this.destination.equals(node)))
    				throw new DestinationLocationFound(node);
    		} catch(LocationOffTheBoardException ex) {
    			throw new InvalidParameterException(ex.getMessage());
    		}
		}
    	
    	for (Location node : parent.getNodes()) {
			this.buildHierarchy(node);
		}
    }
}
