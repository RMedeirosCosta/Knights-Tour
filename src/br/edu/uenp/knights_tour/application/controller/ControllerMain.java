package br.edu.uenp.knights_tour.application.controller;

import br.edu.uenp.knights_tour.application.dto.DTOLocation;
import br.edu.uenp.knights_tour.application.kind.EnumLocationSelection;
import br.edu.uenp.knights_tour.application.view.ViewMain;
import br.edu.uenp.knights_tour.domain.entity.Location;
import br.edu.uenp.knights_tour.domain.exception.DestinationLocationFound;
import br.edu.uenp.knights_tour.domain.exception.LocationOffTheBoardException;
import br.edu.uenp.knights_tour.domain.service.VisitedWays;


public class ControllerMain {
    
    private ViewMain 			  view;
    private EnumLocationSelection currentLocation;
    private final Integer EMPTY_LEVEL = 0;
    
    public ControllerMain(ViewMain visao) {
        this.view 			 = visao;
        this.currentLocation = EnumLocationSelection.NONE;
    }
    
    public void clear(){
        this.view.resetAllColors();    	
        this.view.resetInitialCoordinateX();
        this.view.resetInitialCoordinateY();
        this.view.resetFinalCoordinateX();
        this.view.resetFinalCoordinateY();
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

        	DTOLocation DTOfinalLocation;
        	Location finalLocation;
            
            try {
            	DTOfinalLocation = this.view.getFinalLocation();
            	finalLocation	     = new Location(DTOfinalLocation.getX(), DTOfinalLocation.getY());
            } catch(LocationOffTheBoardException ex) {
            	finalLocation = null;
            }
            
        	this.view.showWarning("Essa operação pode demorar alguns segundos.\n Aproveite para ir tomar um café :)");
        	this.view.resetAllColors();            
            this.view.changeInitialLocationColor(initialLocation.toStringClear());
            
            VisitedWays service = new VisitedWays();
            service.setDestination(finalLocation);
            
            try {
            	service.buildHierarchy(initialLocation);
            } catch(DestinationLocationFound ex) {
            	this.view.changeFinalLocationColor(ex.getDestination().toStringClear());
            	this.printWays(ex.getDestination(), EMPTY_LEVEL);
            	return;
            }
            
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
    	
    	if (level != EMPTY_LEVEL) 
    		this.view.printDestination(destination.toString(), level);
    	else
    		this.view.printDestination(destination.toString());
    	
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
    
    public void changeFinalColor() {
    	this.view.changeFinalLabelColor();
    	
    	DTOLocation dtoFinalColor = this.view.getFinalLocation();
    	
    	try {
    		Location finalLocation = new Location(dtoFinalColor.getX(), dtoFinalColor.getY());
    		this.view.changeFinalLocationColor(finalLocation.toStringClear());
    		
    	} catch(LocationOffTheBoardException ex){}
    }
    
    private void setInitialLocation(String coordinates) {
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
    
    public void setLocation(String coordinates) {
    	final String INITIAL_LOCATION = "Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.";
    	final String FINAL_LOCATION   = "Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o final.";
    	
    	switch (this.currentLocation) {
    	
			case NONE: 
				this.setInitialLocation(coordinates);
				this.currentLocation = EnumLocationSelection.INITIAL;
				this.view.changeToolTipTextLocations(FINAL_LOCATION);
			break;
				
			case INITIAL: 
				this.setFinalLocation(coordinates);		
				this.currentLocation = EnumLocationSelection.FINAL;
				this.view.changeToolTipTextLocations(INITIAL_LOCATION);				
			break;
			
			case FINAL: 
				this.setInitialLocation(coordinates);
				this.currentLocation = EnumLocationSelection.INITIAL;
				this.view.changeToolTipTextLocations(FINAL_LOCATION);
			break;			
		}
    }
    
    private void setFinalLocation(String coordinates) {
    	String coordinateX = coordinates.substring(1, 2);
    	String coordinateY = coordinates.substring(4); 
    	
    	int x = Integer.parseInt(coordinateX);
    	int y = Integer.parseInt(coordinateY);
    	
    	DTOLocation DTOfinalLocation = new DTOLocation(x, y);
    	this.view.setFinalLocation(DTOfinalLocation);
    	
    	try {
    		Location finalLocation = new Location(x, y);
    		this.view.changeFinalLocationColor(finalLocation.toStringClear());
    	}
    	catch(LocationOffTheBoardException ex){}
    }    
}
