package javaSwing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxDemo {

		
		//create jframe

		JFrame frame;
	
		public ComboBoxDemo() {
			
			frame = new JFrame("My New Form");
			
			//create lable
			final JLabel label = new JLabel();
			label.setHorizontalAlignment(JLabel.CENTER);
			label.setSize(400, 100);
			
			//create button
			JButton b = new JButton("Click");
			b.setBounds(200, 100, 75,20); // We can set the x y coodinates of position of the button & with and height of the button
			b.setBackground(new Color(432));
			
			
			String jComvalue[] = {"Java",".Net","C#","PHP"};
			
			JComboBox jCom = new JComboBox(jComvalue);
			jCom.setBounds(50, 100, 90, 20);
			
			
			
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					String selectLanguage = "Selected Value - " + jCom.getItemAt(jCom.getSelectedIndex());
					label.setText(selectLanguage);
					
				}
			});
			
			
			
			frame.add(jCom);
			frame.add(label);
			frame.add(b);
			
			frame.setLayout(null);
			frame.setVisible(true);
			frame.setSize(500, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


			
			
		}
	
	
	
	
}
