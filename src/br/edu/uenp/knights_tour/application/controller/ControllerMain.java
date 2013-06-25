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
        this.view.setVisibleLabelVisitedWays(false);
        this.view.setVisiblePanelDestinationsColor(false);
    }
    
    public void closeWindow(){
        if (this.view.requestConfirmation("Deseja finalizar o programa?"))
            this.view.closeWindow();
    }
    
    private String getInformationMessage(boolean finalLocationExists) {
    	if (finalLocationExists)
    		return "Essa operação pode demorar alguns segundos - aproveite para tomar um café :D - \n"+
		  	  	   "pois serão calculados todos os possíveis movimentos e serão pintados os caminhos\n"+
		           "percorridos para cada movimento. O tabuleiro pode ficar muito colorido e se \n"+
		           "tornar confuso. Para isso utilize o log de caminhos percorridos abaixo e o\n"+
		           "painel com a identificação de cada cor conforme seu nível hierárquico.";
    	else
    		return "O objetivo não é trazer o melhor caminho e sim o primeiro que for encontrado.";
    }
    
    private void showDestinationVisitedWays(Location destination) {
    	this.view.setVisibleLabelVisitedWays(true);
    	this.view.changeFinalLocationColor(destination.toStringClear());
    	this.printWays(destination, EMPTY_LEVEL);
    	this.paintVisitedWays(destination);    	
    }
    
    public void execute() {
        try {
        	// Instancio a posição inicial (Caso não exista no tabuleiro é lançado uma exceção        	
        	DTOLocation DTOinitialLocation = this.view.getInitialLocation();        	
            Location initialLocation 	   = new Location(DTOinitialLocation.getX(), DTOinitialLocation.getY());

            // Instancio a posição final. (Caso não exista, é retornado todas as posições possíveis.
        	DTOLocation DTOfinalLocation;
        	Location finalLocation;
            
            try {
            	DTOfinalLocation = this.view.getFinalLocation();
            	finalLocation	     = new Location(DTOfinalLocation.getX(), DTOfinalLocation.getY());
            } catch(LocationOffTheBoardException ex) {
            	finalLocation = null;
            }
            
            // Mostro para o usuário a mensagem de acordo com a opção que ele escolheu. (Com posição de destino ou sem)
            this.view.showInformation(this.getInformationMessage((finalLocation == null)));
            
            // Limpo todas as cores
        	this.view.resetAllColors();
        	
        	// Altero a cor da posição inicial
            this.view.changeInitialLocationColor(initialLocation.toStringClear());
            
            // Instâncio o serviço que cria a hirearquia de caminhos possíveis 
            VisitedWays service = new VisitedWays();
            
            // Se foi determinado uma posição de destino, ela é passada para o serviço.
            service.setDestination(finalLocation);
            
            try {
            	// Chamo o método que cria a hierarquia do posição inicial
            	service.buildHierarchy(initialLocation);
            	
            /** Caso tenha sido passado uma posição de destino e a mesma for encontrada, a exceção vai ser capturada
             * nesse catch. Então vai ser exibido o caminho apenas do destino.
             */
            } catch(DestinationLocationFound ex) {
            	// Chama método que imprime os caminhos visitados do destino e finaliza o método execute
            	this.showDestinationVisitedWays(ex.getDestination());
            	return;
            }
            
            // Habilito o painel de cores dos níveis
            this.view.setVisiblePanelDestinationsColor(true);
            
            // E chamo o método que imprime na tela recursivamente todos os caminhos possíveis
            this.printDestination(initialLocation, 1);
            
        } catch (LocationOffTheBoardException ex) {
            this.view.showError(ex.getMessage());
        }
    }
    
    // Pinta as posições na tela. De cima para baixo na hierarquia
    private void paintVisitedWays(Location destination) {
    	Location parent = destination.getParent();
    	Location aux;

    	while (parent != null) {
			this.view.paintVisitedWayLocationColor(parent.toStringClear());
			parent = parent.getParent();
			
			// Verificações necessárias para não se pintar a posição inicial
			if (parent != null) {
				aux = parent.getParent();
				
				if (aux == null)
					return;
			}
		}
    }
    
    // Imprime recursivamente na tela todas as posições possíveis - ISSO CAUSA UMA GRANDE CONFUSÃO DE CORES NO TABULEIRO 
    // HEHEHE =-D
    private void printDestination(Location parent, Integer level) {
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
    
    // Imprime no log os caminhso percorridos de terminado destino 
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
    
    // Altera cor da posição inicial
    public void changeInitialColor() {
    	this.view.resetAllColors();
    	this.view.changeInitialLabelColor();
    	
    	DTOLocation DTOInitialLocation = this.view.getInitialLocation();
    	
    	try {
    		Location initialLocation = new Location(DTOInitialLocation.getX(), DTOInitialLocation.getY());
    		this.view.changeInitialLocationColor(initialLocation.toStringClear());
    		
    	} catch(LocationOffTheBoardException ex){}
    	
    }

    // Altera cor da posição final    
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
    
    /**
     *  Método que altera a posição conforme com a necessida.
     *  Por exemplo: Se já foi selecionado a posição inicial, então será pintado a posição final. Além disso,
     *  são alterados os toolTipTexts dos botões.
     *  
     * @param coordinates - Coordenadas da posição alterada
     */
    
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
    
    public void showHelp() {
    	final String HELP = "DICAS: \n\n"+
    						 "1º - Clique em uma posição no tabuleiro para determinar uma posição inicial.\n"+
    						 "2º - Se você quiser determinar uma posição final, clique novamente em outra posição.\n"+
    						 "3º - Para alterar as cores de marcação das posições, basta clicar nos respectivos rótulos.\n"+
    						 "4º - Após executar a operação, basta selecionar outra posição inicial ou clicar em \"Limpar\"\n\n\n"+
    						 "Para mais informações sobre o código fonte, consulte: Knights-Tour\\doc\\index.html";
    	
    	this.view.showInformation(HELP);
    }
}
