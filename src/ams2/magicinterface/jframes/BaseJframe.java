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
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
	//Constructor principal, lanza el JFrame que sirve de base a la aplicación
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
		
		//Componentes basicos del JFrame
		JLabel lblTittle = new JLabel("Gestor de Cartas de Magic the Gathering\u2122");
		lblTittle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTittle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTittle.setBounds(22, 12, 496, 60);
		contentPane.add(lblTittle);
		
		//Botón que abre un JFrame que contiene el formulario para añadir una carta
		JButton btnAddCard = new JButton("A\u00F1adir Carta");
		btnAddCard.setBounds(63, 246, 141, 45);
		contentPane.add(btnAddCard);
		
		btnAddCard.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				new AddCardJframe();
				
			}
			
		});
		
		//Botón que abre un JFrame que contiene los elementos que permiten visualizar las cartas
		JButton btnViewCards = new JButton("Ver Cartas");
		btnViewCards.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ViewCardJframe();
			}
		});
		btnViewCards.setBounds(327, 246, 155, 45);
		contentPane.add(btnViewCards);
		
		//Label que Contiene el logo que se muestra en el centro del JFrame
		JLabel lblLogo = new JLabel("");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(32, 83, 486, 116);
		Icon iLogo = new ImageIcon("imgs"+File.separator+"Magic_Logo.png");
		lblLogo.setIcon(iLogo);
		contentPane.add(lblLogo);
		
		setVisible(true);
	}
}

