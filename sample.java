package sample;

import java.awt.EventQueue;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class sample {

	private JFrame frame;
	private JTextField textField;
	private JPanel NorthMeal;
	private JPanel menu;
	private JPanel SouthMeal;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sample window = new sample();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel menu = new JPanel();
		frame.getContentPane().add(menu, "name_18069497324000");
		menu.setLayout(null);
		menu.setVisible(true);
		
		final JPanel NorthMeal = new JPanel();
		frame.getContentPane().add(NorthMeal, "name_18112262348200");
		NorthMeal.setLayout(null);
		NorthMeal.setVisible(false);
		
		final JPanel SouthMeal = new JPanel();
		frame.getContentPane().add(SouthMeal, "name_18197110600200");
		SouthMeal.setLayout(null);
		SouthMeal.setVisible(false);
		
		
		textField = new JTextField();
		textField.setBounds(72, 161, 283, 23);
		menu.add(textField);
		textField.setColumns(10);
		
		JButton btnNorthIndianMeal = new JButton("North Indian Meal");
		btnNorthIndianMeal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NorthMeal.setVisible(true);
				menu.setVisible(false);
			}
		});
		btnNorthIndianMeal.setBounds(25, 87, 168, 23);
		menu.add(btnNorthIndianMeal);
		
		JButton btnSouthIndianMeal = new JButton("South Indian Meal");
		btnSouthIndianMeal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(false);
				SouthMeal.setVisible(true);
			}
		});
		btnSouthIndianMeal.setBounds(224, 87, 168, 23);
		menu.add(btnSouthIndianMeal);
		
		JLabel lblYourOrderList = new JLabel("Your Order List:");
		lblYourOrderList.setBounds(176, 146, 119, 14);
		menu.add(lblYourOrderList);
		
		
		JRadioButton elect1 = new JRadioButton("2 Rotis");
		elect1.setSelected(true);
		elect1.setBounds(38, 28, 109, 23);
		NorthMeal.add(elect1);
		
		JRadioButton electA = new JRadioButton("1 large paratha");
		electA.setBounds(273, 28, 139, 23);
		NorthMeal.add(electA);
		
		ButtonGroup G1 = new ButtonGroup(); 
		G1.add(elect1);
		G1.add(electA);
		
		JRadioButton elect2 = new JRadioButton("with curd");
		elect2.setSelected(true);
		elect2.setBounds(38, 66, 109, 23);
		NorthMeal.add(elect2);
		
		JRadioButton electB = new JRadioButton("without curd");
		electB.setBounds(273, 66, 109, 23);
		NorthMeal.add(electB);
		
		ButtonGroup G2 = new ButtonGroup(); 
		G2.add(elect2);
		G2.add(electB);
		
		JRadioButton elect3 = new JRadioButton("Paneer tikka");
		elect3.setSelected(true);
		elect3.setBounds(38, 103, 109, 23);
		NorthMeal.add(elect3);
		
		JRadioButton electC = new JRadioButton("aaloo tikka");
		electC.setBounds(273, 103, 109, 23);
		NorthMeal.add(electC);
		
		ButtonGroup G3 = new ButtonGroup(); 
		G3.add(elect3);
		G3.add(electC);
		
		JLabel lblOr = new JLabel("or");
		lblOr.setHorizontalAlignment(SwingConstants.CENTER);
		lblOr.setBounds(167, 32, 46, 14);
		NorthMeal.add(lblOr);
		
		JLabel lblOr_1 = new JLabel("or");
		lblOr_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblOr_1.setBounds(167, 70, 46, 14);
		NorthMeal.add(lblOr_1);
		
		JLabel lblOr_2 = new JLabel("or");
		lblOr_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblOr_2.setBounds(167, 107, 46, 14);
		NorthMeal.add(lblOr_2);
		
		JButton doneButton = new JButton("Done");
		doneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = new String();
				s = "North meal + " ;
				if(elect1.isSelected()) {
					s = s + "2 rotis + ";
				}else{s=s + "1 large paratha + "; }
				
				if(elect2.isSelected()) {
					s = s + "with curd + ";
				}else{s = s + "without curd + "; }
				
				if(elect3.isSelected()) {
					s = s + "Paneer tikka";
				}else{s = s + "aaloo tikka"; }
				
				textField.setText(s);
				
				menu.setVisible(true);
				NorthMeal.setVisible(false);
			}
		});
		doneButton.setBounds(156, 157, 89, 43);
		NorthMeal.add(doneButton);
		
		
		JRadioButton elect4 = new JRadioButton("2 rotis small");
		elect4.setSelected(true);
		elect4.setBounds(55, 44, 109, 23);
		SouthMeal.add(elect4);
		
		JRadioButton electD = new JRadioButton("2 pooris small");
		electD.setBounds(248, 44, 130, 23);
		SouthMeal.add(electD);
		
		ButtonGroup G4 = new ButtonGroup(); 
		G4.add(elect4);
		G4.add(electD);
		
		JRadioButton elect5 = new JRadioButton("with curd");
		elect5.setSelected(true);
		elect5.setBounds(55, 100, 109, 23);
		SouthMeal.add(elect5);
		
		JRadioButton electE = new JRadioButton("with butter milk");
		electE.setBounds(248, 100, 130, 23);
		SouthMeal.add(electE);
		
		ButtonGroup G5 = new ButtonGroup(); 
		G5.add(elect5);
		G5.add(electE);
		
		JLabel lblOr_3 = new JLabel("or");
		lblOr_3.setBounds(185, 48, 31, 14);
		SouthMeal.add(lblOr_3);
		
		JLabel lblOr_3_1 = new JLabel("or");
		lblOr_3_1.setBounds(185, 104, 31, 14);
		SouthMeal.add(lblOr_3_1);
		
		JButton btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1 = new String();
				s1 = "South meal + " ;
				if(elect4.isSelected()) {
					s1 = s1 + "2 rotis small + ";
				}else{s1 =s1  + "2 pooris small + "; }
				
				if(elect5.isSelected()) {
					s1 = s1 + "with curd ";
				}else{s1 = s1 + "with butter milk "; }
				
				textField.setText(s1);
				menu.setVisible(true);
				SouthMeal.setVisible(false);
			}
		});
		btnDone.setBounds(156, 168, 89, 41);
		SouthMeal.add(btnDone);
	}
}
