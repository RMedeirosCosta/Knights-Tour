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
	 * Classe responsável pelo evento de teclas pressionadas
	 *
	 */
	public static class MainWindowKeyPressed  extends KeyAdapter {
		private ControllerMain controller;
		
		/**
		 * 
		 * @param controller - Recebe um controlador da janela principal. Utilizar para enviar comandos para as classes
		 * de domínio ou para própria visão.
		 */
		public MainWindowKeyPressed(ControllerMain controller) {
			this.controller = controller;
		}
		
		@Override
		public void keyPressed(KeyEvent eve) {
			switch (eve.getKeyCode()) {
			
			// Se for pressionado o ESC, é feito a pergunta para finalizar o sistema.
			case KeyEvent.VK_ESCAPE: this.controller.closeWindow();
				break;
			// Se for pressionado a tecla E, então é executado a operação.
			case KeyEvent.VK_E: this.controller.execute();
				break;
			// Se for pressionado a tecla L, então é limpado a tela.
			case KeyEvent.VK_L: this.controller.clear();
			}			
		}
	}
	
	/**
	 * 
	 * @author Ricardo e Lucas - 
	 * 
	 * Classe responsável pelo evento de fechamento da janela principal.
	 * É feito a pergunta de confirmação para finalizar o sistema, caso o usuário responda NÃO, o sistema continua executando
	 *
	 */
	public static class ClosingMainWindow extends WindowAdapter {
		private ControllerMain controller;

		/**
		 * 
		 * @param controller - Recebe um controlador da janela principal. Utilizar para enviar comandos para as classes
		 * de domínio ou para própria visão.
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
	 * Classe responsável pelos eventos de clique no rótulo de cor inicial.
	 * Quando esse evento é dispardo, então é mostrado uma caixa de diálogo para o usuário alterar a cor de marcação
	 * da posição inicial.
	 *
	 */
	public static class ChangeInitialColorMouseClicked extends MouseAdapter {
		private ControllerMain controller;
		
		/**
		 * 
		 * @param controller - Recebe um controlador da janela principal. Utilizar para enviar comandos para as classes
		 * de domínio ou para própria visão.
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
	 * Classe responsável pelos eventos de clique no rótulo de cor final.
	 * Quando esse evento é dispardo, então é mostrado uma caixa de diálogo para o usuário alterar a cor de marcação
	 * da posição final.
	 *
	 */
	public static class ChangeFinalColorMouseClicked extends MouseAdapter {
		private ControllerMain controller;
		
		/**
		 * 
		 * @param controller - Recebe um controlador da janela principal. Utilizar para enviar comandos para as classes
		 * de domínio ou para própria visão.
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
	* Classe responsável pelos eventos de ação dos botões das posições do tabuleio.
	*
	*/
	public static class LocationActionPerformed implements ActionListener {
		private ControllerMain controller;
		
		/**
		 * 
		 * @param controller - Recebe um controlador da janela principal. Utilizar para enviar comandos para as classes
		 * de domínio ou para própria visão.
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
	 * Classe responsável pelo evento de ação do botão de ajuda.
	 *
	 */
	public static class HelpActionPerformed implements ActionListener {
		private ControllerMain controller;
		
		/**
		 * 
		 * @param controller - Recebe um controlador da janela principal. Utilizar para enviar comandos para as classes
		 * de domínio ou para própria visão.
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
	 * Classe responsável pelo evento de ação do botão limpar.
	 *
	 */
	public static class ClearActionPerformed implements ActionListener {
		
		private ControllerMain controller;
		
		/**
		 * 
		 * @param controller - Recebe um controlador da janela principal. Utilizar para enviar comandos para as classes
		 * de domínio ou para própria visão.
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
	 * Classe responsável pelo evento de ação do botão executar.
	 *
	 */
	public static class ExecuteActionPerformed implements ActionListener {
		private ControllerMain controller;
		
		/**
		 * 
		 * @param controller - Recebe um controlador da janela principal. Utilizar para enviar comandos para as classes
		 * de domínio ou para própria visão.
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
