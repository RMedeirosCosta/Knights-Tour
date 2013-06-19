package br.edu.uenp.knights_tour.domain.exception;

@SuppressWarnings("serial")
public class LocationOffTheBoardException extends Exception {
    
	public LocationOffTheBoardException(){
        super("Posição inexistente dentro do tabuleiro!");
    }
}
