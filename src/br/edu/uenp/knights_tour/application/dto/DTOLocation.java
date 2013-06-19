package br.edu.uenp.knights_tour.application.dto;

public class DTOLocation {
	
    private       Integer x;
    private       Integer y;
    
    public DTOLocation(int x, int y) {
    	this.x = x;
    	this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }
}
