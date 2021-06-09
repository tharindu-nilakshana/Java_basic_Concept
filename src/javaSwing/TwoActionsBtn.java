package javaSwing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TwoActionsBtn extends JFrame{

	//in this we use java two actions to different two buttons 
	public TwoActionsBtn() {
		
		JTextField jt1, jt2;
		JLabel jl,jl2;
		
		jt1 = new JTextField(15);
		jt2 = new JTextField(15);
		JButton jb1 = new JButton("Add");
		JButton jb2 = new JButton("Substrat");
		jl = new JLabel("Result");
		jl2 = new JLabel();
		
		add(jt1);
		add(jt2);
		add(jb1);
		add(jl);
		add(jb2);
		add(jl2);
		
		
		//create action listner for Add Numbers
		ActionListener al1 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int num1 = 0;
				int num2 = 0;
				if (!jt1.getText().equals("")) { //check the entered value is not eqal to empty String
					num1 = Integer.parseInt(jt1.getText()); //convert value of first text field to Int values
				}
				if (!jt2.getText().equals("")) { //check the entered value is not eqal to empty String
					num2 = Integer.parseInt(jt2.getText());//convert value of second text field to Int values
				}

				int sum = num1 + num2;
				if (sum == 0) {
					jl.setText("Please enter some value");
				} else {

					jl.setText(sum + "");
				}
				
			}
		};
		
		
		//create action listner for substract numbers
		ActionListener al2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int num1 = 0;
				int num2 = 0;
				if (!jt1.getText().equals("")) { //check the entered value is not eqal to empty String
					num1 = Integer.parseInt(jt1.getText()); //convert value of first text field to Int values
				}
				if (!jt2.getText().equals("")) { //check the entered value is not eqal to empty String
					num2 = Integer.parseInt(jt2.getText());//convert value of second text field to Int values
				}

				int sum = num1 - num2;
				if (sum == 0) {
					jl2.setText("Please enter some value");
				} else {

					jl2.setText(sum + "");
				}
				
			}
		};
		
		
		// add created action lisners to specific buttons
		
		jb1.addActionListener(al1);
		jb2.addActionListener(al2);

		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
	
	
	
	
}
