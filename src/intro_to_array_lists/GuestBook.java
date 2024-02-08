package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	JFrame frame;
	JPanel panel;
	JButton button1, button2;
	ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.Start();
		
	}
	void Start() {
		
		button1 = new JButton("Add name");
		button1.addActionListener(this);
		button2 = new JButton("View names");
		button2.addActionListener(this);
		panel = new JPanel();
		frame = new JFrame();
		
	panel.add(button1);
	panel.add(button2);
	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
		
	}
	// Guest #1: janette array
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(button1)) {
			list.add(JOptionPane.showInputDialog("Name: "));
			
		}else {
			String string = "";
			for(int i = 0;i<list.size();i++) {
				string=string+"Guest #"+(i+1)+": "+list.get(i)+"\n";
			}
			JOptionPane.showMessageDialog(null,string);
		}
	}
}
