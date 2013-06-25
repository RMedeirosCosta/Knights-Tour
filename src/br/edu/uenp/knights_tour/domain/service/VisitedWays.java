package br.edu.uenp.knights_tour.domain.service;

import java.security.InvalidParameterException;
import java.util.HashSet;
import java.util.Set;

import br.edu.uenp.knights_tour.domain.entity.Location;

public class VisitedWays {
	
	private Set<Location> getNodesNotAdded(Location parent) {
    	Set<Location> nodes = new HashSet<>();
    	
    	for (Location n : parent.getLocationsDestination()) {
			if (!parent.wayAlreadyAdded(n))
				nodes.add(n);
		}		
    	
    	return nodes;
	}
	
    public void buildHierarchy(Location parent) {
    	Set<Location> nodesNotAdded = this.getNodesNotAdded(parent);
    	
    	if (nodesNotAdded.isEmpty())
    		return;
    	
    	parent.createNodes();
    	
    	for (Location destination : nodesNotAdded) {
    		Location node;
    		
    		try {    			
    			node = new Location(destination.getX(), destination.getY(), parent);
    			parent.getNodes().add(node);
    		} catch(Exception ex) {
    			throw new InvalidParameterException(ex.getMessage());
    		}
		}
    	
    	for (Location node : parent.getNodes()) {
			this.buildHierarchy(node);
		}
    }
}
