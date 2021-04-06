import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tab {

	final static String BUTTONPANEL = "Odds/Evens";
	final static String TEXTPANEL = "Math Problems";
	// change width as I develop the other features on tabs
	final static int extraWindowWidth = 100;

	JButton odd = new JButton("Odd");
	JButton even = new JButton("Even");
	JButton close = new JButton("Close");
	JButton submit = new JButton("Submit");
	JTextField text = new JTextField("TextField", 20);
	
	private class Button1Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(odd,"Button 1");
		}
	}
	private class Button2Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(even, "Button 2");
		}
	}
	private class Button3Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(close, "Bye-Bye!");
		}
	}
	private class Button4Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JOptionPane.showMessageDialog(submit, "Your Answer");
		}
	}
	
	public void addComponentToPane(Container pane) {
		JTabbedPane tabbedPane = new JTabbedPane();

		// Create the "cards".
		JPanel card1 = new JPanel() {
			
			//JTextField myOutput = new JTextField("someInitialValue", 20);
			
			// Make the panel wider than it really needs, so
			// the window's wide enough for the tabs to stay
			// in one row.			
			public Dimension getPreferredSize() {
				Dimension size = super.getPreferredSize();
				size.width += extraWindowWidth;
				return size;
			}
		};
		odd.addActionListener(new Button1Handler());
		even.addActionListener(new Button2Handler());
		close.addActionListener(new Button3Handler());
		
		card1.add(odd);
		card1.add(even);
		card1.add(close);

		JPanel card2 = new JPanel();
		
		submit.addActionListener(new Button4Handler());
		
		card2.add(text);
		card2.add(submit);

		tabbedPane.addTab(BUTTONPANEL, card1);
		tabbedPane.addTab(TEXTPANEL, card2);

		pane.add(tabbedPane, BorderLayout.CENTER);
		
		
	}
	/**
	 * Create the GUI and show it. For thread safety, this method should be invoked
	 * from the event dispatch thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Math Games");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create and set up the content pane.
		Tab demo = new Tab();
		demo.addComponentToPane(frame.getContentPane());
		
		// try to add text printing area
		//JTextField myOutput = new JTextField(16);
		//myOutput.setText("some text");

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {

		/* Use an appropriate Look and Feel */
		try {
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		/* Turn off metal's use of bold fonts */
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		// Schedule a job for the event dispatch thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
