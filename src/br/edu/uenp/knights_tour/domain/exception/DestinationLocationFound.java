package br.edu.uenp.knights_tour.domain.exception;

import br.edu.uenp.knights_tour.domain.entity.Location;

@SuppressWarnings("serial")
public class DestinationLocationFound extends Exception {
	
	private Location destination;

	public Location getDestination() {
		return destination;
	}

	public DestinationLocationFound(Location destination){
        this.destination = destination;
    }
}
