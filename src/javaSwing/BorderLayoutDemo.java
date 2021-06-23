package javaSwing;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutDemo{
	
	JFrame j;
	
	public BorderLayoutDemo() {
		
		createGui();		
		
	}
	
	
	private void createGui()
	{
		j = new JFrame("Border Layout");
		j.setLayout(new GridLayout(3,1));
		
		
		
		j.setLayout(new FlowLayout());
		j.setVisible(true);
		j.setSize(500, 300);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	public void createBorderLayout()
	{
		
		JPanel jPanle = new JPanel();
		jPanle.setSize(300, 300);
		
		BorderLayout bd = new BorderLayout();
		bd.setHgap(10);
		bd.setVgap(10);
		
		jPanle.setLayout(bd);
		
		jPanle.add(new JButton("Center"), BorderLayout.CENTER);
		
		jPanle.add(new JButton("Line Start"),BorderLayout.LINE_START);
		
		jPanle.add(new JButton("Line End"),BorderLayout.LINE_END);
		
		jPanle.add(new JButton("Line South"),BorderLayout.SOUTH);
		
		jPanle.add(new JButton("Line North"),BorderLayout.NORTH);
		
		
		j.add(jPanle);
		
		
		
	}
	
}
