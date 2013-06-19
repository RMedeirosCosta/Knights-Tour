package br.edu.uenp.knights_tour;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import br.edu.uenp.knights_tour.ui.WindowMain;

public class KnightSTour {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(javax.swing.UIManager.getInstalledLookAndFeels()[4].getClassName());
        
        WindowMain mainWindow = new WindowMain();
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
    }
}
