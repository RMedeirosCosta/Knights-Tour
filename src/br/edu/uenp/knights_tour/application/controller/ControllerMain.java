package br.edu.uenp.knights_tour.application.controller;

import br.edu.uenp.knights_tour.application.dto.DTOLocation;
import br.edu.uenp.knights_tour.application.view.ViewMain;
import br.edu.uenp.knights_tour.domain.entity.Location;
import br.edu.uenp.knights_tour.domain.exception.LocationOffTheBoardException;
import br.edu.uenp.knights_tour.domain.service.VisitedWays;


public class ControllerMain {
    
    private ViewMain view;
    
    public ControllerMain(ViewMain visao) {
        this.view = visao;
    }
    
    public void clear(){
        this.view.resetAllColors();    	
        this.view.resetCoordinateX();
        this.view.resetCoordinateY();
        this.view.resetVisitedWays();
        
    }
    
    public void closeWindow(){
        if (this.view.requestConfirmation("Deseja finalizar o programa?"))
            this.view.closeWindow();
    }
    
    public void execute() {
        try {
        	DTOLocation DTOinitialLocation = this.view.getInitialLocation();        	
            Location initialLocation 	   = new Location(DTOinitialLocation.getX(), DTOinitialLocation.getY());
            
        	this.view.showWarning("Essa opera��o pode demorar alguns segundos.\n Aproveite para ir tomar um caf� :)");
        	this.view.resetAllColors();            
            this.view.changeInitialLocationColor(initialLocation.toStringClear());
            
            VisitedWays service = new VisitedWays();
            service.buildHierarchy(initialLocation);
            
             this.printDestination(initialLocation, 1);
            
        } catch (LocationOffTheBoardException ex) {
            this.view.showError(ex.getMessage());
        }
    }
    
    public void printDestination(Location parent, Integer level) {
    	if ((parent.getNodes() == null) || (parent.getNodes().isEmpty()))
    		return;
    	
    	for (Location node : parent.getNodes()) {
			this.view.paintDestinationLocationColor(node.toStringClear(), level);
			this.printWays(node, level);
		}
    	
    	for (Location node : parent.getNodes()) {
    		Integer levelNodes = ++level;
			this.printDestination(node, levelNodes);
			this.printWays(node, level);
		}
    }
    
    private void printWays(Location destination, Integer level) {
    	this.view.insertLineBreak();    	
    	this.view.insertLineBreak();
    	this.view.printDestination(destination.toString(), level);
    	this.view.insertLineBreak();
    	this.view.insertLabel();    	
    	
    	Location parent = destination.getParent();
    	
    	while (parent != null) {
    		this.view.printVisitedWay(parent.toString());
    		parent = parent.getParent();
    		
    		if (parent == null)
    			this.view.insertPeriod();
    		else
    			this.view.insertPipe();
		}    	
    }
    
    public void changeInitialColor() {
    	this.view.resetAllColors();
    	this.view.changeInitialLabelColor();
    	
    	DTOLocation DTOInitialLocation = this.view.getInitialLocation();
    	
    	try {
    		Location initialLocation = new Location(DTOInitialLocation.getX(), DTOInitialLocation.getY());
    		this.view.changeInitialLocationColor(initialLocation.toStringClear());
    		
    	} catch(LocationOffTheBoardException ex){}
    	
    }
    
    public void setInitialLocation(String coordinates) {
    	this.clear();
    	
    	String coordinateX = coordinates.substring(1, 2);
    	String coordinateY = coordinates.substring(4); 
    	
    	int x = Integer.parseInt(coordinateX);
    	int y = Integer.parseInt(coordinateY);
    	
    	DTOLocation DTOinitialLocation = new DTOLocation(x, y);
    	this.view.setInitialLocation(DTOinitialLocation);
    	
    	try {
    		Location initialLocation = new Location(x, y);
    		this.view.changeInitialLocationColor(initialLocation.toStringClear());
    	}
    	catch(LocationOffTheBoardException ex){}
    }
}
