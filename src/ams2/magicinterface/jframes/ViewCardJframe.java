package ams2.magicinterface.jframes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;

import ams2.magicinterface.baseclases.Coste;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ViewCardJframe extends JFrame {

	private JPanel contentPane;
	private ArrayList<String> alC;
	private JPanel panelCost;
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ViewCardJframe frame = new ViewCardJframe();
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
	public ViewCardJframe() {
		alC= new ArrayList<>();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 562, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.BLACK));
		panel.setBounds(282, 11, 254, 329);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCardName = new JLabel("Nombre de la Carta");
		lblCardName.setFont(new Font("Source Serif Pro Black", Font.BOLD, 11));
		lblCardName.setBounds(10, 11, 141, 14);
		panel.add(lblCardName);
		
		JLabel lblImageLabel = new JLabel("");
		lblImageLabel.setBounds(20, 30, 212, 136);
		panel.add(lblImageLabel);
		
		JLabel lblTypeSubType = new JLabel("Tipo - Subtipo");
		lblTypeSubType.setFont(new Font("Source Sans Pro Black", Font.BOLD, 12));
		lblTypeSubType.setBounds(30, 177, 202, 14);
		panel.add(lblTypeSubType);
		
		JLabel lblEdition = new JLabel("Edicion");
		lblEdition.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblEdition.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEdition.setBounds(30, 201, 202, 14);
		panel.add(lblEdition);
		
		JTextPane textPaneRules = new JTextPane();
		textPaneRules.setFont(new Font("Tahoma", Font.PLAIN, 8));
		textPaneRules.setText("Texto de Reglas");
		textPaneRules.setBounds(30, 226, 202, 39);
		panel.add(textPaneRules);
		
		JTextPane textPaneLore = new JTextPane();
		textPaneLore.setText("Texto de Lore");
		textPaneLore.setFont(new Font("Tahoma", Font.ITALIC, 8));
		textPaneLore.setBounds(30, 266, 202, 31);
		panel.add(textPaneLore);
		
		JLabel lblPower = new JLabel("0");
		lblPower.setHorizontalAlignment(SwingConstants.CENTER);
		lblPower.setBounds(158, 299, 31, 21);
		lblPower.setVisible(false);
		panel.add(lblPower);
		
		
		JLabel lblToughness = new JLabel("0");
		lblToughness.setHorizontalAlignment(SwingConstants.CENTER);
		lblToughness.setBounds(199, 300, 33, 18);
		lblToughness.setVisible(false);
		panel.add(lblToughness);
		
		JLabel lblBarrica = new JLabel("/");
		lblBarrica.setHorizontalAlignment(SwingConstants.CENTER);
		lblBarrica.setBounds(180, 301, 26, 17);
		lblBarrica.setVisible(false);
		panel.add(lblBarrica);
		
		panelCost = new JPanel();
		panelCost.setBounds(121, 11, 123, 21);
		panel.add(panelCost);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 44, 186, 183);
		contentPane.add(scrollPane);
		DefaultListModel<String> model1 = new DefaultListModel();
		model1.clear();
		for (int i = 0; i < BaseJframe.aCards.size(); i++) {
			alC.add(BaseJframe.aCards.get(i).getName());
			model1.addElement(BaseJframe.aCards.get(i).getName());
			
		}
		JList cardList = new JList();
		cardList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				lblPower.setVisible(false);
				lblToughness.setVisible(false);
				lblBarrica.setVisible(false);
				for (int i = 0; i < alC.size(); i++) {
					if (cardList.getSelectedValue().equals(alC.get(i))) {
						lblCardName.setText(BaseJframe.aCards.get(i).getName());
						lblTypeSubType.setText(BaseJframe.aCards.get(i).getType().concat(" - ").concat(BaseJframe.aCards.get(i).getSubType()));
						lblEdition.setText(BaseJframe.aCards.get(i).getEdition());
						if(BaseJframe.aCards.get(i).getimageArt()!=null) {
							Icon newIcon = new ImageIcon(BaseJframe.aCards.get(i).getimageArt().getAbsolutePath());
							lblImageLabel.setIcon(newIcon);
						}
						lblPower.setText(String.valueOf(BaseJframe.aCards.get(i).getPower()));
						lblToughness.setText(String.valueOf(BaseJframe.aCards.get(i).getToughness()));
						textPaneRules.setText(BaseJframe.aCards.get(i).getRules());
						textPaneLore.setText(BaseJframe.aCards.get(i).getLore());
						if(lblTypeSubType.getText().contains("Criatura")) {
							lblPower.setVisible(true);
							lblToughness.setVisible(true);
							lblBarrica.setVisible(true);
						}
						
						addCostToPanelCost(BaseJframe.aCards.get(i).getCost());
						
					}
					
				}
			}
		});
		cardList.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				
			}
		});
		cardList.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				
			}
		});
		
		cardList.setModel(model1);
		
		
		
		
		scrollPane.setViewportView(cardList);
		
		JButton btnNewButton = new JButton("<- Atras");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnDeleteCard = new JButton("Borrar Carta");
		btnDeleteCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(cardList.getSelectedIndex());
				BaseJframe.aCards.remove(cardList.getSelectedIndex());
				alC.remove(cardList.getSelectedIndex());
				model1.remove(cardList.getSelectedIndex());
				
				
				cardList.setModel(model1);
			}
		});
		btnDeleteCard.setBounds(55, 291, 129, 34);
		contentPane.add(btnDeleteCard);
		
		setVisible(true);
	}
	
	public void addCostToPanelCost(Coste c1) {
		int cont = 0;
		int compCount = panelCost.getComponentCount();
		if(compCount>0) {
			for (int i = compCount-1; i >=0; i--) {
				panelCost.remove(i);
			}
		}
		
		while (c1.getIncoloro()!=0 && cont != c1.getIncoloro()) {
			JLabel jl = new JLabel();
			Icon ic = new ImageIcon("imgs"+File.separator+"icons"+File.separator+"1.png");
			jl.setIcon(ic);
			panelCost.add(jl);
			cont++;
		}
		cont=0;
		while (c1.getLlanura()!=0 && cont != c1.getLlanura()) {
			JLabel jl = new JLabel();
			Icon ic = new ImageIcon("imgs"+File.separator+"icons"+File.separator+"W.png");
			jl.setIcon(ic);
			panelCost.add(jl);
			cont++;
		}
		cont=0;
		while (c1.getIsla()!=0 && cont != c1.getIsla()) {
			JLabel jl = new JLabel();
			Icon ic = new ImageIcon("imgs"+File.separator+"icons"+File.separator+"U.png");
			jl.setIcon(ic);
			panelCost.add(jl);
			cont++;
		}
		cont=0;
		while (c1.getPantano()!=0 && cont != c1.getPantano()) {
			JLabel jl = new JLabel();
			Icon ic = new ImageIcon("imgs"+File.separator+"icons"+File.separator+"B.png");
			jl.setIcon(ic);
			panelCost.add(jl);
			cont++;
		}
		cont=0;
		while (c1.getMontana()!=0 && cont != c1.getMontana()) {
			JLabel jl = new JLabel();
			Icon ic = new ImageIcon("imgs"+File.separator+"icons"+File.separator+"R.png");
			jl.setIcon(ic);
			panelCost.add(jl);
			cont++;
		}
		cont=0;
		while (c1.getBosque()!=0 && cont != c1.getBosque()) {
			JLabel jl = new JLabel();
			Icon ic = new ImageIcon("imgs"+File.separator+"icons"+File.separator+"G.png");
			jl.setIcon(ic);
			panelCost.add(jl);
			cont++;
		}
		cont=0;
		
		
		
	}
}
