package br.edu.uenp.knights_tour.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import br.edu.uenp.knights_tour.application.controller.*;
import br.edu.uenp.knights_tour.application.dto.DTOLocation;
import br.edu.uenp.knights_tour.application.view.ViewMain;
import br.edu.uenp.knights_tour.ui.events.EventsMain;

@SuppressWarnings("serial")
public class WindowMain extends javax.swing.JFrame implements ViewMain {
    private JButton btnExecute;
    private JButton btnClear;
    private JButton btnLocationX1Y1;
    private JButton btnLocationX1Y2;
    private JButton btnLocationX1Y3;
    private JButton btnLocationX1Y4;
    private JButton btnLocationX1Y5;
    private JButton btnLocationX1Y6;
    private JButton btnLocationX1Y7;
    private JButton btnLocationX1Y8;
    private JButton btnLocationX2Y1;
    private JButton btnLocationX2Y2;
    private JButton btnLocationX2Y3;
    private JButton btnLocationX2Y4;
    private JButton btnLocationX2Y5;
    private JButton btnLocationX2Y6;
    private JButton btnLocationX2Y7;
    private JButton btnLocationX2Y8;
    private JButton btnLocationX3Y1;
    private JButton btnLocationX3Y2;
    private JButton btnLocationX3Y3;
    private JButton btnLocationX3Y4;
    private JButton btnLocationX3Y5;
    private JButton btnLocationX3Y6;
    private JButton btnLocationX3Y7;
    private JButton btnLocationX3Y;
    private JButton btnLocationX4Y1;
    private JButton btnLocationX4Y2;
    private JButton btnLocationX4Y3;
    private JButton btnLocationX4Y4;
    private JButton btnLocationX4Y5;
    private JButton btnLocationX4Y6;
    private JButton btnLocationX4Y7;
    private JButton btnLocationX4Y8;
    private JButton btnLocationX5Y1;
    private JButton btnLocationX5Y2;
    private JButton btnLocationX5Y3;
    private JButton btnLocationX5Y4;
    private JButton btnLocationX5Y5;
    private JButton btnLocationX5Y6;
    private JButton btnLocationX5Y7;
    private JButton btnLocationX5Y8;
    private JButton btnLocationX6Y1;
    private JButton btnLocationX6Y2;
    private JButton btnLocationX6Y3;
    private JButton btnLocationX6Y4;
    private JButton btnLocationX6Y5;
    private JButton btnLocationX6Y6;
    private JButton btnLocationX6Y7;
    private JButton btnLocationX6Y8;
    private JButton btnLocationX7Y1;
    private JButton btnLocationX7Y2;
    private JButton btnLocationX7Y3;
    private JButton btnLocationX7Y4;
    private JButton btnLocationX7Y5;
    private JButton btnLocationX7Y6;
    private JButton btnLocationX7Y7;
    private JButton btnLocationX7Y8;
    private JButton btnLocationX8Y1;
    private JButton btnLocationX8Y2;
    private JButton btnLocationX8Y3;
    private JButton btnLocationX8Y4;
    private JButton btnLocationX8Y5;
    private JButton btnLocationX8Y6;
    private JButton btnLocationX8Y7;
    private JButton btnLocationX8Y8;
    private JCheckBox chkShowVisitedWays;
    private JSpinner edtCoordinateX;
    private JSpinner edtCoordinateY;
    private JTextArea edtPossibleDestinations;
    private JLabel lblCoordinateX;
    private JLabel lblCoordinateY;
    private JLabel lblPoweredBy;
    private JLabel lblX;
    private JLabel lblX1;
    private JLabel lblX2;
    private JLabel lblX3;
    private JLabel lblX4;
    private JLabel lblX5;
    private JLabel lblX6;
    private JLabel lblX7;
    private JLabel lblX8;
    private JLabel lblY;
    private JLabel lblY1;
    private JLabel lblY2;
    private JLabel lblY3;
    private JLabel lblY4;
    private JLabel lblY5;
    private JLabel lblY6;
    private JLabel lblY7;
    private JLabel lblY8;
    private JPanel pnlPossibleDestinations;
    private JPanel pnlInitialLocation;
    private JPanel pnlTable;
    private JScrollPane scrPossibleDestinations;
    private JSeparator sepX;
    private JSeparator sepY;

    private ControllerMain controller;
    private JLabel lblInitialColor;
    private Map<String, Color> colorStorage;
    
    public WindowMain() {
        this.controller = new ControllerMain(this);        
        this.initComponents();        
        this.setListeners();
        this.colorStorage = new HashMap<>();
        
        for (Component component: this.pnlTable.getComponents()) {
        	if (!(component instanceof JButton))
        		continue;
        	
        	JButton btn = (JButton) component;
        	
			 this.colorStorage.put(btn.getText(), btn.getBackground()); 
		}
    }    
                              
    private void initComponents() {
        pnlTable = new JPanel();
        btnLocationX1Y1 = new JButton();
        btnLocationX2Y1 = new JButton();
        btnLocationX3Y1 = new JButton();
        btnLocationX4Y1 = new JButton();
        btnLocationX5Y1 = new JButton();
        btnLocationX6Y1 = new JButton();
        btnLocationX7Y1 = new JButton();
        btnLocationX8Y1 = new JButton();
        btnLocationX1Y2 = new JButton();
        btnLocationX2Y2 = new JButton();
        btnLocationX3Y2 = new JButton();
        btnLocationX4Y2 = new JButton();
        btnLocationX5Y2 = new JButton();
        btnLocationX6Y2 = new JButton();
        btnLocationX7Y2 = new JButton();
        btnLocationX8Y2 = new JButton();
        btnLocationX1Y3 = new JButton();
        btnLocationX2Y3 = new JButton();
        btnLocationX3Y3 = new JButton();
        btnLocationX4Y3 = new JButton();
        btnLocationX5Y3 = new JButton();
        btnLocationX6Y3 = new JButton();
        btnLocationX7Y3 = new JButton();
        btnLocationX8Y3 = new JButton();
        btnLocationX1Y4 = new JButton();
        btnLocationX2Y4 = new JButton();
        btnLocationX3Y4 = new JButton();
        btnLocationX4Y4 = new JButton();
        btnLocationX5Y4 = new JButton();
        btnLocationX6Y4 = new JButton();
        btnLocationX7Y4 = new JButton();
        btnLocationX8Y4 = new JButton();
        btnLocationX1Y5 = new JButton();
        btnLocationX2Y5 = new JButton();
        btnLocationX3Y5 = new JButton();
        btnLocationX4Y5 = new JButton();
        btnLocationX5Y5 = new JButton();
        btnLocationX6Y5 = new JButton();
        btnLocationX7Y5 = new JButton();
        btnLocationX8Y5 = new JButton();
        btnLocationX1Y6 = new JButton();
        btnLocationX2Y6 = new JButton();
        btnLocationX3Y6 = new JButton();
        btnLocationX4Y6 = new JButton();
        btnLocationX5Y6 = new JButton();
        btnLocationX6Y6 = new JButton();
        btnLocationX7Y6 = new JButton();
        btnLocationX8Y6 = new JButton();
        btnLocationX1Y7 = new JButton();
        btnLocationX2Y7 = new JButton();
        btnLocationX3Y7 = new JButton();
        btnLocationX4Y7 = new JButton();
        btnLocationX5Y7 = new JButton();
        btnLocationX6Y7 = new JButton();
        btnLocationX7Y7 = new JButton();
        btnLocationX8Y7 = new JButton();
        btnLocationX1Y8 = new JButton();
        btnLocationX2Y8 = new JButton();
        btnLocationX3Y = new JButton();
        btnLocationX4Y8 = new JButton();
        btnLocationX5Y8 = new JButton();
        btnLocationX6Y8 = new JButton();
        btnLocationX7Y8 = new JButton();
        btnLocationX8Y8 = new JButton();
        
        sepX = new JSeparator();
        lblX1 = new JLabel();
        lblX2 = new JLabel();
        lblX3 = new JLabel();
        lblX4 = new JLabel();
        lblX5 = new JLabel();
        lblX6 = new JLabel();
        lblX7 = new JLabel();
        lblX8 = new JLabel();
        lblX = new JLabel();
        sepY = new JSeparator();
        lblY = new JLabel();
        lblY1 = new JLabel();
        lblY2 = new JLabel();
        lblY3 = new JLabel();
        lblY4 = new JLabel();
        lblY5 = new JLabel();
        lblY6 = new JLabel();
        lblY7 = new JLabel();
        lblY8 = new JLabel();
        pnlPossibleDestinations = new JPanel();
        pnlInitialLocation = new JPanel();
        lblCoordinateX = new JLabel();
        lblCoordinateY = new JLabel();
        edtCoordinateX = new JSpinner(new SpinnerNumberModel(0, 0, 8, 1));
        edtCoordinateY = new JSpinner(new SpinnerNumberModel(0, 0, 8, 1));        
        btnClear = new JButton();
        btnExecute = new JButton();
        chkShowVisitedWays = new JCheckBox();
        scrPossibleDestinations = new JScrollPane();
        edtPossibleDestinations = new JTextArea();
        lblPoweredBy = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caminho do Cavalo no Tabuleiro do Xadrez - 7.8 . Trabalho Final TAC");
        setName("frameJanelaPrincipal");

        pnlTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlTable.setEnabled(false);

        btnLocationX1Y1.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX1Y1.setText("x1 y1");
        btnLocationX1Y1.setFocusable(false);
        btnLocationX1Y1.setSelected(true);

        btnLocationX2Y1.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX2Y1.setText("x2 y1");
        btnLocationX2Y1.setFocusable(false);

        btnLocationX3Y1.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX3Y1.setText("x3 y1");
        btnLocationX3Y1.setFocusable(false);
        btnLocationX3Y1.setSelected(true);

        btnLocationX4Y1.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX4Y1.setText("x4 y1");
        btnLocationX4Y1.setFocusable(false);

        btnLocationX5Y1.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX5Y1.setText("x5 y1");
        btnLocationX5Y1.setFocusable(false);
        btnLocationX5Y1.setSelected(true);

        btnLocationX6Y1.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX6Y1.setText("x6 y1");
        btnLocationX6Y1.setFocusable(false);

        btnLocationX7Y1.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX7Y1.setText("x7 y1");
        btnLocationX7Y1.setFocusable(false);
        btnLocationX7Y1.setSelected(true);

        btnLocationX8Y1.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX8Y1.setText("x8 y1");
        btnLocationX8Y1.setFocusable(false);

        btnLocationX1Y2.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX1Y2.setText("x1 y2");
        btnLocationX1Y2.setFocusable(false);

        btnLocationX2Y2.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX2Y2.setText("x2 y2");
        btnLocationX2Y2.setFocusable(false);
        btnLocationX2Y2.setSelected(true);

        btnLocationX3Y2.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX3Y2.setText("x3 y2");
        btnLocationX3Y2.setFocusable(false);

        btnLocationX4Y2.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX4Y2.setText("x4 y2");
        btnLocationX4Y2.setFocusable(false);
        btnLocationX4Y2.setSelected(true);

        btnLocationX5Y2.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX5Y2.setText("x5 y2");
        btnLocationX5Y2.setFocusable(false);

        btnLocationX6Y2.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX6Y2.setText("x6 y2");
        btnLocationX6Y2.setFocusable(false);
        btnLocationX6Y2.setSelected(true);

        btnLocationX7Y2.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX7Y2.setText("x7 y2");
        btnLocationX7Y2.setFocusable(false);

        btnLocationX8Y2.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX8Y2.setText("x8 y2");
        btnLocationX8Y2.setFocusable(false);
        btnLocationX8Y2.setSelected(true);

        btnLocationX1Y3.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX1Y3.setText("x1 y3");
        btnLocationX1Y3.setFocusable(false);
        btnLocationX1Y3.setSelected(true);

        btnLocationX2Y3.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX2Y3.setText("x2 y3");
        btnLocationX2Y3.setFocusable(false);

        btnLocationX3Y3.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX3Y3.setText("x3 y3");
        btnLocationX3Y3.setFocusable(false);
        btnLocationX3Y3.setSelected(true);

        btnLocationX4Y3.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX4Y3.setText("x4 y3");
        btnLocationX4Y3.setFocusable(false);

        btnLocationX5Y3.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX5Y3.setText("x5 y3");
        btnLocationX5Y3.setFocusable(false);
        btnLocationX5Y3.setSelected(true);

        btnLocationX6Y3.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX6Y3.setText("x6 y3");
        btnLocationX6Y3.setFocusable(false);

        btnLocationX7Y3.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX7Y3.setText("x7 y3");
        btnLocationX7Y3.setFocusable(false);
        btnLocationX7Y3.setSelected(true);

        btnLocationX8Y3.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX8Y3.setText("x8 y3");
        btnLocationX8Y3.setFocusable(false);

        btnLocationX1Y4.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX1Y4.setText("x1 y4");
        btnLocationX1Y4.setFocusable(false);

        btnLocationX2Y4.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX2Y4.setText("x2 y4");
        btnLocationX2Y4.setFocusable(false);
        btnLocationX2Y4.setSelected(true);

        btnLocationX3Y4.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX3Y4.setText("x3 y4");
        btnLocationX3Y4.setFocusable(false);

        btnLocationX4Y4.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX4Y4.setText("x4 y4");
        btnLocationX4Y4.setFocusable(false);
        btnLocationX4Y4.setSelected(true);

        btnLocationX5Y4.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX5Y4.setText("x5 y4");
        btnLocationX5Y4.setFocusable(false);

        btnLocationX6Y4.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX6Y4.setText("x6 y4");
        btnLocationX6Y4.setFocusable(false);
        btnLocationX6Y4.setSelected(true);

        btnLocationX7Y4.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX7Y4.setText("x7 y4");
        btnLocationX7Y4.setFocusable(false);

        btnLocationX8Y4.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX8Y4.setText("x8 y4");
        btnLocationX8Y4.setFocusable(false);
        btnLocationX8Y4.setSelected(true);

        btnLocationX1Y5.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX1Y5.setText("x1 y5");
        btnLocationX1Y5.setFocusable(false);
        btnLocationX1Y5.setSelected(true);

        btnLocationX2Y5.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX2Y5.setText("x2 y5");
        btnLocationX2Y5.setFocusable(false);

        btnLocationX3Y5.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX3Y5.setText("x3 y5");
        btnLocationX3Y5.setFocusable(false);
        btnLocationX3Y5.setSelected(true);

        btnLocationX4Y5.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX4Y5.setText("x4 y5");
        btnLocationX4Y5.setFocusable(false);

        btnLocationX5Y5.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX5Y5.setText("x5 y5");
        btnLocationX5Y5.setFocusable(false);
        btnLocationX5Y5.setSelected(true);

        btnLocationX6Y5.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX6Y5.setText("x6 y5");
        btnLocationX6Y5.setFocusable(false);

        btnLocationX7Y5.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX7Y5.setText("x7 y5");
        btnLocationX7Y5.setFocusable(false);
        btnLocationX7Y5.setSelected(true);

        btnLocationX8Y5.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX8Y5.setText("x8 y5");
        btnLocationX8Y5.setFocusable(false);

        btnLocationX1Y6.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX1Y6.setText("x1 y6");
        btnLocationX1Y6.setFocusable(false);

        btnLocationX2Y6.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX2Y6.setText("x2 y6");
        btnLocationX2Y6.setFocusable(false);
        btnLocationX2Y6.setSelected(true);

        btnLocationX3Y6.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX3Y6.setText("x3 y6");
        btnLocationX3Y6.setFocusable(false);

        btnLocationX4Y6.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX4Y6.setText("x4 y6");
        btnLocationX4Y6.setFocusable(false);
        btnLocationX4Y6.setSelected(true);

        btnLocationX5Y6.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX5Y6.setText("x5 y6");
        btnLocationX5Y6.setFocusable(false);

        btnLocationX6Y6.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX6Y6.setText("x6 y6");
        btnLocationX6Y6.setFocusable(false);
        btnLocationX6Y6.setSelected(true);

        btnLocationX7Y6.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX7Y6.setText("x7 y6");
        btnLocationX7Y6.setFocusable(false);

        btnLocationX8Y6.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX8Y6.setText("x8 y6");
        btnLocationX8Y6.setFocusable(false);
        btnLocationX8Y6.setSelected(true);

        btnLocationX1Y7.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX1Y7.setText("x1 y7");
        btnLocationX1Y7.setFocusable(false);
        btnLocationX1Y7.setSelected(true);

        btnLocationX2Y7.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX2Y7.setText("x2 y7");
        btnLocationX2Y7.setFocusable(false);

        btnLocationX3Y7.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX3Y7.setText("x3 y7");
        btnLocationX3Y7.setFocusable(false);
        btnLocationX3Y7.setSelected(true);

        btnLocationX4Y7.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX4Y7.setText("x4 y7");
        btnLocationX4Y7.setFocusable(false);

        btnLocationX5Y7.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX5Y7.setText("x5 y7");
        btnLocationX5Y7.setFocusable(false);
        btnLocationX5Y7.setSelected(true);

        btnLocationX6Y7.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX6Y7.setText("x6 y7");
        btnLocationX6Y7.setFocusable(false);

        btnLocationX7Y7.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX7Y7.setText("x7 y7");
        btnLocationX7Y7.setFocusable(false);
        btnLocationX7Y7.setSelected(true);

        btnLocationX8Y7.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX8Y7.setText("x8 y7");
        btnLocationX8Y7.setFocusable(false);

        btnLocationX1Y8.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX1Y8.setText("x1 y8");
        btnLocationX1Y8.setFocusable(false);
        btnLocationX1Y8.setName(""); // NOI18N

        btnLocationX2Y8.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX2Y8.setText("x2 y8");
        btnLocationX2Y8.setFocusable(false);
        btnLocationX2Y8.setSelected(true);

        btnLocationX3Y.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX3Y.setText("x3 y8");
        btnLocationX3Y.setFocusable(false);

        btnLocationX4Y8.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX4Y8.setText("x4 y8");
        btnLocationX4Y8.setFocusable(false);
        btnLocationX4Y8.setSelected(true);

        btnLocationX5Y8.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX5Y8.setText("x5 y8");
        btnLocationX5Y8.setFocusable(false);

        btnLocationX6Y8.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX6Y8.setText("x6 y8");
        btnLocationX6Y8.setFocusable(false);
        btnLocationX6Y8.setSelected(true);

        btnLocationX7Y8.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX7Y8.setText("x7 y8");
        btnLocationX7Y8.setFocusable(false);

        btnLocationX8Y8.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX8Y8.setText("x8 y8");
        btnLocationX8Y8.setFocusable(false);
        btnLocationX8Y8.setSelected(true);

        javax.swing.GroupLayout gl_pnlTable = new javax.swing.GroupLayout(pnlTable);
        pnlTable.setLayout(gl_pnlTable);
        gl_pnlTable.setHorizontalGroup(
            gl_pnlTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_pnlTable.createSequentialGroup()
                .addComponent(btnLocationX1Y8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX2Y8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX3Y)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX4Y8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX5Y8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX6Y8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX7Y8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX8Y8))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_pnlTable.createSequentialGroup()
                .addComponent(btnLocationX1Y7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX2Y7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX3Y7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX4Y7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX5Y7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX6Y7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX7Y7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX8Y7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_pnlTable.createSequentialGroup()
                .addComponent(btnLocationX1Y5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX2Y5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX3Y5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX4Y5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX5Y5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX6Y5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX7Y5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX8Y5))
            .addGroup(gl_pnlTable.createSequentialGroup()
                .addComponent(btnLocationX1Y6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX2Y6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX3Y6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX4Y6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX5Y6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX6Y6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX7Y6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX8Y6))
            .addGroup(gl_pnlTable.createSequentialGroup()
                .addComponent(btnLocationX1Y4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX2Y4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX3Y4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX4Y4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX5Y4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX6Y4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX7Y4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX8Y4))
            .addGroup(gl_pnlTable.createSequentialGroup()
                .addComponent(btnLocationX1Y3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX2Y3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX3Y3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX4Y3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX5Y3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX6Y3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX7Y3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX8Y3))
            .addGroup(gl_pnlTable.createSequentialGroup()
                .addComponent(btnLocationX1Y1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX2Y1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX3Y1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX4Y1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX5Y1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX6Y1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX7Y1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX8Y1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_pnlTable.createSequentialGroup()
                .addComponent(btnLocationX1Y2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX2Y2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX3Y2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX4Y2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX5Y2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX6Y2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX7Y2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocationX8Y2))
        );
        gl_pnlTable.setVerticalGroup(
            gl_pnlTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_pnlTable.createSequentialGroup()
                .addGroup(gl_pnlTable.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLocationX1Y8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX2Y8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX3Y, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX5Y8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX4Y8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX6Y8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX7Y8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX8Y8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gl_pnlTable.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLocationX1Y7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX2Y7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX3Y7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX5Y7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX4Y7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX6Y7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX7Y7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX8Y7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gl_pnlTable.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLocationX1Y6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX2Y6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX3Y6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX5Y6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX4Y6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX6Y6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX7Y6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX8Y6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gl_pnlTable.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLocationX1Y5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX2Y5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX3Y5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX5Y5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX4Y5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX6Y5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX7Y5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX8Y5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gl_pnlTable.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLocationX1Y4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX2Y4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX3Y4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX5Y4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX4Y4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX6Y4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX7Y4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX8Y4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gl_pnlTable.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLocationX1Y3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX2Y3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX3Y3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX5Y3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX4Y3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX6Y3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX7Y3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX8Y3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gl_pnlTable.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLocationX1Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX2Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX3Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX5Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX4Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX6Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX7Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX8Y2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gl_pnlTable.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLocationX1Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX2Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX3Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX5Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX4Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX6Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX7Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocationX8Y1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        lblX1.setText("1");

        lblX2.setText("2");

        lblX3.setText("3");

        lblX4.setText("4");

        lblX5.setText("5");

        lblX6.setText("6");

        lblX7.setText("7");

        lblX8.setText("8");

        lblX.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblX.setText("X");

        sepY.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblY.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblY.setText("Y");

        lblY1.setText("1");

        lblY2.setText("2");

        lblY3.setText("3");

        lblY4.setText("4");

        lblY5.setText("5");

        lblY6.setText("6");

        lblY7.setText("7");
        lblY7.setToolTipText("");

        lblY8.setText("8");

        pnlPossibleDestinations.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Destinos Possíveis"));

        pnlInitialLocation.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Posição Inicial"));

        lblCoordinateX.setText("X: ");

        lblCoordinateY.setText("X: ");

        javax.swing.GroupLayout gl_pnlInitialLocation = new javax.swing.GroupLayout(pnlInitialLocation);
        pnlInitialLocation.setLayout(gl_pnlInitialLocation);
        gl_pnlInitialLocation.setHorizontalGroup(
            gl_pnlInitialLocation.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_pnlInitialLocation.createSequentialGroup()
                .addContainerGap()
                .addGroup(gl_pnlInitialLocation.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gl_pnlInitialLocation.createSequentialGroup()
                        .addComponent(lblCoordinateX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCoordinateX, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                    .addGroup(gl_pnlInitialLocation.createSequentialGroup()
                        .addComponent(lblCoordinateY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCoordinateY)))
                .addContainerGap())
        );
        gl_pnlInitialLocation.setVerticalGroup(
            gl_pnlInitialLocation.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_pnlInitialLocation.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gl_pnlInitialLocation.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoordinateX)
                    .addComponent(edtCoordinateX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gl_pnlInitialLocation.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoordinateY)
                    .addComponent(edtCoordinateY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnClear.setText("Limpar");
        btnExecute.setText("Executar");

        chkShowVisitedWays.setText("Mostrar Caminho Percorrido");

        edtPossibleDestinations.setColumns(20);
        edtPossibleDestinations.setRows(5);
        scrPossibleDestinations.setViewportView(edtPossibleDestinations);
        
        lblInitialColor = new JLabel("Cor da Posi\u00E7\u00E3o Inicial");
        lblInitialColor.setForeground(new Color(102, 0, 255));
        
        javax.swing.GroupLayout gl_pnlPossibleDestinations = new javax.swing.GroupLayout(pnlPossibleDestinations);
        gl_pnlPossibleDestinations.setHorizontalGroup(
        	gl_pnlPossibleDestinations.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_pnlPossibleDestinations.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_pnlPossibleDestinations.createParallelGroup(Alignment.TRAILING)
        				.addComponent(scrPossibleDestinations, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        				.addGroup(gl_pnlPossibleDestinations.createParallelGroup(Alignment.LEADING)
        					.addGroup(Alignment.TRAILING, gl_pnlPossibleDestinations.createSequentialGroup()
        						.addComponent(pnlInitialLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addGroup(gl_pnlPossibleDestinations.createParallelGroup(Alignment.TRAILING)
        							.addComponent(chkShowVisitedWays)
        							.addGroup(gl_pnlPossibleDestinations.createSequentialGroup()
        								.addComponent(btnClear)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(btnExecute))))
        					.addComponent(lblInitialColor)))
        			.addContainerGap())
        );
        gl_pnlPossibleDestinations.setVerticalGroup(
        	gl_pnlPossibleDestinations.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnlPossibleDestinations.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_pnlPossibleDestinations.createParallelGroup(Alignment.TRAILING)
        				.addGroup(gl_pnlPossibleDestinations.createSequentialGroup()
        					.addComponent(chkShowVisitedWays)
        					.addGap(18)
        					.addGroup(gl_pnlPossibleDestinations.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnClear)
        						.addComponent(btnExecute)))
        				.addComponent(pnlInitialLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblInitialColor)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(scrPossibleDestinations, GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
        			.addContainerGap())
        );
        pnlPossibleDestinations.setLayout(gl_pnlPossibleDestinations);

        lblPoweredBy.setText("Desenvolvido por Ricardo Medeiros - 626 e Lucas Mendes - 677. Universidade Estadual do Norte do Paraná - Campus Luiz Meneghel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblY1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblY2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblY3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblY4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblY5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblY6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblY7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblY8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblY)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sepY, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(sepX)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblX))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(pnlTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(lblX1)
                                        .addGap(58, 58, 58)
                                        .addComponent(lblX2)
                                        .addGap(59, 59, 59)
                                        .addComponent(lblX3)
                                        .addGap(59, 59, 59)
                                        .addComponent(lblX4)
                                        .addGap(57, 57, 57)
                                        .addComponent(lblX5)
                                        .addGap(61, 61, 61)
                                        .addComponent(lblX6)
                                        .addGap(57, 57, 57)
                                        .addComponent(lblX7)
                                        .addGap(57, 57, 57)
                                        .addComponent(lblX8)))
                                .addGap(18, 18, 18)
                                .addComponent(pnlPossibleDestinations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lblPoweredBy)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblY)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblY8)
                        .addGap(40, 40, 40)
                        .addComponent(lblY7)
                        .addGap(41, 41, 41)
                        .addComponent(lblY6)
                        .addGap(42, 42, 42)
                        .addComponent(lblY5)
                        .addGap(40, 40, 40)
                        .addComponent(lblY4)
                        .addGap(41, 41, 41)
                        .addComponent(lblY3)
                        .addGap(41, 41, 41)
                        .addComponent(lblY2)
                        .addGap(43, 43, 43)
                        .addComponent(lblY1)
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlPossibleDestinations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sepY)
                                    .addComponent(pnlTable, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sepX, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblX))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblX1)
                                    .addComponent(lblX2)
                                    .addComponent(lblX3)
                                    .addComponent(lblX4)
                                    .addComponent(lblX5)
                                    .addComponent(lblX6)
                                    .addComponent(lblX7)
                                    .addComponent(lblX8))
                                .addGap(5, 5, 5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(lblPoweredBy))))
        );

        pack();
    }                   

    @Override
    public void clearPossibleDestinations() {
        this.edtPossibleDestinations.setText("");
    }

    @Override
    public void resetCoordinateX() {
        this.edtCoordinateX.setValue(0);
    }

    @Override
    public void resetCoordinateY() {
        this.edtCoordinateY.setValue(0);
    }

    @Override
    public void uncheckVisitedWays() {
        this.chkShowVisitedWays.setSelected(false);
    }
    
    @Override
    public boolean requestConfirmation(String mensagem) {
        return (JOptionPane.showConfirmDialog(this, mensagem, "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION);
   }
    
   @Override
   public void closeWindow(){
       this.setVisible(false);
   }           
   
   @Override
   public void addPossibleDestination(String destinoPossivel) {
       this.edtPossibleDestinations.setText(this.edtPossibleDestinations.getText()+"\n"+destinoPossivel);
   }
   
   @Override
   public void showError(String mensagemDeErro) {
       JOptionPane.showMessageDialog(this, mensagemDeErro, "Erro", JOptionPane.ERROR_MESSAGE);
   }
   
   @Override
   public void resetAllColors(){
	   this.resetAllColors(this.getContentPane());
   }
   
   public void resetAllColors(Container container) {
	   for (Component component : container.getComponents()) {
		   if 		(component instanceof JButton)
			   component.setBackground(this.colorStorage.get(((JButton)component).getText()));
		   else if  (component instanceof Container)
			   this.resetAllColors((Container) component);
	   }
   }
   
   public void setKeyListener(Container container, KeyListener listener) {
	  for (Component component : container.getComponents()) {
		component.addKeyListener(listener);
		
		if (component instanceof Container)
			this.setKeyListener((Container)component, listener);
	  }	   
   }
   
   public void setListeners() {
	   KeyListener keyListener = new EventsMain.CloseWindowKeyPressed(this.controller);
	   this.addKeyListener(keyListener);
	   this.setKeyListener(this.getContentPane(), keyListener);   
	   
	   this.btnClear.addActionListener(new EventsMain.ClearActionPerformed(this.controller));
	   this.btnExecute.addActionListener(new EventsMain.ExecuteActionPerformed(this.controller));
	   this.lblInitialColor.addMouseListener(new EventsMain.ChangeInitialColorMouseClicked(this.controller));
	   
	   for (Component component: this.pnlTable.getComponents()) {
		   JButton btn = (JButton) component;
		   btn.addActionListener(new EventsMain.LocationActionPerformed(this.controller));
	   }
   }

    @Override
	public void changeInitialLocationColor(String coordinateXY) {
    	this.changeLocationColor(coordinateXY, this.lblInitialColor.getForeground());
	}
    
    @Override
    public void paintDestinationLocationColor(String coordinateXY, Integer level) {
    	this.changeLocationColor(coordinateXY, new Color((2*level), (2*level), (2*level)));
    }
    
    public void changeLocationColor(String CoordinateXY, Color color) {
    	for (Component component : this.pnlTable.getComponents()) {
			if ((component instanceof JButton) && (((JButton)component).getText().equals(CoordinateXY)))
				component.setBackground(color);
    	}    	
    }
    
    @Override
    public void changeInitialLabelColor() {
    	this.changeLabelColor(this.lblInitialColor);
    }
    
    public void changeLabelColor(JLabel lbl) {
    	Color color = JColorChooser.showDialog(this, "Escolha a cor", lbl.getForeground());
    	
    	if ((color != null) && (!color.equals(lbl.getForeground())))
    		lbl.setForeground(color);
    }
    
    @Override
    public void addInitialLocation(String initialLocation) {
    	this.edtPossibleDestinations.setText(initialLocation+"\n");
    }

	@Override
	public DTOLocation getInitialLocation() {
		return new DTOLocation(Integer.parseInt(this.edtCoordinateX.getValue().toString()), Integer.parseInt(this.edtCoordinateY.getValue().toString()));
	}

	@Override
	public void setInitialLocation(DTOLocation initialLocation) {
		this.edtCoordinateX.setValue(initialLocation.getX());
		this.edtCoordinateY.setValue(initialLocation.getY());
	}
}
