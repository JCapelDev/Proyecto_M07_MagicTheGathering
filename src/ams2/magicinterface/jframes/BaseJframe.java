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
		//Costes y Cartas de Ejemplo
		Coste coe1 = new Coste(2,0,0,0,0,1);
		Coste coe2 = new Coste(0,0,0,0,0,1);
		Coste coe3 = new Coste(0,0,1,0,0,1);
		
		File fe1=new File("imgs"+File.separator+"icons"+File.separator+"W.png");
		File fe2=new File("imgs"+File.separator+"icons"+File.separator+"B.png");
		File fe3=new File("imgs"+File.separator+"icons"+File.separator+"C.png");
		
		Carta ce1 = new Carta("Himno Glorioso",coe1,"Encantamiento","","Seventh Edition",0,0,"Las criaturas obtienen +1/+1","La balada de los paladines",fe1);
		Carta ce2 = new Carta("Disciple of Griselbrand",coe3,"Criatura","Human Cleric","Mirrodin",1,1,"Sacrifice a creature","The demon Griselbrand dared to stand against Avacyn",fe2);
		Carta ce3 = new Carta("Pergamino de Griselbrand",coe2,"Artefacto","","Avacyn Restored",0,0,"Sacrificar el pergamino de Griselbrand","Palabras que los ojos no deberian ver",fe3);
		
		aCards.add(ce1);
		aCards.add(ce2);
		aCards.add(ce3);
		//
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 377);
		setResizable(false);
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
//				System.out.print(aCards.get(0).getName()+" ");
//				aCards.get(0).getCost().returnAllCosts();
//				System.out.print(" "+aCards.get(0).getType()
//						+" "+aCards.get(0).getSubType()
//						+" "+aCards.get(0).getEdition()
//						+" "+aCards.get(0).getPower()
//						+" "+aCards.get(0).getToughness()
//						+" "+aCards.get(0).getRules()
//						+" "+aCards.get(0).getLore()
//						+" "+aCards.get(0).getimageArt().getAbsolutePath());
				new ViewCardJframe();
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

