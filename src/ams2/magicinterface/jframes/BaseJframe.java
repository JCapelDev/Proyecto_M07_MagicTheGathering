package ams2.magicinterface.jframes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ams2.magicinterface.baseclases.Carta;
import ams2.magicinterface.baseclases.Coste;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.awt.event.ActionEvent;

public class BaseJframe extends JFrame {
	public static ArrayList<Carta> aCards = new ArrayList<>();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					BaseJframe frame = new BaseJframe();
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
	
	
	public BaseJframe() {
		
//		Coste co1 = new Coste();
//		co1.setLlanura(2);
//		co1.setIncoloro(1);
//		Carta c1 = new Carta("Himno Glorioso",co1,"Encantamiento",null,"m7",0,0,"Las criatura que controlas obtienen +1/+1.","Norte y sur se encuentran, y los ángeles cantan. Las voces resuenan con un sonido virtuoso.","imgs"+File.separator+"icons"+File.separator+"W.png");
//		aCards.add(c1);
//		System.out.println(aCards.get(0).getName());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTittle = new JLabel("Gestor de Cartas de Magic the Gathering\u2122");
		lblTittle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTittle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTittle.setBounds(22, 12, 496, 60);
		contentPane.add(lblTittle);
		
		JButton btnAddCard = new JButton("A\u00F1adir Carta");
		btnAddCard.setBounds(36, 252, 132, 32);
		contentPane.add(btnAddCard);
		
		btnAddCard.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				new AddCardJframe();
				
			}
			
		});
		
		JButton btnViewCards = new JButton("Ver Cartas");
		btnViewCards.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(aCards.get(0).getName()+" ");
				aCards.get(0).getCost().returnAllCosts();
				System.out.print(" "+aCards.get(0).getType());
			}
		});
		btnViewCards.setBounds(199, 252, 126, 32);
		contentPane.add(btnViewCards);
		
		JButton btnDeleteCard = new JButton("Eliminar Carta");
		btnDeleteCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeleteCard.setBounds(353, 252, 155, 32);
		contentPane.add(btnDeleteCard);
		setVisible(true);
	}
	
}

