package br.edu.uenp.knights_tour.application.view;

import br.edu.uenp.knights_tour.application.dto.DTOLocation;

public interface ViewMain {

	public void addInitialLocation(String initialLocation);
    public void addPossibleDestination(String destinoPossivel);
    public void clearPossibleDestinations();    
    public void closeWindow();
    public void changeInitialLabelColor();
    public void changeInitialLocationColor(String coordinateXY);
    public DTOLocation getInitialLocation();
    public void paintDestinationLocationColor(String coordinateXY, Integer level);    
    public void setInitialLocation(DTOLocation initialLocation);
    public void uncheckVisitedWays();
    public boolean requestConfirmation(String mensagem);
    public void resetAllColors();
    public void resetCoordinateX();
    public void resetCoordinateY();    
    public void showError(String mensagemDeErro);
}
