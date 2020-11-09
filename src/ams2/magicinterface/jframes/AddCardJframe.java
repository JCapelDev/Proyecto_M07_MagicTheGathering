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
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;

public class AddCardJframe extends JFrame {
	private JPanel contentPane;
	private JTextField txtCardName;
	public Carta c1;
	public Coste co1;
	private int[] aCostes;
	private BaseJframe bJF;

	/**
	 * Launch the application.
	 */
	//	public static void main(String[] args) {
	//		EventQueue.invokeLater(new Runnable() {
	//			public void run() {
	//				try {
	//					AddCardJframe frame = new AddCardJframe();
	//					frame.setVisible(true);
	//				} catch (Exception e) {
	//					e.printStackTrace();
	//				}
	//			}
	//		});
	//	}

	/**
	 * Create the frame.
	 */
	public  AddCardJframe() {
		
		aCostes= new int[6];
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 588, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Carta c = new Carta();
		Coste co = new Coste();
		//		bJF.getList().add(e);
		JFileChooser fc = new JFileChooser();
		JLabel lblTittle = new JLabel("A\u00F1adir una Carta");
		lblTittle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTittle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTittle.setBounds(186, 11, 233, 30);
		contentPane.add(lblTittle);

		JButton btnReturn = new JButton("Atr\u00E1s >");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//				new BaseJframe();
				dispose();
			}
		});
		btnReturn.setBounds(473, 17, 89, 23);
		contentPane.add(btnReturn);

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

		Icon iLlanura = new ImageIcon("imgs"+File.separator+"icons"+File.separator+"W.png");
		JButton btnAddLlanura = new JButton("Llanura");
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
		comboBoxType.setModel(new DefaultComboBoxModel(new String[] {"Tierra", "Criatura", "Artefacto", "Encantamiento", "Planeswalker", "Instantaneo", "Conjuro"}));
		comboBoxType.setBounds(38, 237, 123, 30);
		contentPane.add(comboBoxType);

		JLabel lblSubType = new JLabel("Subtipo:");
		lblSubType.setBounds(186, 212, 89, 14);
		contentPane.add(lblSubType);

		JComboBox comboBoxSubType = new JComboBox();
		comboBoxSubType.setBounds(186, 237, 137, 30);
		contentPane.add(comboBoxSubType);

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

		JTextArea textArea = new JTextArea();
		textArea.setBounds(38, 424, 147, 86);
		contentPane.add(textArea);

		JLabel lblLore = new JLabel("Texto de Lore:");
		lblLore.setBounds(223, 399, 123, 14);
		contentPane.add(lblLore);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(223, 424, 123, 86);
		contentPane.add(textArea_1);

		JLabel lblArt = new JLabel("Arte:");
		lblArt.setBounds(407, 289, 46, 14);
		contentPane.add(lblArt);

		JButton btnAddArt = new JButton("A\u00F1adir Imagen");
		btnAddArt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int returnVal = fc.showOpenDialog(AddCardJframe.this);
			}
		});
		btnAddArt.setBounds(372, 310, 147, 43);
		contentPane.add(btnAddArt);

		JLabel lblEdicin = new JLabel("Edición:");
		lblEdicin.setBounds(383, 212, 70, 15);
		contentPane.add(lblEdicin);

		JComboBox comboBoxEdition = new JComboBox();
		comboBoxEdition.setModel(new DefaultComboBoxModel(new String[] {"Alfa Edición Limitada", "Beta Edición Limitada", "Unlimited", "Arabian Nights", "Antiquities", "Revisada", "Legends", "The Dark", "Fallen Empires", "Cuarta Edición", "Ice Age", "Chronicles", "Renaissance", "Homelands", "Alliances", "Mirage", "Visions", "Quinta Edición", "Sexta Edición", "Seventh Edition", "Judgment", "Eighth Edition", "Mirrodin", "Champions of Kamigawa", "Ninth Edition", "Ravnica: City of Guilds", "Time Spiral", "Tenth Edition", "Shadowmoor", "Shards of Alara", "Zendikar"}));
		comboBoxEdition.setBounds(372, 237, 190, 30);
		contentPane.add(comboBoxEdition);



		JButton btnAddCard = new JButton("Añadir carta");
		btnAddCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				co1 = new Coste(aCostes[0],aCostes[1],aCostes[2],aCostes[3],aCostes[4],aCostes[5]);
				c1 = new Carta(txtCardName.getText(),co1,comboBoxType.getSelectedItem().toString(),null,"m7",0,0,"Las criatura que controlas obtienen +1/+1.","Norte y sur se encuentran, y los ángeles cantan. Las voces resuenan con un sonido virtuoso.","imgs"+File.separator+"icons"+File.separator+"W.png");
				if(c1 != null)
					BaseJframe.aCards.add(c1);


			}
		});
		btnAddCard.setBounds(407, 456, 155, 54);
		contentPane.add(btnAddCard);

		setVisible(true);

	}


}
