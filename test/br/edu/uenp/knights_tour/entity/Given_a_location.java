package br.edu.uenp.knights_tour.entity;

import org.junit.Test;

import br.edu.uenp.knights_tour.domain.entity.Location;
import br.edu.uenp.knights_tour.domain.exception.LocationOffTheBoardException;
import static org.junit.Assert.*;

public class Given_a_location {
	
	private Location x2y1;
	
	public Given_a_location() throws LocationOffTheBoardException {
		// Nível 1
		Location root = new Location(1, 2);
			
		// Nível 2
		Location x2y2 = new Location(2, 2, root);
		Location x3y2 = new Location(3, 2, root);
		Location x4y5 = new Location(4, 5, root);
			
		// Nível 3
		Location x2y1 = new Location(2, 1, x2y2);
		Location x2y3 = new Location(2, 3, x2y2);
			
		root.createNodes();
		root.getNodes().add(x2y2);
		root.getNodes().add(x3y2);
		root.getNodes().add(x4y5);
			
		x2y2.createNodes();
		x2y2.getNodes().add(x2y1);
		x2y2.getNodes().add(x2y3);
			
		this.x2y1 = x2y1;			
	}
    
    @Test(expected = LocationOffTheBoardException.class)
    public void I_cannot_create_with_coordinate_X_lower_that_1() throws LocationOffTheBoardException {    	
        @SuppressWarnings("unused")
		Location posicao = new Location(0, 1);        
    }
    
    @Test(expected = LocationOffTheBoardException.class)
    public void I_cannot_create_with_coordinate_X_greater_that_8() throws LocationOffTheBoardException {
    	@SuppressWarnings("unused")
        Location posicao = new Location(9, 1);        
    }
    
    @Test(expected = LocationOffTheBoardException.class)
    public void I_cannot_create_with_coordinate_Y_lower_that_1() throws LocationOffTheBoardException {
    	@SuppressWarnings("unused")
        Location posicao = new Location(1, 0);        
    }
    
    @Test(expected = LocationOffTheBoardException.class)
    public void I_cannot_create_with_coordinate_Y_greater_that_8() throws LocationOffTheBoardException {
    	@SuppressWarnings("unused")
        Location posicao = new Location(1, 9);        
    }
    
    @Test
    public void Absent_I_can_show_that_location_was_added() throws LocationOffTheBoardException {
    	Location l = new Location(2, 2);
    	assertTrue(this.x2y1.wayAlreadyAdded(l));
    }

    @Test
    public void Absent_I_can_show_that_location_wasnt_added() throws LocationOffTheBoardException {
    	Location l = new Location(6, 6);
    	assertFalse(this.x2y1.wayAlreadyAdded(l));
    }    
}