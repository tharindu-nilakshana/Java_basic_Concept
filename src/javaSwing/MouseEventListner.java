package javaSwing;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import java.awt.event.KeyAdapter;


public class MouseEventListner extends JFrame{

	
	public MouseEventListner() {
		
	addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				
				int x = e.getX();
				int y  =e.getY();
				
				System.out.println(" Locatiion --"+x+" "+y);
			}
			
		});
	
		
		
		
		
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	
	

}
