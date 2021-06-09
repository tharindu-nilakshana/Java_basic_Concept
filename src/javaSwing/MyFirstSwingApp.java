package javaSwing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFirstSwingApp extends JFrame{//To Develop a Swing Application Need to extend JFrame Super Class

		public MyFirstSwingApp() {
			
			JLabel j1 = new JLabel("Hello");// Name the Label
			
			JLabel j2 = new JLabel("World");// Name the Label
		
		
			add(j1);// Add componnets to main UI
			add(j2);// Add componnets to main UI
			
			
			
			
			
			setLayout(new FlowLayout()); // Layout that we need to mention
			setVisible(true);// view the component - default value is false
			setSize(500, 300);// set dimension of the UI
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// stop the application when UI closed

		
		
	
}
}