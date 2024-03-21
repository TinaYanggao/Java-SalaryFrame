package javaswing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame extends JFrame{
	
	JTextField txtNum1= new JTextField();
	JTextField txtNum2= new JTextField();
	JTextField txtNum3= new JTextField();
	
	ImageIcon icon = new ImageIcon("moon bilog na buwan.jpg");
	ImageIcon BgImage = new ImageIcon (new ImageIcon("blue rose.jpg").getImage().getScaledInstance(480, 480, Image.SCALE_SMOOTH) );
	
	JLabel lbltxtNum1= new JLabel();
	JLabel lbltxtNum2= new JLabel();
	JLabel lbltxtNum3= new JLabel();
	
	JButton btnAdd= new JButton();
	
	
	
	
	Frame(){
		this.setSize(500, 480);
		this.setLocationRelativeTo(null);
		this.setTitle("Java String");
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.getContentPane().setBackground(Color.black);
		this.setIconImage(icon.getImage());
		this.setContentPane(new JLabel (BgImage));
		
		
		txtNum1.setBounds(150, 50, 150, 30);
		txtNum2.setBounds(150, 90, 150, 30);
		txtNum3.setBounds(150, 130, 150, 30);
	
		
		txtNum1.setBounds(150, 50, 150, 30);
		lbltxtNum1.setBounds(30, 50, 150, 30);
		lbltxtNum1.setText("Enter Number 1: ");
		lbltxtNum1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum1.setBorder(BorderFactory.createLineBorder(Color.decode("#b182cf"), 1));
		lbltxtNum1.setForeground(Color.black);
		
		
		txtNum2.setBounds(150, 90, 150, 30);
		lbltxtNum2.setBounds(30, 90, 150, 30);
		lbltxtNum2.setText("Enter Number 2: ");
		
		txtNum3.setBounds(150, 130, 150, 30);
		lbltxtNum3.setBounds(30, 130, 150, 30);
		lbltxtNum3.setText("Enter Number 3: ");
		
		btnAdd.setBounds (30, 170, 150, 30);
		btnAdd.setText ("Add");
		btnAdd.setFocusable(false);
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				
				
				
				int sum = num1 - num2;
				txtNum3.setText(String.valueOf(sum));
				
						
				
				
			}});
		
		
		
		
		
		
		
		
		
	
		this.add(btnAdd);
	    this.add(txtNum1);
	    this.add(txtNum2);
	    this.add(txtNum3);
	    this.add(lbltxtNum1);
	    this.add(lbltxtNum2);
	    this.add(lbltxtNum3);
	    
	    this.setLayout(null);
		this.setVisible(true);
	}
 
	
}
