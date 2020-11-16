package ams2.magicinterface.jframes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ams2.magicinterface.baseclases.Carta;
import ams2.magicinterface.baseclases.Coste;
import ams2.magicinterface.test.MagicInterfaceLauncher;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class AddCardJframe extends JFrame {
	private JPanel contentPane;
	private JTextField txtCardName;
	public Carta c1;
	public Coste co1;
	private int[] aCostes;
	private File artFile;
	private ArrayList<String> aFillSubType = new ArrayList<String>();
	String typeToSubType;

	//Constructor del JFrame que abre el formulario
	public  AddCardJframe() {
		//Array de los costes de la carta, se reinicia cada vez que se inicia el JFrame
		aCostes= new int[6];
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 588, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Variables inicializadas de los objetos que acabarán siendo implementados 
		Carta c = new Carta();
		Coste co = new Coste();
		JFileChooser fc = new JFileChooser();
		
		//Label con el titulo del encabezado
		JLabel lblTittle = new JLabel("A\u00F1adir una Carta");
		lblTittle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTittle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTittle.setBounds(186, 11, 233, 30);
		contentPane.add(lblTittle);

		//Boton que permite hacer return al anterior JFrame
		JButton btnReturn = new JButton("Atr\u00E1s >");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//				new BaseJframe();
				dispose();
			}
		});
		btnReturn.setBounds(473, 17, 89, 23);
		contentPane.add(btnReturn);

		//Componentes que se inician
		txtCardName = new JTextField();
		txtCardName.setBounds(117, 53, 246, 23);
		contentPane.add(txtCardName);
		txtCardName.setColumns(10);

		JLabel lblCardName = new JLabel("Nombre:");
		lblCardName.setBounds(38, 56, 69, 17);
		contentPane.add(lblCardName);

		JPanel costPanel = new JPanel();
		costPanel.setBounds(38, 104, 496, 86);
		contentPane.add(costPanel);
		costPanel.setLayout(null);

		JLabel lblCostName = new JLabel("Coste:");
		lblCostName.setBounds(0, 11, 50, 14);
		costPanel.add(lblCostName);

		//Creacion de los JButton que tienen iconos en ellos
		Icon iLlanura = new ImageIcon("imgs"+File.separator+"icons"+File.separator+"W.png");
		JButton btnAddLlanura = new JButton("Llanura");
		//Si el boton es pulsado suma 1 a su indice del array de costes
		btnAddLlanura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aCostes[0]++;
			}
		});
		btnAddLlanura.setBounds(74, 7, 126, 23);
		btnAddLlanura.setIcon(iLlanura);
		costPanel.add(btnAddLlanura);

		Icon iIsla = new ImageIcon("imgs"+File.separator+"icons"+File.separator+"U.png");
		JButton btnAddIsla = new JButton("Isla");
		//Si el boton es pulsado suma 1 a su indice del array de costes
		btnAddIsla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aCostes[1]++;
			}
		});
		btnAddIsla.setBounds(212, 7, 123, 23);
		btnAddIsla.setIcon(iIsla);
		costPanel.add(btnAddIsla);

		Icon iPantano = new ImageIcon("imgs"+File.separator+"icons"+File.separator+"B.png");
		JButton btnAddPantano = new JButton("Pantano");
		//Si el boton es pulsado suma 1 a su indice del array de costes
		btnAddPantano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aCostes[2]++;
			}
		});
		btnAddPantano.setBounds(347, 7, 137, 23);
		btnAddPantano.setIcon(iPantano);
		costPanel.add(btnAddPantano);

		Icon iMontana = new ImageIcon("imgs"+File.separator+"icons"+File.separator+"R.png");
		JButton btnAddMontana = new JButton("Monta\u00F1a");
		//Si el boton es pulsado suma 1 a su indice del array de costes
		btnAddMontana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aCostes[3]++;
			}
		});
		btnAddMontana.setBounds(74, 48, 126, 26);
		btnAddMontana.setIcon(iMontana);
		costPanel.add(btnAddMontana);

		Icon iBosque = new ImageIcon("imgs"+File.separator+"icons"+File.separator+"G.png");
		JButton btnAddBosque = new JButton("Bosque");
		//Si el boton es pulsado suma 1 a su indice del array de costes
		btnAddBosque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aCostes[4]++;
			}
		});
		btnAddBosque.setBounds(212, 48, 123, 26);
		btnAddBosque.setIcon(iBosque);
		costPanel.add(btnAddBosque);

		Icon iIncoloro = new ImageIcon("imgs"+File.separator+"icons"+File.separator+"C.png");
		JButton btnAddIncoloro = new JButton("Incoloro");
		//Si el boton es pulsado suma 1 a su indice del array de costes
		btnAddIncoloro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aCostes[5]++;
			}
		});
		btnAddIncoloro.setBounds(347, 48, 137, 26);
		btnAddIncoloro.setIcon(iIncoloro);
		costPanel.add(btnAddIncoloro);

		JLabel lblType = new JLabel("Tipo:");
		lblType.setBounds(38, 212, 46, 14);
		contentPane.add(lblType);

		
		
		JComboBox comboBoxType = new JComboBox();
		//Action Listener que al seleccionar un item guarda en una variable String el tipo seleccionado
		comboBoxType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				typeToSubType = comboBoxType.getSelectedItem().toString();
			}
		});
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"Criatura", "Artefacto", "Criatura - Artefacto", "Planeswalker", "Encantamiento", "Instantaneo", "Conjuro"}));
		comboBoxType.setBounds(38, 237, 123, 30);
		contentPane.add(comboBoxType);
		
		
		//Rellenador del combo box subType segun lo selecionado en el combo box Type
		typeToSubType = comboBoxType.getSelectedItem().toString();

		JLabel lblSubType = new JLabel("Subtipo:");
		lblSubType.setBounds(186, 212, 89, 14);
		contentPane.add(lblSubType);

		
		
		
		JComboBox comboBoxSubType = new JComboBox();
		//Focus listener que en ganarlo llama a la funcion setSubtype pasandole typeToSubType 
		//y esta retorna los valores con los que llenar el modelo
		comboBoxSubType.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				comboBoxSubType.setModel(setSubtype(typeToSubType));
			}
		});
		comboBoxSubType.setBounds(186, 237, 137, 30);
		comboBoxSubType.setModel(setSubtype(typeToSubType));
		contentPane.add(comboBoxSubType);

		//Creacion de los demas componentes sencillos
		JLabel lblPower = new JLabel("Fuerza:");
		lblPower.setBounds(38, 280, 69, 14);
		contentPane.add(lblPower);

		JLabel lblToughness = new JLabel("Dureza:");
		lblToughness.setBounds(119, 280, 66, 14);
		contentPane.add(lblToughness);

		JSpinner spinnerPower = new JSpinner();
		spinnerPower.setBounds(38, 310, 30, 20);
		contentPane.add(spinnerPower);

		JSpinner spinnerToughness = new JSpinner();
		spinnerToughness.setBounds(117, 310, 30, 20);
		contentPane.add(spinnerToughness);

		JLabel lblRules = new JLabel("Texto de Reglas:");
		lblRules.setBounds(38, 399, 147, 14);
		contentPane.add(lblRules);

		JTextArea textAreaRules = new JTextArea();
		textAreaRules.setBounds(38, 424, 147, 86);
		contentPane.add(textAreaRules);

		JLabel lblLore = new JLabel("Texto de Lore:");
		lblLore.setBounds(223, 399, 123, 14);
		contentPane.add(lblLore);

		JTextArea textAreaLore = new JTextArea();
		textAreaLore.setBounds(223, 424, 123, 86);
		contentPane.add(textAreaLore);

		JLabel lblArt = new JLabel("Arte:");
		lblArt.setBounds(407, 289, 46, 14);
		contentPane.add(lblArt);

		//Boton de Añadir imagen, al pulsarse llama al JFileChooser y devuelve el archivo de imagen selecionado
		JButton btnAddArt = new JButton("A\u00F1adir Imagen");
		btnAddArt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int returnVal = fc.showSaveDialog(AddCardJframe.this);
				if(returnVal == JFileChooser.APPROVE_OPTION) {
					artFile = fc.getSelectedFile();
					
				}
			}
		});
		btnAddArt.setBounds(372, 310, 147, 43);
		contentPane.add(btnAddArt);

		JLabel lblEdicin = new JLabel("Edicion:");
		lblEdicin.setBounds(383, 212, 70, 15);
		contentPane.add(lblEdicin);

		//ComboBox que añade una de las ediciones preestablecidas
		JComboBox comboBoxEdition = new JComboBox();
		comboBoxEdition.setModel(new DefaultComboBoxModel(new String[] {"Alfa Edicion Limitada", "Beta Edicion Limitada", "Unlimited", "Arabian Nights", "Antiquities", "Revisada", "Legends", "The Dark", "Fallen Empires", "Cuarta Edici\u00C3\u00B3n", "Ice Age", "Chronicles", "Renaissance", "Homelands", "Alliances", "Mirage", "Visions", "Quinta Edici\u00C3\u00B3n", "Sexta Edici\u00C3\u00B3n", "Seventh Edition", "Judgment", "Eighth Edition", "Mirrodin", "Champions of Kamigawa", "Ninth Edition", "Ravnica: City of Guilds", "Time Spiral", "Tenth Edition", "Shadowmoor", "Shards of Alara", "Zendikar"}));
		comboBoxEdition.setBounds(372, 237, 190, 30);
		contentPane.add(comboBoxEdition);
		
		//Boton que lanza la logica de añadir una carta en ser pulsado
		JButton btnAddCard = new JButton("A\u00F1adir Carta");
		btnAddCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//El objeto coste inicializado se llena con los valores de los botones de coste
				co1 = new Coste(aCostes[0],aCostes[1],aCostes[2],aCostes[3],aCostes[4],aCostes[5]);
				//Se llena el objeto carta con los valores dados por los distintos componentes
				c1 = new Carta(txtCardName.getText(),
						co1,comboBoxType.getSelectedItem().toString(),
						//Coge primero el subtipo vacio, luego lo rellena si este tiene valor selecionado
						"",
						comboBoxEdition.getSelectedItem().toString(),
						(int) spinnerPower.getValue(),
						(int) spinnerToughness.getValue(),
						textAreaRules.getText(),
						textAreaLore.getText(),
						artFile);
				//Asignacion del valor subtipo si este tiene valor que no sea nulo
				if(comboBoxSubType.getSelectedItem() != null) {
					c1.setSubType(comboBoxSubType.getSelectedItem().toString());
				}
				//Añade la carta al arrayList de cartas si esta no es nula
				if(c1 != null)
					BaseJframe.aCards.add(c1);

				//Limpieza del arrayList que contiene los Strings de subtipo
				aFillSubType.clear();
				//Mensaje que muestra que la carta ha sido añadida
				JOptionPane.showMessageDialog(null, "Carta Anadida");
				dispose();

			}
		});
		btnAddCard.setBounds(407, 456, 155, 54);
		contentPane.add(btnAddCard);

		setVisible(true);

	}
	
	//Funcion que segun sea el valor selecionado en el comboBox de tipos llama a un metodo distinto
	public DefaultComboBoxModel<String> setSubtype(String Type) {
		DefaultComboBoxModel<String> cmboModel1= new DefaultComboBoxModel<>();
		
		switch(Type) {
		case "Criatura": 
			fillCreaturesList();
			cmboModel1.addAll(aFillSubType);
			break;
		case "Artefacto":
			fillArtifactsList();
			cmboModel1.addAll(aFillSubType);
			break;
		case "Criatura - Artefacto":
			fillCreaturesArtifactsList();
			cmboModel1.addAll(aFillSubType);
			break;
		case "Encantamiento":
			fillEnchantments();
			cmboModel1.addAll(aFillSubType);
			break;
		case "Instantaneo":
			fillInstants();
			cmboModel1.addAll(aFillSubType);
			break;
		case "Conjuro":
			fillInstants();
			cmboModel1.addAll(aFillSubType);
			break;
		case "Planeswalker":
			cmboModel1.addAll(aFillSubType);
			break;
			
		}
		aFillSubType.clear();
		return cmboModel1;
		
	}
	
	//Funcion que llena el arraylist de criaturas
	public void fillCreaturesList() {
		aFillSubType.add("Angel");
		aFillSubType.add("Centauro");
		aFillSubType.add("Humano");
		aFillSubType.add("Clerigo");
		aFillSubType.add("Semidios");
		aFillSubType.add("Demonio");
		aFillSubType.add("Pesadilla");
		aFillSubType.add("Hada");
		aFillSubType.add("Deidad");
		aFillSubType.add("Dragon");
		aFillSubType.add("Elfo");
		aFillSubType.add("Enano");
		aFillSubType.add("Goblin");
		aFillSubType.add("Minotauro");
		aFillSubType.add("Vampiro");
		aFillSubType.add("Guerrero");
		aFillSubType.add("Mago");
		aFillSubType.add("Clerigo - Humano");
		
	}
	
	//Funcion que llena el arraylist de criaturas
	public void fillArtifactsList() {
		aFillSubType.add("Equipo");
		aFillSubType.add("Comida");
		aFillSubType.add("Tesoro");
		aFillSubType.add("Vehiculo");
	}
	
	//Funcion que llena el arraylist de criaturas
	public void fillCreaturesArtifactsList() {
		aFillSubType.add("Constructo");
		aFillSubType.add("Golem");
		aFillSubType.add("Myr");
		aFillSubType.add("Espantapajaros");
		aFillSubType.add("Toptero");
		aFillSubType.add("Servo");
	}
	
	//Funcion que llena el arraylist de criaturas
	public void fillEnchantments() {
		aFillSubType.add("Aura");
		aFillSubType.add("Saga");
		aFillSubType.add("Templo");
	}
	
	//Funcion que llena el arraylist de criaturas
	public void fillInstants() {
		aFillSubType.add("Aventura");
		aFillSubType.add("Arcano");
	}


}
