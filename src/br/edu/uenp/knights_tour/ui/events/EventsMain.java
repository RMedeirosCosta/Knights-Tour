package br.edu.uenp.knights_tour.ui.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

import br.edu.uenp.knights_tour.application.controller.ControllerMain;

/**
 * @author Ricardo e Lucas -
 *
 * Classe para agrupar todos os listeners (eventos) da janela principal.
 */
public class EventsMain {

	/**
	 * 
	 * @author Ricardo e Lucas -
	 * 
	 * Classe respons�vel pelo evento de teclas pressionadas
	 *
	 */
	public static class MainWindowKeyPressed  extends KeyAdapter {
		private ControllerMain controller;
		
		/**
		 * 
		 * @param controller - Recebe um controlador da janela principal. Utilizar para enviar comandos para as classes
		 * de dom�nio ou para pr�pria vis�o.
		 */
		public MainWindowKeyPressed(ControllerMain controller) {
			this.controller = controller;
		}
		
		@Override
		public void keyPressed(KeyEvent eve) {
			switch (eve.getKeyCode()) {
			
			// Se for pressionado o ESC, � feito a pergunta para finalizar o sistema.
			case KeyEvent.VK_ESCAPE: this.controller.closeWindow();
				break;
			// Se for pressionado a tecla E, ent�o � executado a opera��o.
			case KeyEvent.VK_E: this.controller.execute();
				break;
			// Se for pressionado a tecla L, ent�o � limpado a tela.
			case KeyEvent.VK_L: this.controller.clear();
			}			
		}
	}
	
	/**
	 * 
	 * @author Ricardo e Lucas - 
	 * 
	 * Classe respons�vel pelo evento de fechamento da janela principal.
	 * � feito a pergunta de confirma��o para finalizar o sistema, caso o usu�rio responda N�O, o sistema continua executando
	 *
	 */
	public static class ClosingMainWindow extends WindowAdapter {
		private ControllerMain controller;

		/**
		 * 
		 * @param controller - Recebe um controlador da janela principal. Utilizar para enviar comandos para as classes
		 * de dom�nio ou para pr�pria vis�o.
		 */		
		public ClosingMainWindow(ControllerMain controller) {
			this.controller = controller;
		}
		
		public void windowClosing(WindowEvent eve) {
			this.controller.closeWindow();
		}
	}
	
	/**
	 * 
	 * @author Ricardo e Lucas -
	 * 
	 * Classe respons�vel pelos eventos de clique no r�tulo de cor inicial.
	 * Quando esse evento � dispardo, ent�o � mostrado uma caixa de di�logo para o usu�rio alterar a cor de marca��o
	 * da posi��o inicial.
	 *
	 */
	public static class ChangeInitialColorMouseClicked extends MouseAdapter {
		private ControllerMain controller;
		
		/**
		 * 
		 * @param controller - Recebe um controlador da janela principal. Utilizar para enviar comandos para as classes
		 * de dom�nio ou para pr�pria vis�o.
		 */
		public ChangeInitialColorMouseClicked(ControllerMain controller) {
			this.controller = controller;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			this.controller.changeInitialColor();
		}
	}
	
	/**
	 * 
	 * @author Ricardo e Lucas - 
	 * 
	 * Classe respons�vel pelos eventos de clique no r�tulo de cor final.
	 * Quando esse evento � dispardo, ent�o � mostrado uma caixa de di�logo para o usu�rio alterar a cor de marca��o
	 * da posi��o final.
	 *
	 */
	public static class ChangeFinalColorMouseClicked extends MouseAdapter {
		private ControllerMain controller;
		
		/**
		 * 
		 * @param controller - Recebe um controlador da janela principal. Utilizar para enviar comandos para as classes
		 * de dom�nio ou para pr�pria vis�o.
		 */
		public ChangeFinalColorMouseClicked(ControllerMain controller) {
			this.controller = controller;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			this.controller.changeFinalColor();
		}
	}
	
	/**
	* 
	*@author Ricardo e Lucas -
	*
	* Classe respons�vel pelos eventos de a��o dos bot�es das posi��es do tabuleio.
	*
	*/
	public static class LocationActionPerformed implements ActionListener {
		private ControllerMain controller;
		
		/**
		 * 
		 * @param controller - Recebe um controlador da janela principal. Utilizar para enviar comandos para as classes
		 * de dom�nio ou para pr�pria vis�o.
		 */
		public LocationActionPerformed(ControllerMain controller) {
			this.controller = controller;			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			
			this.controller.setLocation(btn.getText());
		}
	}
	
	/**
	 * 
	 * @author Ricardo e Lucas -
	 *
	 * Classe respons�vel pelo evento de a��o do bot�o de ajuda.
	 *
	 */
	public static class HelpActionPerformed implements ActionListener {
		private ControllerMain controller;
		
		/**
		 * 
		 * @param controller - Recebe um controlador da janela principal. Utilizar para enviar comandos para as classes
		 * de dom�nio ou para pr�pria vis�o.
		 */
		public HelpActionPerformed(ControllerMain controller) {
			this.controller = controller;			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			this.controller.showHelp();
		}
	}	
	
	/**
	 * 
	 * @author Ricardo e Lucas -
	 * 
	 * Classe respons�vel pelo evento de a��o do bot�o limpar.
	 *
	 */
	public static class ClearActionPerformed implements ActionListener {
		
		private ControllerMain controller;
		
		/**
		 * 
		 * @param controller - Recebe um controlador da janela principal. Utilizar para enviar comandos para as classes
		 * de dom�nio ou para pr�pria vis�o.
		 */		
		public ClearActionPerformed(ControllerMain controller) {
			this.controller = controller;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			this.controller.clear();
		}
		
	}
	
	/**
	 * 
	 * @author Ricardo e Lucas -
	 * 
	 * Classe respons�vel pelo evento de a��o do bot�o executar.
	 *
	 */
	public static class ExecuteActionPerformed implements ActionListener {
		private ControllerMain controller;
		
		/**
		 * 
		 * @param controller - Recebe um controlador da janela principal. Utilizar para enviar comandos para as classes
		 * de dom�nio ou para pr�pria vis�o.
		 */
		public ExecuteActionPerformed(ControllerMain controller) {
			this.controller = controller;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			this.controller.execute();
		}
	}
}
