package Lab;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Shape extends JPanel{
	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(10, 10, 100, 100);
	}

}
