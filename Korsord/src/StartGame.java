import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
//PATRIC, ANDREAS och ADAM
public class StartGame extends Grid {
	public static String field1;
	public static String field2;	
	public static void main(String[] args){
	JLabel infoTitle = new JLabel("Enter GameGrid values Muthafukka!");
	JLabel info1 = new JLabel();
	JLabel info2 = new JLabel();
	JTextField jtfText1, jtfText2;
    JButton apply = new JButton("CREATE GRID");
	String disp = "";
	

	

	
	JFrame jp = new JFrame();
		
		jp.setTitle("Tutorial 31");
		jp.setSize(550,215);
		jp.setLocation(400, 200);
		jp.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		
		//Text outprints

		infoTitle.setFont(new Font("Arial", 2, 20));
		jp.add(infoTitle); 
		
		info1 = new JLabel("X:");
		jp.add(info1);
		info2 = new JLabel("Y:");
		jp.add(info2);
		jtfText1 = new JTextField(10);
		jtfText2 = new JTextField(10);
		jp.add(jtfText1);
		jp.add(jtfText2);
		jp.add(apply);
		apply.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				  field1 = jtfText1.getText();
				  field2 = jtfText2.getText();

				  jp.dispose();
				  Grid gridOpen = new Grid();
//				  new JFrame().setVisible(true);
				
				   
			}
		});
		
	
	
		jp.setLayout(new FlowLayout(1,150,20));
		
		
		  jp.setVisible(true);
	
	}
}
