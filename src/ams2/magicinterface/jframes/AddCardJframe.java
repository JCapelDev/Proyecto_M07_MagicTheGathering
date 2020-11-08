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
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JScrollPane;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTittle = new JLabel("A\u00F1adir una Carta");
		lblTittle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTittle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTittle.setBounds(121, 11, 177, 31);
		contentPane.add(lblTittle);
		
		JButton btnReturn = new JButton("Atr\u00E1s >");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new BaseJframe();
				dispose();
			}
		});
		btnReturn.setBounds(335, 227, 89, 23);
		contentPane.add(btnReturn);
		
		txtCardName = new JTextField();
		txtCardName.setBounds(117, 53, 86, 20);
		contentPane.add(txtCardName);
		txtCardName.setColumns(10);
		
		JLabel lblCardName = new JLabel("Nombre:");
		lblCardName.setBounds(38, 56, 69, 17);
		contentPane.add(lblCardName);
		
		JPanel costPanel = new JPanel();
		costPanel.setBounds(38, 104, 386, 82);
		contentPane.add(costPanel);
		costPanel.setLayout(null);
		
		JLabel lblCostName = new JLabel("Coste:");
		lblCostName.setBounds(0, 11, 50, 14);
		costPanel.add(lblCostName);
		
		JButton btnAddLlanura = new JButton("Llanura");
		btnAddLlanura.setBounds(66, 7, 89, 23);
		costPanel.add(btnAddLlanura);
		
		JButton btnAddIsla = new JButton("Isla");
		btnAddIsla.setBounds(172, 7, 89, 23);
		costPanel.add(btnAddIsla);
		
		JButton btnAddPantano = new JButton("Pantano");
		btnAddPantano.setBounds(278, 7, 89, 23);
		costPanel.add(btnAddPantano);
		
		JButton btnAddMontana = new JButton("Monta\u00F1a");
		btnAddMontana.setBounds(66, 48, 89, 23);
		costPanel.add(btnAddMontana);
		
		JButton btnAddBosque = new JButton("Bosque");
		btnAddBosque.setBounds(172, 48, 89, 23);
		costPanel.add(btnAddBosque);
		
		JButton btnAddIncoloro = new JButton("Incoloro");
		btnAddIncoloro.setBounds(278, 48, 89, 23);
		costPanel.add(btnAddIncoloro);
		
		
		
		
		
	}
}
