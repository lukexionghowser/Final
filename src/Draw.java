import javax.swing.JFrame;

import Lab.Shape;

public class Draw {
	
	public static void main(String[] arguments) {
		Shape panel = new Shape();
		
		//create a basic JFrame
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("JFrame Color Ex");
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// add panel to main frame
		frame.add(panel);
		
		frame.setVisible(true);
	}

}
