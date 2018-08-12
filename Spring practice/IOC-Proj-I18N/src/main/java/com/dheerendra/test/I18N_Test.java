package com.dheerendra.test;

import java.awt.FlowLayout;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;

public class I18N_Test {
	public static void main(String[] args) {
		Locale locale=null;
		ResourceBundle rb=null;
		JFrame frame=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null;
	//	locale=new Locale(args[0],args[1]);
		locale =new Locale(args[0]);
		rb=ResourceBundle.getBundle("com/dheerendra/commons/App",locale);
		
		frame=new JFrame("I18N App");
		frame.setLayout(new FlowLayout());
		
		btn1=new JButton(rb.getString("label1"));
		btn2=new JButton(rb.getString("label2"));
		btn3=new JButton(rb.getString("label3"));
		btn4=new JButton(rb.getString("label4"));
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
