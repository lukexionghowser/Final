import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;

import Lab.BarGraph;
import Lab.Shape;
import Lab.queue;

public class Tab {

	final static String BUTTONPANEL = "Odds/Evens";
	final static String TEXTPANEL = "Math Problems";
	final static String SHAPEPANEL = "Shapes";
	final static String SCOREPANEL = "SCORE";
	final static String COLORPANEL = "COLOR";
	// change width as I develop the other features on tabs
	final static int extraWindowWidth = 150;
	
	//WONT LET ME DO QUEUE.ENQUEUE() HERE
	JButton odd = new JButton("Odd");
	JButton even = new JButton("Even");
	JButton close = new JButton("Close");
	JButton submit = new JButton("Submit");
	JTextField text = new JTextField("", 2);
	//testing insertion for label on math equation tab
    //String eq = ("2 + 2 = ");
	String eq = queue.equation();
	int oe = queue.peek();
	String test = "4";
	//String peek = oe.toString();
	//int parse = Integer.parseUnsignedInt(oe);
	JLabel equation = new JLabel(eq); //error bc of horizontal alignment
	//JLabel label1 = new JLabel("Label 1");
	JLabel label1 = new JLabel(test); //Has to be a string - cant do peek()
	JLabel label2 = new JLabel("Label 2");
	
	JLabel label33 = new JLabel("Shape:");
	JTextField text3 = new JTextField("", 9);
	Shape myShape = new Shape();
	JButton submit3 = new JButton("Submit");
	//BufferedImage myPicture = ImageIO.read(this.getClass().getResource("/images/circle.JPG"));
	//JLabel label30 = new JLabel(new ImageIcon("images/circle.JPG"));
	
	//graph
	JTable table = new JTable();
	JLabel label3 = new JLabel("SCORES");
	JTextArea tArea2 = new JTextArea("Odd/Evens: ");
	JTextArea tArea3 = new JTextArea("Math: ");
	JTextArea tArea4 = new JTextArea("Shapes: ");
	double[] values = new double[4];
    String[] names = new String[4];
    
    
    

	
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
		
		card1.add(label1);
		card1.add(odd);
		card1.add(even);
		card1.add(close);
		card1.setBackground(Color.GREEN);

		JPanel card2 = new JPanel();
		
		submit.addActionListener(new Button4Handler());
		
		card2.add(equation); 
		//card2.add(label2);
		card2.add(text);
		card2.add(submit);
		card2.setBackground(Color.ORANGE);
		
		JPanel card3 = new JPanel();
		//Shape myShape = new Shape();
		
		//submit.addActionListener(new Button4Handler());
		card3.add(myShape);
		card3.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("images/circle.JPG"))));
		card3.add(label33);
		card3.add(text3);
		card3.add(submit3);
		//card3.setBounds(30, 30, 100, 100);
		card3.setBackground(Color.cyan);
		
		JPanel card4 = new JPanel();
		
		card4.add(table);
		card4.add(label3);
		card4.add(tArea2);
		card4.add(tArea3);
		card4.add(tArea4);		
		card4.setBackground(Color.pink);
		
		      //cp.add(p1);
		 
		
		/*
		card3.add(null, values[0] = 1, 0);
	    names[0] = "Odds/Evens";

	    values[1] = 2;
	    names[1] = "Math";

	    values[2] = 4;
	    names[2] = "Shapes";
	    
	    values[3] = 4;
	    names[3] = "Map";
*/
	    //card3.getRootPane().add(new BarGraph(values, names, "Your Scores"));

		//JPanel card5 = new JPanel();

		tabbedPane.addTab(BUTTONPANEL, card1);
		tabbedPane.addTab(TEXTPANEL, card2);
		tabbedPane.addTab(SHAPEPANEL, card3);
		tabbedPane.addTab(SCOREPANEL, card4);
		//tabbedPane.addTab(COLORPANEL, card5);

		pane.add(tabbedPane, BorderLayout.CENTER);
		//pane.add(card1, BorderLayout.CENTER);
		//pane.add(card2, BorderLayout.CENTER);
		//pane.add(card3, BorderLayout.CENTER);
		//pane.add(card4, BorderLayout.CENTER);
		
	}
	/**
	 * Create the GUI and show it. For thread safety, this method should be invoked
	 * from the event dispatch thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Class Games");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//tried to change size here but nothing happened
		//frame.setSize(300,200);
		
		// Create and set up the content pane.
		Tab demo = new Tab();
		demo.addComponentToPane(frame.getContentPane());
		
		//trying to create bargraph
/*
		double[] values = new double[4];
	    String[] names = new String[4];
	    values[0] = 1;
	    names[0] = "Odds/Evens";

	    values[1] = 2;
	    names[1] = "Math";

	    values[2] = 4;
	    names[2] = "Shapes";
	    
	    values[3] = 4;
	    names[3] = "Map";

	    frame.getContentPane().add(new BarGraph(values, names, "Your Scores"));

	    WindowListener wndCloser = new WindowAdapter() {
	      public void windowClosing(WindowEvent e) {
	        System.exit(0);
	      }
	    };
	    frame.addWindowListener(wndCloser);
	    frame.setVisible(true);
	  }
*/
		//Shape panel = new Shape();
		//frame.add(panel);

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
				// tried bargraph - it created 2nd window
				//trying to create bargraph
				/*
				double[] values = new double[4];
			    String[] names = new String[4];
			    values[0] = 1;
			    names[0] = "Odds/Evens";

			    values[1] = 2;
			    names[1] = "Math";

			    values[2] = 4;
			    names[2] = "Shapes";
			    
			    values[3] = 4;
			    names[3] = "Map";

			    frame.getContentPane().add(new BarGraph(values, names, "Your Scores"));
		/*
			    WindowListener wndCloser = new WindowAdapter() {
			      public void windowClosing(WindowEvent e) {
			        System.exit(0);
			      }
			    };
			    frame.addWindowListener(wndCloser);
			    frame.setVisible(true);
			  }*/

				
			}
		});
	}
}
