package javaSwing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class Caller extends JFrame implements ActionListener{

	JButton button;
	JProgressBar jProgressBar;
	int i;
	public Caller() {
		
		
		button = new JButton("Go...");
		jProgressBar = new JProgressBar(0,20);
		
		Timer t = new Timer(100,this);
		
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				t.start();
				
			}
		};
		
		
		button.addActionListener(al);
		add(button);
		add(jProgressBar);
		
		
		
		
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	//timer action
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(i==20) {
			new AddNumbers();
			dispose(); // close exsisting jframe
		}
		
		i++;
		jProgressBar.setValue(i);
	}
	
	
}
