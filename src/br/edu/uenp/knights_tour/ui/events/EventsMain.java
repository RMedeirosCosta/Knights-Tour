package br.edu.uenp.knights_tour.ui.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import br.edu.uenp.knights_tour.application.controller.ControllerMain;

public class EventsMain {
	
	public static class CloseWindowKeyPressed  extends KeyAdapter {
		private ControllerMain controller;
		
		public CloseWindowKeyPressed(ControllerMain controller) {
			this.controller = controller;
		}
		
		@Override
		public void keyPressed(KeyEvent eve) {
			if (eve.getKeyCode() == KeyEvent.VK_ESCAPE)
				this.controller.closeWindow();
		}
	}
	
	public static class ChangeInitialColorMouseClicked extends MouseAdapter {
		private ControllerMain controller;
		
		public ChangeInitialColorMouseClicked(ControllerMain controller) {
			this.controller = controller;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			this.controller.changeInitialColor();
		}
	}
	
	public static class LocationActionPerformed implements ActionListener {
		private ControllerMain controller;
		
		public LocationActionPerformed(ControllerMain controller) {
			this.controller = controller;			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			
			this.controller.setInitialLocation(btn.getText());
		}
	}
	
	public static class ClearActionPerformed implements ActionListener {
		
		private ControllerMain controller;
		
		public ClearActionPerformed(ControllerMain controller) {
			this.controller = controller;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			this.controller.clear();
		}
		
	}
	
	public static class ExecuteActionPerformed implements ActionListener {
		private ControllerMain controller;
		
		public ExecuteActionPerformed(ControllerMain controller) {
			this.controller = controller;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			this.controller.execute();
		}
	}
}
