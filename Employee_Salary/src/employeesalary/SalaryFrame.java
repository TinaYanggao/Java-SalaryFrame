package employeesalary;
	

import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.*;
public class SalaryFrame extends JFrame{
	
	JTextField txtNum1= new JTextField();
	JTextField txtNum2= new JTextField();
	JTextField txtNum3= new JTextField();
	JTextField txtNum4= new JTextField();
    JTextField txtNum5= new JTextField();
    JTextField txtNum6= new JTextField();
    JTextField txtNum7= new JTextField();
    JTextField txtNum8= new JTextField();
   JTextField txtNum9= new JTextField();
   JTextField txtNum10= new JTextField();
   JTextField txtNum11= new JTextField();
   JTextField txtNum12= new JTextField();
   JTextField txtNum13= new JTextField();
   JTextField txtNum14= new JTextField();
   JTextField txtNum15= new JTextField();
   JTextField txtNum16= new JTextField();
   JTextField txtNum17= new JTextField();
   JTextField txtNum18= new JTextField();
   JTextField txtNum19= new JTextField();
   JTextField txtNum20= new JTextField();
   JTextField txtNum21= new JTextField();
   JTextField txtNum22= new JTextField();
   JTextField txtNum23= new JTextField();
   JTextField txtNum24= new JTextField();
   
	
	ImageIcon icon = new ImageIcon("moon bilog na buwan.jpg");
	ImageIcon BgImage = new ImageIcon (new ImageIcon("purple.jpg").getImage().getScaledInstance(1000, 1000, Image.SCALE_SMOOTH) );
	
	JLabel lbltxtNum1= new JLabel();
	JLabel lbltxtNum2= new JLabel();
	JLabel lbltxtNum3= new JLabel();
	JLabel lbltxtNum4= new JLabel();
	JLabel lbltxtNum5= new JLabel();
	JLabel lbltxtNum6= new JLabel();
	JLabel lbltxtNum7= new JLabel();
	JLabel lbltxtNum8= new JLabel();
	JLabel lbltxtNum9= new JLabel();
	JLabel lbltxtNum10= new JLabel();
	JLabel lbltxtNum11= new JLabel();
	JLabel lbltxtNum12= new JLabel();
	JLabel lbltxtNum13= new JLabel();
	JLabel lbltxtNum14= new JLabel();
	JLabel lbltxtNum15= new JLabel();
	JLabel lbltxtNum16= new JLabel();
	JLabel lbltxtNum17= new JLabel();
	JLabel lbltxtNum18= new JLabel();
	JLabel lbltxtNum19= new JLabel();
	JLabel lbltxtNum20= new JLabel();
	JLabel lbltxtNum21= new JLabel();
	JLabel lbltxtNum22= new JLabel();
	JLabel lbltxtNum23= new JLabel();
	JLabel lbltxtNum24= new JLabel();

	
	JButton btnAdd= new JButton();
	
	JPanel panel = new JPanel();

	
	
	
	
	SalaryFrame(){
		this.setSize(750, 750);
		this.setLocationRelativeTo(null);
		this.setTitle("Salary Payroll Calculator");
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.getContentPane().setBackground(Color.black);
		this.setIconImage(icon.getImage());
		this.setContentPane(new JLabel (BgImage));
		
		this.add(panel);
		
		panel.setBounds(350, 0, 550, 750);
		panel.setBackground(Color.decode("#c8b6ff"));
		
		
		
		txtNum1.setBounds(150, 50, 150, 30);
		txtNum2.setBounds(150, 90, 150, 30);
		txtNum3.setBounds(150, 130, 150, 30);
		txtNum4.setBounds(150, 160, 150, 30);
		txtNum5.setBounds(150, 190, 150, 30);
		txtNum6.setBounds(150, 190, 150, 30);
		txtNum7.setBounds(150, 190, 150, 30);
		txtNum8.setBounds(150, 190, 150, 30);
		txtNum12.setBounds(500, 190, 150, 30);
		txtNum13.setBounds(500, 190, 150, 30);
		
		
		
		
	
		
		txtNum1.setBounds(150, 50, 150, 30);
		lbltxtNum1.setBounds(30, 50, 150, 30);
		lbltxtNum1.setText("Employee Name: ");
		lbltxtNum1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum1.setForeground(Color.black);
		
		
		txtNum2.setBounds(150, 90, 150, 30);
		lbltxtNum2.setBounds(30, 90, 150, 30);
		lbltxtNum2.setText("Employee ID: ");
		lbltxtNum2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum2.setForeground(Color.black);
		
		txtNum3.setBounds(150, 130, 150, 30);
		lbltxtNum3.setBounds(30, 130, 150, 30);
		lbltxtNum3.setText("Job: ");
		lbltxtNum3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum3.setForeground(Color.black);
		
		txtNum4.setBounds(150, 170, 150, 30);
		lbltxtNum4.setBounds(30, 170, 150, 30);
		lbltxtNum4.setText("Position: ");
		lbltxtNum4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum4.setForeground(Color.black);
		
		txtNum5.setBounds(180, 210, 120, 30);
		lbltxtNum5.setBounds(30, 210, 150, 30);
		lbltxtNum5.setText("Hour/s Accumulated: ");
		lbltxtNum5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum5.setForeground(Color.black);
		
		txtNum6.setBounds(150, 250, 150, 30);
		lbltxtNum6.setBounds(30, 250, 150, 30);
		lbltxtNum6.setText("Rate per hour: ");
		lbltxtNum6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum6.setForeground(Color.black);
		
		txtNum7.setBounds(150, 295, 150, 30);
		lbltxtNum7.setBounds(30, 295, 150, 30);
		lbltxtNum7.setText("Overtime hour/s: ");
		lbltxtNum7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum7.setForeground(Color.black);
		
		txtNum8.setBounds(150, 330, 150, 30);
		lbltxtNum8.setBounds(30, 330, 150, 30);
		lbltxtNum8.setText("OT Rate: ");
		lbltxtNum8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum8.setForeground(Color.black);
		
		//txtNum9.setBounds(150, 365, 150, 30);
		lbltxtNum9.setBounds(30, 365, 150, 30);
		lbltxtNum9.setText("*Monthly Basis");
		lbltxtNum9.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lbltxtNum9.setForeground(Color.black);
		
		//txtNum10.setBounds(500, 50, 150, 30);
		lbltxtNum10.setBounds (400, 50, 150, 30);
		lbltxtNum10.setText("Employee info. ");
		lbltxtNum10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum10.setForeground(Color.black);
		
		txtNum11.setBounds(500, 90, 150, 30);
		lbltxtNum11.setBounds (400, 90, 150, 30);
		lbltxtNum11.setText("Name: ");
		lbltxtNum11.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum11.setForeground(Color.black);
		
		txtNum12.setBounds(500, 130, 150, 30);
		lbltxtNum12.setBounds (400, 130, 150, 30);
		lbltxtNum12.setText("ID No : ");
		lbltxtNum12.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum12.setForeground(Color.black);
		
		txtNum13.setBounds(500, 170, 150, 30);
		lbltxtNum13.setBounds (400, 170, 150, 30);
		lbltxtNum13.setText("Job: ");
		lbltxtNum13.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum13.setForeground(Color.black);
		
		txtNum14.setBounds(500, 210, 150, 30);
		lbltxtNum14.setBounds (400, 210, 150, 30);
		lbltxtNum14.setText("Position: ");
		lbltxtNum14.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum14.setForeground(Color.black);
		
		txtNum15.setBounds(540, 250, 110, 30);
		lbltxtNum15.setBounds (400, 250, 150, 30);
		lbltxtNum15.setText("Hour/s Accumulated: ");
		lbltxtNum15.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum15.setForeground(Color.black);
		
		txtNum16.setBounds(500, 290, 150, 30);
		lbltxtNum16.setBounds (400, 290, 150, 30);
		lbltxtNum16.setText("Rate per hour: ");
		lbltxtNum16.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum16.setForeground(Color.black);
		
		txtNum17.setBounds(500, 330, 150, 30);
		lbltxtNum17.setBounds (400, 330, 150, 30);
		lbltxtNum17.setText("OT hour/s: ");
		lbltxtNum17.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum17.setForeground(Color.black);
		
		txtNum18.setBounds(500, 365, 150, 30);
		lbltxtNum18.setBounds (400, 365, 150, 30);
		lbltxtNum18.setText("OT Rate: ");
		lbltxtNum18.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum18.setForeground(Color.black);
		
		txtNum19.setBounds(500, 400, 150, 30);
		lbltxtNum19.setBounds (400, 400, 150, 30);
		lbltxtNum19.setText("Gross Salary: ");
		lbltxtNum19.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum19.setForeground(Color.black);
		
		txtNum20.setBounds(540, 440, 110, 30);
		lbltxtNum20.setBounds (400, 440, 150, 30);
		lbltxtNum20.setText("SSS Contribution: ");
		lbltxtNum20.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum20.setForeground(Color.black);
		
		txtNum21.setBounds(560, 480, 95, 30);
		lbltxtNum21.setBounds (400, 480, 160, 30);
		lbltxtNum21.setText("Pag-Ibig Contribution: ");
		lbltxtNum21.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum21.setForeground(Color.black);
		
		txtNum22.setBounds(570, 520, 90, 30);
		lbltxtNum22.setBounds (400, 520, 250, 30);
		lbltxtNum22.setText("Phil-Health Contribution: ");
		lbltxtNum22.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum22.setForeground(Color.black);
		
		txtNum23.setBounds(500, 565, 150, 30);
		lbltxtNum23.setBounds (400, 565, 150, 30);
		lbltxtNum23.setText("Income Tax: ");
		lbltxtNum23.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum23.setForeground(Color.black);
		
		txtNum24.setBounds(500, 600, 150, 30);
		lbltxtNum24.setBounds (400, 600, 150, 30);
		lbltxtNum24.setText("Net Pay: ");
		lbltxtNum24.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbltxtNum24.setForeground(Color.black);
		
		
		
		btnAdd.setBounds (50, 600, 150, 30);
		btnAdd.setText ("Calculate");
		btnAdd.setFocusable(false);
		btnAdd.addActionListener(new ActionListener() {


			@Override
			public void actionPerformed(ActionEvent e) {
				
				double WH= Double.parseDouble(txtNum5.getText());
				double RPH= Double.parseDouble(txtNum6.getText());
				double OT= Double.parseDouble(txtNum7.getText());
				double OTR= Double.parseDouble(txtNum8.getText());
				
				double GS = (WH*RPH)+(OT*OTR);
				
				double sssanswer= GS * 0.05;
				String san= String.valueOf(sssanswer);
				
				double PIanswer= GS * 0.04;
				String pian= String.valueOf(PIanswer);
				
				double phianswer= 200;
				String ph = String.valueOf(phianswer);

			   
				double ITanswer= GS * 0.08;
			   String itan= String.valueOf(ITanswer);
			   
			   double NPanswer= GS-(sssanswer+PIanswer+phianswer+ITanswer);
			   String npan= String.valueOf(NPanswer);
			   
			   
				
				String grosssal = String.valueOf(GS);
				 
				 txtNum19.setText(String.format("%.2f", GS));
				 txtNum20.setText(String.format("%.2f", sssanswer));
				 txtNum21.setText(String.format("%.2f", PIanswer));
				 txtNum23.setText(String.format("%.2f", phianswer));
				 txtNum22.setText(String.format("%.2f", NPanswer));

				 txtNum24.setText(npan);
				 
				 String Name= txtNum1.getText();
				 txtNum11.setText(Name);
				 
				 String employeeid= txtNum2.getText();
				 txtNum12.setText(employeeid);
				 
				 String job= txtNum3.getText();
				 txtNum13.setText(job);
				 
				 String position= txtNum4.getText();
				 txtNum14.setText(position);
				 
				 String hours= txtNum5.getText();
				 txtNum15.setText(hours);
				 
				 String rateper= txtNum6.getText();
				 txtNum16.setText(rateper);
				 
				 String oh= txtNum7.getText();
				 txtNum17.setText(oh);
				 
				 String otrate= txtNum8.getText();
				 txtNum18.setText(otrate);
				 
				 
				
			}});
		
		
		
		
		
		
		
		
		
	
		this.add(btnAdd);
	    this.add(txtNum1);
	    this.add(txtNum2);
        this.add(txtNum3);
        this.add(txtNum4);
        this.add(txtNum5);
        this.add(txtNum6);
        this.add(txtNum7);
        this.add(txtNum8);
        this.add(txtNum9);
        this.add(txtNum10);
        this.add(txtNum11);
        this.add(txtNum12);
        this.add(txtNum13);
        this.add(txtNum14);
        this.add(txtNum15);
        this.add(txtNum16);
        this.add(txtNum17);
        this.add(txtNum18);
        this.add(txtNum19);
        this.add(txtNum20);
        this.add(txtNum21);
        this.add(txtNum22);
        this.add(txtNum23);
        this.add(txtNum24);
	    this.add(lbltxtNum1);
	    this.add(lbltxtNum2);
	    this.add(lbltxtNum3);
	    this.add(lbltxtNum4);
	    this.add(lbltxtNum5);
	    this.add(lbltxtNum6);
	    this.add(lbltxtNum7);
	    this.add(lbltxtNum8);
	    this.add(lbltxtNum9);
	    this.add(lbltxtNum10);
	    this.add(lbltxtNum11);
	    this.add(lbltxtNum12);
	    this.add(lbltxtNum13);
	    this.add(lbltxtNum14);
	    this.add(lbltxtNum15);
	    this.add(lbltxtNum16);
	    this.add(lbltxtNum17);
	    this.add(lbltxtNum18);
	    this.add(lbltxtNum19);
	    this.add(lbltxtNum20);
	    this.add(lbltxtNum21);
	    this.add(lbltxtNum22);
	    this.add(lbltxtNum23);
	    this.add(lbltxtNum24);
	    this.add(panel);
	    
	    this.setLayout(null);
		this.setVisible(true);
	}
 
	
}


	
 
 