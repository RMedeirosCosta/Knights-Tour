package br.edu.uenp.knights_tour.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SpinnerNumberModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.BoxLayout;
import javax.swing.JFrame;


import br.edu.uenp.knights_tour.application.controller.*;
import br.edu.uenp.knights_tour.application.dto.DTOLocation;
import br.edu.uenp.knights_tour.application.view.ViewMain;
import br.edu.uenp.knights_tour.ui.events.EventsMain;


import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyListener;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.SpinnerModel;

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
    private JSpinner edtInitialCoordinateX;
    private JSpinner edtInitialCoordinateY;
    private JLabel lblInitialCoordinateX;
    private JLabel lblInitialCoordinateY;
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
    private JPanel pnlDestinationsColor;
    private JPanel pnlDestinationsColorWithScroll;
    private JPanel pnlTable;
    private JSeparator sepX;
    private JSeparator sepY;
    private JTextArea edtVisitedWays; 
    private JScrollPane scrVisitedWays;
    private JScrollPane scrDestinationsColor;

    private ControllerMain controller;
    private JLabel lblInitialColor;
    private Map<String, Color> colorStorage;
    private Map<Integer, Color> levelsAlreadyPainted;
    private JPanel pnlLogVisitedWays;
    private JPanel pnlInitialLocation;
    private JLabel lblFinalCoordinateX;
    private JPanel pnlFinalLocation;
    private JLabel lblFinalCoordinateY;
    private JSpinner edtFinalCoordinateX;
    private JSpinner edtFinalCoordinateY;
    private JLabel lblFinalColor;
    
    public WindowMain() {
    	setResizable(false);
        this.controller = new ControllerMain(this);        
        this.initComponents();        
        this.setListeners();
        this.colorStorage = new HashMap<>();
        this.levelsAlreadyPainted = new HashMap<>();
        
        for (Component component: this.pnlTable.getComponents()) {
        	if (!(component instanceof JButton))
        		continue;
        	
        	JButton btn = (JButton) component;
        	
			 this.colorStorage.put(btn.getText(), btn.getBackground());
		}
    }    
                              
    private void initComponents() {
        pnlTable = new JPanel();
        pnlTable.setToolTipText("Clique em uma posi\u00E7\u00E3o para selecionar as coordenadas iniciais");
        btnLocationX3Y1 = new JButton();
        btnLocationX3Y1.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        btnLocationX4Y1 = new JButton();
        btnLocationX4Y1.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
        sepX = new JSeparator();
        lblX1 = new JLabel();
        lblX1.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        lblX2 = new JLabel();
        lblX2.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        lblX3 = new JLabel();
        lblX3.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        lblX4 = new JLabel();
        lblX4.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        lblX5 = new JLabel();
        lblX5.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        lblX6 = new JLabel();
        lblX6.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        lblX7 = new JLabel();
        lblX7.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        lblX8 = new JLabel();
        lblX8.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        lblX = new JLabel();
        lblX.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        sepY = new JSeparator();
        lblY = new JLabel();
        lblY.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        lblY1 = new JLabel();
        lblY1.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        lblY2 = new JLabel();
        lblY2.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        lblY3 = new JLabel();
        lblY3.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        lblY4 = new JLabel();
        lblY4.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        lblY5 = new JLabel();
        lblY5.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        lblY6 = new JLabel();
        lblY6.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        lblY7 = new JLabel();
        lblY8 = new JLabel();
        lblY8.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        pnlPossibleDestinations = new JPanel();
        pnlInitialLocation = new JPanel();
        pnlInitialLocation.setToolTipText("Clique nos campos de texto para alterar as coordenadas iniciais ou clique em uma posi\u00E7\u00E3o do tabuleiro");
        lblInitialCoordinateX = new JLabel();
        lblInitialCoordinateY = new JLabel();
        edtInitialCoordinateX = new JSpinner(new SpinnerNumberModel(0, 0, 8, 1));
        edtInitialCoordinateX.setToolTipText("Selecione aqui a coordenada inical X");
        edtInitialCoordinateY = new JSpinner(new SpinnerNumberModel(0, 0, 8, 1));        
        edtInitialCoordinateY.setToolTipText("Selecione aqui a coordenada inical X");
        btnClear = new JButton();
        btnClear.setToolTipText("Clique aqui para limpar uma opera\u00E7\u00E3o rec\u00E9m realizada");
        btnExecute = new JButton();
        btnExecute.setToolTipText("Clique aqui para executar a opera\u00E7\u00E3o");

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("Caminho do Cavalo no Tabuleiro do Xadrez - 7.8 . Trabalho Final TAC");
        setName("frameJanelaPrincipal");

        pnlTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlTable.setEnabled(false);

        btnLocationX3Y1.setBackground(new java.awt.Color(102, 102, 102));
        btnLocationX3Y1.setText("x3 y1");
        btnLocationX3Y1.setFocusable(false);
        btnLocationX3Y1.setSelected(true);

        btnLocationX4Y1.setBackground(new java.awt.Color(255, 255, 255));
        btnLocationX4Y1.setText("x4 y1");
        btnLocationX4Y1.setFocusable(false);

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
        lblY7.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");

        lblY8.setText("8");

        pnlPossibleDestinations.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Destinos Possíveis"));

        pnlInitialLocation.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Posição Inicial"));

        lblInitialCoordinateX.setText("X: ");

        lblInitialCoordinateY.setText("Y: ");

        btnClear.setText("Limpar");
        btnExecute.setText("Executar");
        
        lblInitialColor = new JLabel("Cor da Posi\u00E7\u00E3o Inicial");
        lblInitialColor.setToolTipText("Clique aqui para alterar a cor da posi\u00E7\u00E3o inicial");
        lblInitialColor.setForeground(Color.BLUE);
        
        pnlDestinationsColorWithScroll = new JPanel(new GridLayout(0, 1));
        scrDestinationsColor = new JScrollPane(pnlDestinationsColorWithScroll);
        scrDestinationsColor.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrDestinationsColor.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        pnlDestinationsColor = new JPanel();
        pnlDestinationsColor.setToolTipText("Aqui ser\u00E3o mostradas as cores de cada n\u00EDvel");
        pnlDestinationsColor.add(scrDestinationsColor);
        pnlDestinationsColor.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        pnlDestinationsColor.setBorder(new TitledBorder(null, "Cores de Destino", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        
        pnlFinalLocation = new JPanel();
        pnlFinalLocation.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Posição Final"));
        
        lblFinalColor = new JLabel("Cor da Posi\u00E7\u00E3o Final");
        lblFinalColor.setToolTipText("Clique aqui para alterar a cor da posi\u00E7\u00E3o final");
        lblFinalColor.setForeground(new Color(0, 128, 0));
        
        javax.swing.GroupLayout gl_pnlPossibleDestinations = new javax.swing.GroupLayout(pnlPossibleDestinations);
        gl_pnlPossibleDestinations.setHorizontalGroup(
        	gl_pnlPossibleDestinations.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnlPossibleDestinations.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_pnlPossibleDestinations.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(pnlDestinationsColor, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(lblFinalColor, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(lblInitialColor, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addGroup(Alignment.LEADING, gl_pnlPossibleDestinations.createSequentialGroup()
        					.addComponent(pnlInitialLocation, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(pnlFinalLocation, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
        				.addGroup(gl_pnlPossibleDestinations.createSequentialGroup()
        					.addComponent(btnClear)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnExecute)))
        			.addContainerGap(38, Short.MAX_VALUE))
        );
        gl_pnlPossibleDestinations.setVerticalGroup(
        	gl_pnlPossibleDestinations.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnlPossibleDestinations.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_pnlPossibleDestinations.createParallelGroup(Alignment.BASELINE)
        				.addComponent(pnlInitialLocation, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
        				.addComponent(pnlFinalLocation, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblInitialColor)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblFinalColor)
        			.addGap(18)
        			.addGroup(gl_pnlPossibleDestinations.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnExecute)
        				.addComponent(btnClear))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(pnlDestinationsColor, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
        			.addContainerGap())
        );
        pnlFinalLocation.setLayout(new GridLayout(0, 2, 0, 0));
        
        lblFinalCoordinateX = new JLabel();
        lblFinalCoordinateX.setText("X: ");
        pnlFinalLocation.add(lblFinalCoordinateX);
        
        edtFinalCoordinateX = new JSpinner(new SpinnerNumberModel(0, 0, 8, 1));
        edtFinalCoordinateX.setToolTipText("Selecione aqui a coordenada inical X");
        pnlFinalLocation.add(edtFinalCoordinateX);
        
        lblFinalCoordinateY = new JLabel();
        lblFinalCoordinateY.setText("Y: ");
        pnlFinalLocation.add(lblFinalCoordinateY);
        
        edtFinalCoordinateY = new JSpinner(new SpinnerNumberModel(0, 0, 8, 1));
        edtFinalCoordinateY.setToolTipText("Selecione aqui a coordenada inical X");
        pnlFinalLocation.add(edtFinalCoordinateY);
        pnlInitialLocation.setLayout(new GridLayout(0, 2, 0, 0));
        pnlInitialLocation.add(lblInitialCoordinateX);
        pnlInitialLocation.add(edtInitialCoordinateX);
        pnlInitialLocation.add(lblInitialCoordinateY);
        pnlInitialLocation.add(edtInitialCoordinateY);
        pnlDestinationsColor.setLayout(new GridLayout(0, 1));
        
        pnlPossibleDestinations.setLayout(gl_pnlPossibleDestinations);
        
        pnlLogVisitedWays = new JPanel();
        pnlLogVisitedWays.setToolTipText("Aqui ser\u00E1 mostrado o log da opera\u00E7\u00E3o. Ser\u00E3o listados todos os caminhos percorridos");
        pnlLogVisitedWays.setBorder(new TitledBorder(null, "Log de Caminhos Percorridos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        pnlLogVisitedWays.setLayout(new BoxLayout(pnlLogVisitedWays, BoxLayout.X_AXIS));
        
        
        edtVisitedWays = new JTextArea();
        edtVisitedWays.setEnabled(false);
        scrVisitedWays = new JScrollPane(this.edtVisitedWays);
        scrVisitedWays.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrVisitedWays.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        pnlLogVisitedWays.add(scrVisitedWays);
        
        edtVisitedWays.setBounds(10, 21, 179, 449);
        pnlLogVisitedWays.add(scrVisitedWays);
        lblPoweredBy = new JLabel();
        
        lblPoweredBy.setText("Desenvolvido por Ricardo Medeiros - 626 e Lucas Mendes - 677. Universidade Estadual do Norte do Paraná - Campus Luiz Meneghel");
        
        JLabel lblInformation = new JLabel("Pare o mouse sobre os componentes para obter informa\u00E7\u00E3o");
        lblInformation.setToolTipText("Esse trabalho merece 10. \r\nVoc\u00EA n\u00E3o acha? :]");
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(23)
        			.addComponent(lblY)
        			.addGap(228)
        			.addComponent(lblInformation))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(74)
        			.addComponent(lblPoweredBy))
        		.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
        			.addGroup(groupLayout.createSequentialGroup()
        				.addGap(23)
        				.addComponent(pnlLogVisitedWays, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addGroup(groupLayout.createSequentialGroup()
        				.addGap(11)
        				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        					.addComponent(lblY8)
        					.addComponent(lblY7)
        					.addComponent(lblY6)
        					.addComponent(lblY5)
        					.addComponent(lblY4)
        					.addComponent(lblY3)
        					.addComponent(lblY2)
        					.addComponent(lblY1))
        				.addGap(6)
        				.addComponent(sepY, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        					.addGroup(groupLayout.createSequentialGroup()
        						.addGap(35)
        						.addComponent(lblX1)
        						.addGap(58)
        						.addComponent(lblX2)
        						.addGap(59)
        						.addComponent(lblX3)
        						.addGap(59)
        						.addComponent(lblX4)
        						.addGap(57)
        						.addComponent(lblX5)
        						.addGap(61)
        						.addComponent(lblX6)
        						.addGap(57)
        						.addComponent(lblX7)
        						.addGap(57)
        						.addComponent(lblX8)
        						.addGap(66)
        						.addComponent(sepX, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addGap(6)
        						.addComponent(lblX)
        						.addGap(11))
        					.addGroup(groupLayout.createSequentialGroup()
        						.addGap(6)
        						.addComponent(pnlTable, GroupLayout.PREFERRED_SIZE, 508, Short.MAX_VALUE)
        						.addPreferredGap(ComponentPlacement.RELATED)))
        				.addPreferredGap(ComponentPlacement.RELATED)
        				.addComponent(pnlPossibleDestinations, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
        				.addGap(47)))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(14)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblY)
        				.addComponent(lblInformation))
        			.addGap(3)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(2)
        					.addComponent(lblY8)
        					.addGap(40)
        					.addComponent(lblY7)
        					.addGap(41)
        					.addComponent(lblY6)
        					.addGap(42)
        					.addComponent(lblY5)
        					.addGap(40)
        					.addComponent(lblY4)
        					.addGap(41)
        					.addComponent(lblY3)
        					.addGap(41)
        					.addComponent(lblY2)
        					.addGap(43)
        					.addComponent(lblY1))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(8)
        					.addComponent(sepY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(pnlTable, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE)
        					.addGap(34)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblX1)
        						.addComponent(lblX2)
        						.addComponent(lblX3)
        						.addComponent(lblX4)
        						.addComponent(lblX5)
        						.addComponent(lblX6)
        						.addComponent(lblX7)
        						.addComponent(lblX8)))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(pnlPossibleDestinations, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(5)
        					.addComponent(sepX, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(452)
        					.addComponent(lblX)))
        			.addGap(21)
        			.addComponent(pnlLogVisitedWays, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblPoweredBy))
        );
        pnlTable.setLayout(new GridLayout(8, 8, 0, 0));
        btnLocationX1Y8 = new JButton();
        btnLocationX1Y8.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX1Y8.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX1Y8.setText("x1 y8");
                btnLocationX1Y8.setFocusable(false);
                btnLocationX1Y8.setName(""); // NOI18N
                pnlTable.add(btnLocationX1Y8);
        btnLocationX2Y8 = new JButton();
        btnLocationX2Y8.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX2Y8.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX2Y8.setText("x2 y8");
                btnLocationX2Y8.setFocusable(false);
                btnLocationX2Y8.setSelected(true);
                pnlTable.add(btnLocationX2Y8);
        btnLocationX3Y = new JButton();
        btnLocationX3Y.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX3Y.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX3Y.setText("x3 y8");
                btnLocationX3Y.setFocusable(false);
                pnlTable.add(btnLocationX3Y);
        btnLocationX4Y8 = new JButton();
        btnLocationX4Y8.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX4Y8.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX4Y8.setText("x4 y8");
                btnLocationX4Y8.setFocusable(false);
                btnLocationX4Y8.setSelected(true);
                pnlTable.add(btnLocationX4Y8);
        btnLocationX5Y8 = new JButton();
        btnLocationX5Y8.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX5Y8.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX5Y8.setText("x5 y8");
                btnLocationX5Y8.setFocusable(false);
                pnlTable.add(btnLocationX5Y8);
        btnLocationX6Y8 = new JButton();
        btnLocationX6Y8.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX6Y8.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX6Y8.setText("x6 y8");
                btnLocationX6Y8.setFocusable(false);
                btnLocationX6Y8.setSelected(true);
                pnlTable.add(btnLocationX6Y8);
        btnLocationX7Y8 = new JButton();
        btnLocationX7Y8.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX7Y8.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX7Y8.setText("x7 y8");
                btnLocationX7Y8.setFocusable(false);
                pnlTable.add(btnLocationX7Y8);
        btnLocationX8Y8 = new JButton();
        btnLocationX8Y8.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX8Y8.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX8Y8.setText("x8 y8");
                btnLocationX8Y8.setFocusable(false);
                btnLocationX8Y8.setSelected(true);
                pnlTable.add(btnLocationX8Y8);
        btnLocationX1Y7 = new JButton();
        btnLocationX1Y7.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX1Y7.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX1Y7.setText("x1 y7");
                btnLocationX1Y7.setFocusable(false);
                btnLocationX1Y7.setSelected(true);
                pnlTable.add(btnLocationX1Y7);
        btnLocationX2Y7 = new JButton();
        btnLocationX2Y7.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX2Y7.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX2Y7.setText("x2 y7");
                btnLocationX2Y7.setFocusable(false);
                pnlTable.add(btnLocationX2Y7);
        btnLocationX3Y7 = new JButton();
        btnLocationX3Y7.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX3Y7.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX3Y7.setText("x3 y7");
                btnLocationX3Y7.setFocusable(false);
                btnLocationX3Y7.setSelected(true);
                pnlTable.add(btnLocationX3Y7);
        btnLocationX4Y7 = new JButton();
        btnLocationX4Y7.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX4Y7.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX4Y7.setText("x4 y7");
                btnLocationX4Y7.setFocusable(false);
                pnlTable.add(btnLocationX4Y7);
        btnLocationX5Y7 = new JButton();
        btnLocationX5Y7.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX5Y7.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX5Y7.setText("x5 y7");
                btnLocationX5Y7.setFocusable(false);
                btnLocationX5Y7.setSelected(true);
                pnlTable.add(btnLocationX5Y7);
        btnLocationX6Y7 = new JButton();
        btnLocationX6Y7.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX6Y7.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX6Y7.setText("x6 y7");
                btnLocationX6Y7.setFocusable(false);
                pnlTable.add(btnLocationX6Y7);
        btnLocationX7Y7 = new JButton();
        btnLocationX7Y7.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX7Y7.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX7Y7.setText("x7 y7");
                btnLocationX7Y7.setFocusable(false);
                btnLocationX7Y7.setSelected(true);
                pnlTable.add(btnLocationX7Y7);
        btnLocationX8Y7 = new JButton();
        btnLocationX8Y7.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX8Y7.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX8Y7.setText("x8 y7");
                btnLocationX8Y7.setFocusable(false);
                pnlTable.add(btnLocationX8Y7);
        btnLocationX1Y6 = new JButton();
        btnLocationX1Y6.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX1Y6.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX1Y6.setText("x1 y6");
                btnLocationX1Y6.setFocusable(false);
                pnlTable.add(btnLocationX1Y6);
        btnLocationX2Y6 = new JButton();
        btnLocationX2Y6.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX2Y6.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX2Y6.setText("x2 y6");
                btnLocationX2Y6.setFocusable(false);
                btnLocationX2Y6.setSelected(true);
                pnlTable.add(btnLocationX2Y6);
        btnLocationX3Y6 = new JButton();
        btnLocationX3Y6.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX3Y6.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX3Y6.setText("x3 y6");
                btnLocationX3Y6.setFocusable(false);
                pnlTable.add(btnLocationX3Y6);
        btnLocationX4Y6 = new JButton();
        btnLocationX4Y6.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX4Y6.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX4Y6.setText("x4 y6");
                btnLocationX4Y6.setFocusable(false);
                btnLocationX4Y6.setSelected(true);
                pnlTable.add(btnLocationX4Y6);
        btnLocationX5Y6 = new JButton();
        btnLocationX5Y6.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX5Y6.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX5Y6.setText("x5 y6");
                btnLocationX5Y6.setFocusable(false);
                pnlTable.add(btnLocationX5Y6);
        btnLocationX6Y6 = new JButton();
        btnLocationX6Y6.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX6Y6.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX6Y6.setText("x6 y6");
                btnLocationX6Y6.setFocusable(false);
                btnLocationX6Y6.setSelected(true);
                pnlTable.add(btnLocationX6Y6);
        btnLocationX7Y6 = new JButton();
        btnLocationX7Y6.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX7Y6.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX7Y6.setText("x7 y6");
                btnLocationX7Y6.setFocusable(false);
                pnlTable.add(btnLocationX7Y6);
        btnLocationX8Y6 = new JButton();
        btnLocationX8Y6.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX8Y6.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX8Y6.setText("x8 y6");
                btnLocationX8Y6.setFocusable(false);
                btnLocationX8Y6.setSelected(true);
                pnlTable.add(btnLocationX8Y6);
        btnLocationX1Y5 = new JButton();
        btnLocationX1Y5.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX1Y5.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX1Y5.setText("x1 y5");
                btnLocationX1Y5.setFocusable(false);
                btnLocationX1Y5.setSelected(true);
                pnlTable.add(btnLocationX1Y5);
        btnLocationX2Y5 = new JButton();
        btnLocationX2Y5.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX2Y5.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX2Y5.setText("x2 y5");
                btnLocationX2Y5.setFocusable(false);
                pnlTable.add(btnLocationX2Y5);
        btnLocationX3Y5 = new JButton();
        btnLocationX3Y5.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX3Y5.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX3Y5.setText("x3 y5");
                btnLocationX3Y5.setFocusable(false);
                btnLocationX3Y5.setSelected(true);
                pnlTable.add(btnLocationX3Y5);
        btnLocationX4Y5 = new JButton();
        btnLocationX4Y5.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX4Y5.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX4Y5.setText("x4 y5");
                btnLocationX4Y5.setFocusable(false);
                pnlTable.add(btnLocationX4Y5);
        btnLocationX5Y5 = new JButton();
        btnLocationX5Y5.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX5Y5.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX5Y5.setText("x5 y5");
                btnLocationX5Y5.setFocusable(false);
                btnLocationX5Y5.setSelected(true);
                pnlTable.add(btnLocationX5Y5);
        btnLocationX6Y5 = new JButton();
        btnLocationX6Y5.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX6Y5.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX6Y5.setText("x6 y5");
                btnLocationX6Y5.setFocusable(false);
                pnlTable.add(btnLocationX6Y5);
        btnLocationX7Y5 = new JButton();
        btnLocationX7Y5.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX7Y5.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX7Y5.setText("x7 y5");
                btnLocationX7Y5.setFocusable(false);
                btnLocationX7Y5.setSelected(true);
                pnlTable.add(btnLocationX7Y5);
        btnLocationX8Y5 = new JButton();
        btnLocationX8Y5.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX8Y5.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX8Y5.setText("x8 y5");
                btnLocationX8Y5.setFocusable(false);
                pnlTable.add(btnLocationX8Y5);
        btnLocationX1Y4 = new JButton();
        btnLocationX1Y4.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX1Y4.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX1Y4.setText("x1 y4");
                btnLocationX1Y4.setFocusable(false);
                pnlTable.add(btnLocationX1Y4);
        btnLocationX2Y4 = new JButton();
        btnLocationX2Y4.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX2Y4.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX2Y4.setText("x2 y4");
                btnLocationX2Y4.setFocusable(false);
                btnLocationX2Y4.setSelected(true);
                pnlTable.add(btnLocationX2Y4);
        btnLocationX3Y4 = new JButton();
        btnLocationX3Y4.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX3Y4.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX3Y4.setText("x3 y4");
                btnLocationX3Y4.setFocusable(false);
                pnlTable.add(btnLocationX3Y4);
        btnLocationX4Y4 = new JButton();
        btnLocationX4Y4.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX4Y4.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX4Y4.setText("x4 y4");
                btnLocationX4Y4.setFocusable(false);
                btnLocationX4Y4.setSelected(true);
                pnlTable.add(btnLocationX4Y4);
        btnLocationX5Y4 = new JButton();
        btnLocationX5Y4.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX5Y4.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX5Y4.setText("x5 y4");
                btnLocationX5Y4.setFocusable(false);
                pnlTable.add(btnLocationX5Y4);
        btnLocationX6Y4 = new JButton();
        btnLocationX6Y4.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX6Y4.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX6Y4.setText("x6 y4");
                btnLocationX6Y4.setFocusable(false);
                btnLocationX6Y4.setSelected(true);
                pnlTable.add(btnLocationX6Y4);
        btnLocationX7Y4 = new JButton();
        btnLocationX7Y4.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX7Y4.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX7Y4.setText("x7 y4");
                btnLocationX7Y4.setFocusable(false);
                pnlTable.add(btnLocationX7Y4);
        btnLocationX8Y4 = new JButton();
        btnLocationX8Y4.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX8Y4.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX8Y4.setText("x8 y4");
                btnLocationX8Y4.setFocusable(false);
                btnLocationX8Y4.setSelected(true);
                pnlTable.add(btnLocationX8Y4);
        btnLocationX1Y3 = new JButton();
        btnLocationX1Y3.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX1Y3.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX1Y3.setText("x1 y3");
                btnLocationX1Y3.setFocusable(false);
                btnLocationX1Y3.setSelected(true);
                pnlTable.add(btnLocationX1Y3);
        btnLocationX2Y3 = new JButton();
        btnLocationX2Y3.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX2Y3.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX2Y3.setText("x2 y3");
                btnLocationX2Y3.setFocusable(false);
                pnlTable.add(btnLocationX2Y3);
        btnLocationX3Y3 = new JButton();
        btnLocationX3Y3.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX3Y3.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX3Y3.setText("x3 y3");
                btnLocationX3Y3.setFocusable(false);
                btnLocationX3Y3.setSelected(true);
                pnlTable.add(btnLocationX3Y3);
        btnLocationX4Y3 = new JButton();
        btnLocationX4Y3.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX4Y3.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX4Y3.setText("x4 y3");
                btnLocationX4Y3.setFocusable(false);
                pnlTable.add(btnLocationX4Y3);
        btnLocationX5Y3 = new JButton();
        btnLocationX5Y3.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX5Y3.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX5Y3.setText("x5 y3");
                btnLocationX5Y3.setFocusable(false);
                btnLocationX5Y3.setSelected(true);
                pnlTable.add(btnLocationX5Y3);
        btnLocationX6Y3 = new JButton();
        btnLocationX6Y3.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX6Y3.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX6Y3.setText("x6 y3");
                btnLocationX6Y3.setFocusable(false);
                pnlTable.add(btnLocationX6Y3);
        btnLocationX7Y3 = new JButton();
        btnLocationX7Y3.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX7Y3.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX7Y3.setText("x7 y3");
                btnLocationX7Y3.setFocusable(false);
                btnLocationX7Y3.setSelected(true);
                pnlTable.add(btnLocationX7Y3);
        btnLocationX8Y3 = new JButton();
        btnLocationX8Y3.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX8Y3.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX8Y3.setText("x8 y3");
                btnLocationX8Y3.setFocusable(false);
                pnlTable.add(btnLocationX8Y3);
        btnLocationX1Y2 = new JButton();
        btnLocationX1Y2.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX1Y2.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX1Y2.setText("x1 y2");
                btnLocationX1Y2.setFocusable(false);
                pnlTable.add(btnLocationX1Y2);
        btnLocationX2Y2 = new JButton();
        btnLocationX2Y2.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX2Y2.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX2Y2.setText("x2 y2");
                btnLocationX2Y2.setFocusable(false);
                btnLocationX2Y2.setSelected(true);
                pnlTable.add(btnLocationX2Y2);
        btnLocationX3Y2 = new JButton();
        btnLocationX3Y2.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX3Y2.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX3Y2.setText("x3 y2");
                btnLocationX3Y2.setFocusable(false);
                pnlTable.add(btnLocationX3Y2);
        btnLocationX4Y2 = new JButton();
        btnLocationX4Y2.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX4Y2.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX4Y2.setText("x4 y2");
                btnLocationX4Y2.setFocusable(false);
                btnLocationX4Y2.setSelected(true);
                pnlTable.add(btnLocationX4Y2);
        btnLocationX5Y2 = new JButton();
        btnLocationX5Y2.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX5Y2.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX5Y2.setText("x5 y2");
                btnLocationX5Y2.setFocusable(false);
                pnlTable.add(btnLocationX5Y2);
        btnLocationX6Y2 = new JButton();
        btnLocationX6Y2.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX6Y2.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX6Y2.setText("x6 y2");
                btnLocationX6Y2.setFocusable(false);
                btnLocationX6Y2.setSelected(true);
                pnlTable.add(btnLocationX6Y2);
        btnLocationX7Y2 = new JButton();
        btnLocationX7Y2.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX7Y2.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX7Y2.setText("x7 y2");
                btnLocationX7Y2.setFocusable(false);
                pnlTable.add(btnLocationX7Y2);
        btnLocationX8Y2 = new JButton();
        btnLocationX8Y2.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX8Y2.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX8Y2.setText("x8 y2");
                btnLocationX8Y2.setFocusable(false);
                btnLocationX8Y2.setSelected(true);
                pnlTable.add(btnLocationX8Y2);
        btnLocationX1Y1 = new JButton();
        btnLocationX1Y1.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX1Y1.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX1Y1.setText("x1 y1");
                btnLocationX1Y1.setFocusable(false);
                btnLocationX1Y1.setSelected(true);
                pnlTable.add(btnLocationX1Y1);
        btnLocationX2Y1 = new JButton();
        btnLocationX2Y1.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX2Y1.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX2Y1.setText("x2 y1");
                btnLocationX2Y1.setFocusable(false);
                pnlTable.add(btnLocationX2Y1);
        pnlTable.add(btnLocationX3Y1);
        pnlTable.add(btnLocationX4Y1);
        btnLocationX5Y1 = new JButton();
        btnLocationX5Y1.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX5Y1.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX5Y1.setText("x5 y1");
                btnLocationX5Y1.setFocusable(false);
                btnLocationX5Y1.setSelected(true);
                pnlTable.add(btnLocationX5Y1);
        btnLocationX6Y1 = new JButton();
        btnLocationX6Y1.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX6Y1.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX6Y1.setText("x6 y1");
                btnLocationX6Y1.setFocusable(false);
                pnlTable.add(btnLocationX6Y1);
        btnLocationX7Y1 = new JButton();
        btnLocationX7Y1.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX7Y1.setBackground(new java.awt.Color(102, 102, 102));
                btnLocationX7Y1.setText("x7 y1");
                btnLocationX7Y1.setFocusable(false);
                btnLocationX7Y1.setSelected(true);
                pnlTable.add(btnLocationX7Y1);
        btnLocationX8Y1 = new JButton();
        btnLocationX8Y1.setToolTipText("Clique aqui para selecionar essas coordenadas (X, Y) como posi\u00E7\u00E3o inicial.");
        
                btnLocationX8Y1.setBackground(new java.awt.Color(255, 255, 255));
                btnLocationX8Y1.setText("x8 y1");
                btnLocationX8Y1.setFocusable(false);
                pnlTable.add(btnLocationX8Y1);
        getContentPane().setLayout(groupLayout);

        pack();
    }                   

    @Override
    public void resetInitialCoordinateX() {
        this.edtInitialCoordinateX.setValue(0);
    }

    @Override
    public void resetInitialCoordinateY() {
        this.edtInitialCoordinateY.setValue(0);
    }

    @Override
    public boolean requestConfirmation(String message) {
        return (JOptionPane.showConfirmDialog(this, message, "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION);
   }
    
   @Override
   public void closeWindow(){
       this.setVisible(false);
   }           
   
   @Override
   public void showError(String errorMessage) {
       JOptionPane.showMessageDialog(this, errorMessage, "Erro", JOptionPane.ERROR_MESSAGE);
   }
   
   @Override
   public void resetAllColors(){
	   this.resetAllColors(this.getContentPane());
	   this.pnlDestinationsColorWithScroll.removeAll();
	   this.pnlDestinationsColorWithScroll.revalidate();
	   this.pnlDestinationsColorWithScroll.repaint();
	   this.levelsAlreadyPainted.clear();
   }
   
   public void resetAllColors(Container container) {
	   for (Component component : container.getComponents()) {
		   if 		(component instanceof JButton) {
			   component.setBackground(this.colorStorage.get(((JButton)component).getText()));
			   component.setForeground(new Color(0, 0, 0));
		   }
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
	   this.addWindowListener(new EventsMain.ClosingMainWindow(this.controller));
	   KeyListener keyListener = new EventsMain.CloseWindowKeyPressed(this.controller);
	   this.addKeyListener(keyListener);
	   this.setKeyListener(this.getContentPane(), keyListener);   
	   
	   this.btnClear.addActionListener(new EventsMain.ClearActionPerformed(this.controller));
	   this.btnExecute.addActionListener(new EventsMain.ExecuteActionPerformed(this.controller));
	   this.lblInitialColor.addMouseListener(new EventsMain.ChangeInitialColorMouseClicked(this.controller));
	   this.lblFinalColor.addMouseListener(new EventsMain.ChangeFinalColorMouseClicked(this.controller));
	   
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
    	Color  destinationColor;
    	
    	if (!this.levelsAlreadyPainted.containsKey(level)) {
        	Random random 			   = new Random();
        	JLabel lblDestinationColor = new JLabel("Nível ".concat(level.toString()));
        	destinationColor		   = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)); 
        	lblDestinationColor.setForeground(destinationColor); 
        	this.pnlDestinationsColorWithScroll.add(lblDestinationColor);
        	this.pnlDestinationsColorWithScroll.revalidate();
        	this.pnlDestinationsColorWithScroll.repaint();
        	this.levelsAlreadyPainted.put(level, destinationColor);
    	} else {
    		destinationColor = this.levelsAlreadyPainted.get(level);
    	}
    	
    	this.changeLocationColor(coordinateXY, destinationColor);    	
    }    
    
    public void changeLocationColor(String CoordinateXY, Color color) {
    	for (Component component : this.pnlTable.getComponents()) {
			if ((component instanceof JButton) && (((JButton)component).getText().equals(CoordinateXY))) {
				component.setBackground(color);
				
				if ((component.getBackground().getRed() <= 50) || (component.getBackground().getBlue() <= 50) || (component.getBackground().getGreen() <= 50))
					component.setForeground(new Color(255, 255, 255));
			}
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
	public DTOLocation getInitialLocation() {
		return new DTOLocation(Integer.parseInt(this.edtInitialCoordinateX.getValue().toString()), Integer.parseInt(this.edtInitialCoordinateY.getValue().toString()));
	}

	@Override
	public void setInitialLocation(DTOLocation initialLocation) {
		this.edtInitialCoordinateX.setValue(initialLocation.getX());
		this.edtInitialCoordinateY.setValue(initialLocation.getY());
	}

	@Override
	public void printDestination(String coordinateXY, Integer level) {
		this.edtVisitedWays.setText(this.edtVisitedWays.getText()+"Destino: "+coordinateXY+" - Nível de hierarquia: "+level.toString());		
	}

	@Override
	public void printVisitedWay(String coordinateXY) {
		this.edtVisitedWays.setText(this.edtVisitedWays.getText().concat(coordinateXY));		
	}

	@Override
	public void insertLineBreak() {		
		if (!this.edtVisitedWays.getText().isEmpty())		
			this.edtVisitedWays.setText(this.edtVisitedWays.getText().concat("\n"));
	}

	@Override
	public void insertPipe() {
		this.edtVisitedWays.setText(this.edtVisitedWays.getText().concat(" | "));		
	}

	@Override
	public void insertPeriod() {
		this.edtVisitedWays.setText(this.edtVisitedWays.getText().concat("."));		
	}

	@Override
	public void resetVisitedWays() {
		this.edtVisitedWays.setText("");		
	}

	@Override
	public void showWarning(String alertMessage) {
		JOptionPane.showMessageDialog(this, alertMessage, "Atenção!", JOptionPane.WARNING_MESSAGE);		
	}

	@Override
	public void insertLabel() {
		this.edtVisitedWays.setText(this.edtVisitedWays.getText().concat("Caminhos: "));		
	}

	@Override
	public void insertSeparator() {
		String separator = "";
		
		for (int i = 0; i < 100; i++)
			separator+= "=";
		
		this.edtVisitedWays.setText(this.edtVisitedWays.getText().concat(separator));		
	}

	@Override
	public DTOLocation getFinalLocation() {
		return new DTOLocation(Integer.parseInt(this.edtFinalCoordinateX.getValue().toString()), Integer.parseInt(this.edtFinalCoordinateY.getValue().toString()));		
	}

	@Override
	public void setFinalLocation(DTOLocation finalLocation) {
		this.edtFinalCoordinateX.setValue(finalLocation.getX());
		this.edtFinalCoordinateY.setValue(finalLocation.getY());
	}

	@Override
	public void changeFinalLabelColor() {
		this.changeLabelColor(this.lblFinalColor);		
	}

	@Override
	public void changeFinalLocationColor(String coordinateXY) {
		this.changeLocationColor(coordinateXY, this.lblFinalColor.getForeground());
	}

	@Override
	public void resetFinalCoordinateX() {
		this.edtFinalCoordinateX.setValue(0);		
	}

	@Override
	public void resetFinalCoordinateY() {
		this.edtFinalCoordinateY.setValue(0);		
	}

	@Override
	public void changeToolTipTextLocations(String toolTipText) {
		for (Component component : this.pnlTable.getComponents()) {
			JButton btn = (JButton) component; 
			btn.setToolTipText(toolTipText);
		}		
	}

	@Override
	public void printDestination(String coordinateXY) {
		this.edtVisitedWays.setText(this.edtVisitedWays.getText()+"Destino: "+coordinateXY);		
	}
}
