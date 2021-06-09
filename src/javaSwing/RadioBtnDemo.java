package javaSwing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioBtnDemo extends JFrame{
	
	JTextField jt1;
	JRadioButton jr1,jr2;
	JCheckBox jc1,jc2;
	JLabel jl1;
	JButton jb1;

		public RadioBtnDemo() {
			
			
			// assigning value
			jt1 = new JTextField(15);
			jr1 = new JRadioButton("Male");
			jr2 = new JRadioButton("Female");
			jc1 = new JCheckBox("Dance");
			jc2 = new JCheckBox("Sing");
			jl1 = new JLabel("Answer");
			jb1 = new JButton("Go");
			
			
			//group the radio button
			ButtonGroup btnGrp = new ButtonGroup();
			btnGrp.add(jr1);
			btnGrp.add(jr2);
			
			
			//add all the component to the main jFrame
			add(jt1);
			add(jr1);
			add(jr2);
			add(jc1);
			add(jc2);
			add(jl1);
			add(jb1);
			
			
			
			ActionListener al = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					String name = jt1.getText();
					
					if(jr1.isSelected()) {
						name = "Mr ."+name;
					}else if(jr2.isSelected()) {
						
						name = "Miss ."+name;
					}
					
					if(jc1.isSelected()) {
						name = name + " likes Dancing";
					}
					if(jc2.isSelected()) {
						name = name + " likes Singing";
					}
					
					jl1.setText(name);
					
					
				}
			};
			
			
			jb1.addActionListener(al);
			
			
			setLayout(new FlowLayout());
			setVisible(true);
			setSize(500, 300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			
			
		}
	
}
