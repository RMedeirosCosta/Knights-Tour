package br.edu.uenp.knights_tour.application.view;

import br.edu.uenp.knights_tour.application.dto.DTOLocation;

public interface ViewMain {

	public void changeFinalLabelColor();
	public void changeFinalLocationColor(String coordinateXY);
	public void changeInitialLabelColor();
    public void changeInitialLocationColor(String coordinateXY);
    public void changeToolTipTextLocations(String toolTipText);
	public void closeWindow();
    public DTOLocation getFinalLocation();	
    public DTOLocation getInitialLocation();
    public void insertLabel();
    public void insertLineBreak();
    public void insertPeriod();
    public void insertPipe();
    public void insertSeparator();
    public void paintDestinationLocationColor(String coordinateXY, Integer level);
    public void printDestination(String coordinateXY, Integer level);
    public void printVisitedWay(String coordinateXY);
    public void setFinalLocation(DTOLocation finalLocation);
    public void setInitialLocation(DTOLocation initialLocation);
    public boolean requestConfirmation(String question);
    public void resetAllColors();
    public void resetInitialCoordinateX();
    public void resetInitialCoordinateY();
    public void resetFinalCoordinateX();
    public void resetFinalCoordinateY();
    public void resetVisitedWays();
    public void showError(String errorMessage);    
    public void showWarning(String alertMessage);
}
