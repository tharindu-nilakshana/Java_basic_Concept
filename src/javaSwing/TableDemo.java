package javaSwing;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableDemo extends JFrame{

	
	//create table 
	JTable table;
	
	public TableDemo() {
		
		// create headers and data 
		String[] header = {"Name","Address","Gender"};
		
		Object[][] data = {
				{"Anne","Colombo","Female"},
				{"Peter","Rathnapura","Male"},
				{"Kamal","Anuradhapura","Male"},
				{"Anura","Kaluthara","Male"},
				{"Anura","Kaluthara","Male"},
				{"Anura","Kaluthara","Male"},
				{"Anura","Kaluthara","Male"}
		};
		
		
		//assigning the table 
		
		table = new JTable(data,header);
		
		//set the diamention
		table.setPreferredScrollableViewportSize(new Dimension(500,50));
		
		
		//add scroll bar to the table
		JScrollPane jsp = new JScrollPane(table);
		
		//add the modified table
		add(jsp);
		
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
		
		
		
		
		
		
		
	}
	
}
