package view;

import javax.swing.*;
import java.awt.*;

public class NoteStaff extends JPanel {
	
	public int x = 20;
	
	NoteStaff() {
		setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		setSize(1000, 1000);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawOval(x, 20, 20, 20);
	}
}
