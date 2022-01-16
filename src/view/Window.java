package view;


import javax.swing.*;
import java.awt.*;

public class Window extends JPanel {

	private Window() {
		super(new GridLayout(1, 0));
//		setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

		JLabel placeholder = new JLabel("This project is not yet cool");
		placeholder.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		add(placeholder);
		
		add(new NoteStaff());
		
	}


	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Music Trainer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Create and set up the content pane.
		JComponent newContentPane = new Window();
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);
		frame.setSize(550, 550);
		
		//Display the window.
		frame.pack();
		frame.setVisible(true);
		
	}

	public static void conjureTheGUIMonster() {
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(Window::createAndShowGUI);
	}
}
