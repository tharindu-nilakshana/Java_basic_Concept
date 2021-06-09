package javaSwing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddNumbers extends JFrame implements ActionListener{

		//create text field and l label 
		JTextField jt1,jt2;
		JLabel jl1;
		
		
		
		//add numbers method
		
		public AddNumbers() {
			
			//set the labels
			jt1 = new JTextField(15);
			jt2 = new JTextField(15);
			jl1 = new JLabel("Answer");
			JButton jb1 = new JButton("Ok");
			
			//add all these to the main jframe
			add(jt1);
			add(jt2);
			add(jl1);
			add(jb1);
			
			//add the click event to the button
			jb1.addActionListener(this);
			
			
			
			setLayout(new FlowLayout());
			setVisible(true);
			setSize(500, 300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			
			
			
			
			
			
		}



		@Override
		public void actionPerformed(ActionEvent e) {
			
			int num1=0,num2=0;
			
			if (!jt1.getText().equals("")) { //check the entered value is not eqal to empty String
				num1 = Integer.parseInt(jt1.getText()); //convert value of first text field to Int values
			}
			if (!jt2.getText().equals("")) { //check the entered value is not eqal to empty String
				num2 = Integer.parseInt(jt2.getText());//convert value of second text field to Int values
			}
			
			int sum = 0;
			sum = num1+num2;
			if (sum == 0) {
				jl1.setText("Please enter some value");
			} else {

				jl1.setText(sum + "");
			}
			
		}
		
		
	
}
