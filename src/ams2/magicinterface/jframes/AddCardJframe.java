package ams2.magicinterface.jframes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;

public class AddCardJframe extends JFrame {

	private JPanel contentPane;
	private JTextField txtCardName;

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
	public AddCardJframe() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 588, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JFileChooser fc = new JFileChooser();
		JLabel lblTittle = new JLabel("A\u00F1adir una Carta");
		lblTittle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTittle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTittle.setBounds(186, 11, 177, 31);
		contentPane.add(lblTittle);
		
		JButton btnReturn = new JButton("Atr\u00E1s >");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BaseJframe();
				dispose();
			}
		});
		btnReturn.setBounds(473, 487, 89, 23);
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
		
		Icon iLlanura = new ImageIcon("imgs\\icons\\W.png");
		JButton btnAddLlanura = new JButton("Llanura");
		btnAddLlanura.setBounds(74, 7, 105, 23);
		btnAddLlanura.setIcon(iLlanura);
		costPanel.add(btnAddLlanura);
		
		Icon iIsla = new ImageIcon("imgs\\icons\\U.png");
		JButton btnAddIsla = new JButton("Isla");
		btnAddIsla.setBounds(212, 7, 105, 23);
		btnAddIsla.setIcon(iIsla);
		costPanel.add(btnAddIsla);
		
		Icon iPantano = new ImageIcon("imgs\\icons\\B.png");
		JButton btnAddPantano = new JButton("Pantano");
		btnAddPantano.setBounds(347, 7, 105, 23);
		btnAddPantano.setIcon(iPantano);
		costPanel.add(btnAddPantano);
		
		Icon iMontana = new ImageIcon("imgs\\icons\\R.png");
		JButton btnAddMontana = new JButton("Monta\u00F1a");
		btnAddMontana.setBounds(74, 48, 105, 23);
		btnAddMontana.setIcon(iMontana);
		costPanel.add(btnAddMontana);
		
		Icon iBosque = new ImageIcon("imgs\\icons\\G.png");
		JButton btnAddBosque = new JButton("Bosque");
		btnAddBosque.setBounds(212, 48, 105, 23);
		btnAddBosque.setIcon(iBosque);
		costPanel.add(btnAddBosque);
		
		Icon iIncoloro = new ImageIcon("imgs\\icons\\C.png");
		JButton btnAddIncoloro = new JButton("Incoloro");
		btnAddIncoloro.setBounds(347, 48, 105, 23);
		btnAddIncoloro.setIcon(iIncoloro);
		costPanel.add(btnAddIncoloro);
		
		JLabel lblType = new JLabel("Tipo:");
		lblType.setBounds(38, 212, 46, 14);
		contentPane.add(lblType);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tierra", "Criatura", "Artefacto", "Encantamiento", "Planeswalker", "Instantaneo", "Conjuro"}));
		comboBox.setBounds(38, 237, 89, 31);
		contentPane.add(comboBox);
		
		JLabel lblSubType = new JLabel("Subtipo:");
		lblSubType.setBounds(186, 212, 46, 14);
		contentPane.add(lblSubType);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(186, 237, 86, 31);
		contentPane.add(comboBox_1);
		
		JLabel lblPower = new JLabel("Fuerza:");
		lblPower.setBounds(358, 212, 46, 14);
		contentPane.add(lblPower);
		
		JLabel lblToughness = new JLabel("Dureza:");
		lblToughness.setBounds(488, 212, 46, 14);
		contentPane.add(lblToughness);
		
		JSpinner spinnerPower = new JSpinner();
		spinnerPower.setBounds(358, 242, 30, 20);
		contentPane.add(spinnerPower);
		
		JSpinner spinnerToughness = new JSpinner();
		spinnerToughness.setBounds(486, 242, 30, 20);
		contentPane.add(spinnerToughness);
		
		JLabel lblRules = new JLabel("Texto de Reglas:");
		lblRules.setBounds(38, 289, 147, 14);
		contentPane.add(lblRules);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(38, 314, 147, 86);
		contentPane.add(textArea);
		
		JLabel lblLore = new JLabel("Texto de Lore:");
		lblLore.setBounds(226, 289, 123, 14);
		contentPane.add(lblLore);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(226, 314, 123, 86);
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
		btnAddArt.setBounds(407, 315, 127, 40);
		contentPane.add(btnAddArt);
		
		
		
		
		
	}
}
