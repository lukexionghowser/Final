import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;

import Lab.BarGraph;
import Lab.Priority;
import Lab.Scores;
import Lab.Shape;
import Lab.queue;
import Lab.stack;

public class Tab {

	final static String BUTTONPANEL = "Odds/Evens";
	final static String TEXTPANEL = "Math Problems";
	final static String SHAPEPANEL = "Shapes";
	final static String SCOREPANEL = "SCORE";
	final static String COLORPANEL = "COLOR";
	// change width as I develop the other features on tabs
	final static int extraWindowWidth = 150;

	Random rand = new Random();

	//Panel 1 - Odd/Evens
	JLabel label1 = new JLabel(Integer.toString(rand.nextInt(10)));
	JLabel oddListLabel = new JLabel("Your Odds: ");
	JLabel evenListLabel = new JLabel("Your Evens: ");
	JLabel oddStack = new JLabel("");
	JLabel evenStack = new JLabel(""); // put stack here
	JButton odd = new JButton("Odd");
	JButton even = new JButton("Even");
	JButton close = new JButton("Close");


	//Panel 2 - Math Equations
	int no1 = rand.nextInt(10);
	int no2 = rand.nextInt(10);
	String no11 = Integer.toString(no1);
	String no22 = Integer.toString(no2);
	JLabel equation = new JLabel(no1 + " + " + no2 + " = ");
	JLabel label21 = new JLabel("");
	JLabel label22 = new JLabel("");
	JButton submit = new JButton("Submit");
	JTextField text = new JTextField("", 2);
	// testing insertion for label on math equation tab
	// String eq = ("2 + 2 = ");
	String eq = queue.equation();
	String test = "4";

	//Panel 3 - Shapes
	JLabel label33 = new JLabel("Shape:");
	JLabel label34 = new JLabel("Shape:");
	JLabel label35 = new JLabel("Shape:");
	JTextField text3 = new JTextField("", 9);
	JTextField text30 = new JTextField("", 9);
	JTextField text31 = new JTextField("", 9);
	Shape myShape = new Shape();
	JButton submit3 = new JButton("Submit");

	//Panel 4 - Scores
	//graph
	JTable table = new JTable();
	JLabel label3 = new JLabel("SCORES");
	JLabel label40 = new JLabel("Odds/Evens");
	JLabel label41 = new JLabel("");
	JLabel label42 = new JLabel("Math");
	JLabel label43 = new JLabel("");
	JLabel label44 = new JLabel("Shapes");
	JLabel label45 = new JLabel("");
	JLabel queueLabel = new JLabel("TESTING");

	double[] values = new double[4];
	String[] names = new String[4];

	private class Button1Handler implements ActionListener {
		private String num;

		public void actionPerformed(ActionEvent e) {
			Random rand = new Random();

			// get the label # and save into variable
			String getNum = label1.getText();
			int newNum = Integer.parseInt(getNum);
			if (newNum % 2 == 0) {
				// create method to collect wrong++? in a class
				// add 1 for wrong
				Scores.countIncorrect.add(1);
				// count # of plays
				this.num = Integer.toString(rand.nextInt(10));
				// add random number to array
				Scores.evenList.add(newNum);

				String evenArray = Arrays.toString(Scores.evenList.toArray());
				String oddArray = Arrays.toString(Scores.oddList.toArray());
				// display list of odd numbers on gui
				evenStack.setText(evenArray);
				oddStack.setText(oddArray);
				// update random number on gui
				label1.setText(num);
				// String score = Integer.toString(Scores.totalOddEven());
				Scores.totalOddEven();
				//this is the original working score label
				label41.setText(Scores.totalOddEven());
				//adds score to a queue for display
				//queueLabel.setText(Scores.printQueue());
				String g = Scores.games.toString();
				//adds more than 1 score to queue & printing @
				//queueLabel.setText(Scores.games.toString());
				queueLabel.setText(g);

			} else {
				// count # of plays
				this.num = Integer.toString(rand.nextInt(10));
				// add number to array
				Scores.oddList.add(newNum);

				String evenArray = Arrays.toString(Scores.evenList.toArray());
				String oddArray = Arrays.toString(Scores.oddList.toArray());
				// display list of odd numbers on gui
				evenStack.setText(evenArray);
				oddStack.setText(oddArray);
				// update random number on gui
				label1.setText(num);
				Scores.totalOddEven();
				//this is the original working score label
				label41.setText(Scores.totalOddEven());
				//adds score to a queue for display
				//queueLabel.setText(Scores.printQueue()); //error from scores line 121
				//queueLabel.setText(Scores.games.toString());
				String g = Scores.games.toString();
				queueLabel.setText(g);
			}

		}
	}

	private class Button2Handler implements ActionListener {
		private String num;

		public void actionPerformed(ActionEvent e) {
			String getNum = label1.getText();
			int newNum = Integer.parseInt(getNum);
			if (newNum % 2 == 0) {
				// count # of plays
				this.num = Integer.toString(rand.nextInt(10));

				Scores.evenList.add(newNum);
				String evenArray = Arrays.toString(Scores.evenList.toArray());
				String oddArray = Arrays.toString(Scores.oddList.toArray());
				// display list of odd numbers on gui
				evenStack.setText(evenArray);
				oddStack.setText(oddArray);
				// update random number on gui
				label1.setText(num);
				///////////////////////////////////////////
				//this is the original working score label
				label41.setText(Scores.totalOddEven());
				////////////////////////
				//this adds score to queue for display
				String g = Scores.games.toString();
				queueLabel.setText(g);

			} else {
				// create method to collect wrong++? in a class
				// add 1 for wrong
				Scores.countIncorrect.add(1);
				// count # of plays
				this.num = Integer.toString(rand.nextInt(10));
				// add number to array
				Scores.oddList.add(newNum);
				String evenArray = Arrays.toString(Scores.evenList.toArray());
				String oddArray = Arrays.toString(Scores.oddList.toArray());
				// display list of odd numbers on gui
				evenStack.setText(evenArray);
				oddStack.setText(oddArray);
				// update random number on gui
				label1.setText(num);
				//////////////////////////////////////////////
				//this is the original working score label
				label41.setText(Scores.totalOddEven());
				///////////////////////////////////
				// this adds score to queue for display
				String g = Scores.games.toString();
				queueLabel.setText(g);
			}
		}
	}

	private class Button3Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(close, "Bye-Bye!");
		}
	}

	private class Button4Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			int x = Integer.parseInt(no11);
			int y = Integer.parseInt(no22);
			
			int sum = x+y;

			String input = text.getText();
			int in = Integer.parseInt(input);
			
			//confirmed i am getting the right sum and input
			//JOptionPane.showMessageDialog(submit, "Your Answer: " + in + " Correct Answer" + sum);

				if (in == sum) {
					// add to #correct stack
					Scores.countMath.add(1);
					//label21.setText(no11);
					//label22.setText(no22);
					//this equation label is not working	
					int a = rand.nextInt(10);
					int b = rand.nextInt(10);
					no11 = Integer.toString(a);
					no22 = Integer.toString(b);
					equation.setText(no11 + " + " + no22 + " = ");
					//this is working
					text.setText("");
					label43.setText(Scores.totalMath());
					JOptionPane.showMessageDialog(submit, "Good Job!");
				} else {
					// add to #wrong stack
					Scores.wrongMath.add(1);
					//label21.setText(no11);
					//label22.setText(no22);
					int a = rand.nextInt(10);
					int b = rand.nextInt(10);
					no11 = Integer.toString(a);
					no22 = Integer.toString(b);
					equation.setText(no11 + " + " + no22 + " = ");
					// this is working but its not updating equation
					text.setText("");
					// it is not saving the score
					label43.setText(Scores.totalMath());
					JOptionPane.showMessageDialog(submit, "Correct Answer: " + sum);
				}

			}
			
			 
			// JOptionPane.showMessageDialog(submit, wrong);
		
	}

	private class Button5Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//JOptionPane.showMessageDialog(submit3, "Check out your scores on the next Tab!");
			
			String getValue1 = text3.getText().toUpperCase();
			String getValue2 = text30.getText().toUpperCase();
			String getValue3 = text31.getText().toUpperCase();
			
			//circle, square, triangle
			/*
			if (getValue1 == "CIRCLE") {
				Scores.countShapes.add(1);
			 if (getValue2 == "SQUARE") {
				Scores.countShapes.add(1);
				if (getValue3 == "TRIANGLE") {
					Scores.countShapes.add(1);
				} else {
					Scores.wrongShapes.add(1);
				}
				Scores.wrongShapes.add(1);
				}
			 Scores.wrongShapes.add(1);
			 }
				/*else {
					Scores.wrongShapes.add(1);
				} else {
					Scores.wrongShapes.add(1);
				};*/
			
			
			/*
			if (getValue1 == "CIRCLE") {
				Scores.countShapes.add(1);
			} 
			else {
				Scores.wrongShapes.add(1);
			} 
			if (getValue2 == "SQUARE") {
				Scores.countShapes.add(1);
			} 
			else {
				Scores.wrongShapes.add(1);
			} 
			if (getValue3 == "TRIANGLE") {
				Scores.countShapes.add(1);
			} else {
				Scores.wrongShapes.add(1);
			}*/
			
			if (getValue1 == "CIRCLE" &&
					getValue2 == "SQUARE" &&
					getValue3 == "TRIANGLE")
			{
				Scores.countShapes.add(1);
				Scores.countShapes.add(1);
				Scores.countShapes.add(1);
			} else if  (getValue1 != "CIRCLE" &&
					getValue2 == "SQUARE" &&
					getValue3 == "TRIANGLE")
			{
				Scores.countShapes.add(1);
				Scores.countShapes.add(1);
				Scores.wrongShapes.add(1);
			} else if (getValue1 == "CIRCLE" &&
					getValue2 != "SQUARE" &&
					getValue3 == "TRIANGLE")
			{
				Scores.countShapes.add(1);
				Scores.countShapes.add(1);
				Scores.wrongShapes.add(1);
			} else if (getValue1 == "CIRCLE" &&
					getValue2 == "SQUARE" &&
					getValue3 != "TRIANGLE")
			{
				Scores.countShapes.add(1);
				Scores.countShapes.add(1);
				Scores.wrongShapes.add(1);
			} else if (getValue1 != "CIRCLE" &&
					getValue2 != "SQUARE" &&
					getValue3 == "TRIANGLE")
			{
				Scores.countShapes.add(1);
				Scores.wrongShapes.add(1);
				Scores.wrongShapes.add(1);
			} else if (getValue1 == "CIRCLE" &&
					getValue2 != "SQUARE" &&
					getValue3 != "TRIANGLE")
			{
				Scores.countShapes.add(1);
				Scores.wrongShapes.add(1);
				Scores.wrongShapes.add(1);
			} else if (getValue1 != "CIRCLE" &&
					getValue2 == "SQUARE" &&
					getValue3 != "TRIANGLE")
			{
				Scores.countShapes.add(1);
				Scores.wrongShapes.add(1);
				Scores.wrongShapes.add(1);
			} else if (getValue1 != "CIRCLE" &&
					getValue2 == "SQUARE" &&
					getValue3 == "TRIANGLE")
			{
				Scores.wrongShapes.add(1);
				Scores.wrongShapes.add(1);
				Scores.wrongShapes.add(1);
			}

			JOptionPane.showMessageDialog(submit3, "Check out your scores on the next Tab!" );
			label45.setText(Scores.totalShape());
			//use queue to display score
			queueLabel.setText(Scores.printQueue());
			
			text3.setText("");
			text30.setText("");
			text31.setText("");
		}
	}

	public void addComponentToPane(Container pane) {

		JTabbedPane tabbedPane = new JTabbedPane();

		// Create the "cards".
		JPanel card1 = new JPanel() {

			public Dimension getPreferredSize() {
				Dimension size = super.getPreferredSize();
				size.width += extraWindowWidth;
				return size;
			}

		};
		odd.addActionListener(new Button1Handler());
		even.addActionListener(new Button2Handler());
		close.addActionListener(new Button3Handler());

		card1.setLayout(new GridBagLayout());
		GridBagConstraints left0 = new GridBagConstraints();
		left0.anchor = GridBagConstraints.EAST;
		GridBagConstraints center0 = new GridBagConstraints();
		center0.anchor = GridBagConstraints.CENTER;
		GridBagConstraints right0 = new GridBagConstraints();
		right0.weightx = 1.0;
		right0.fill = GridBagConstraints.HORIZONTAL;
		right0.gridwidth = GridBagConstraints.REMAINDER;
		card1.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("images/monster.png"))), left0);
		// JLabel tester = new JLabel(test);
		// card1.add((tester),right0);
		// tester.setFont(tester.getFont().deriveFont(60f));
		card1.add((label1), right0);
		label1.setFont(label1.getFont().deriveFont(60f));
		// card1.add(new JLabel(""), right0);
		card1.add((odd), left0);
		card1.add((even), center0);
		card1.add(new JLabel(""), right0);
		card1.add((oddListLabel), left0);
		card1.add((oddStack), right0);
		card1.add((evenListLabel), left0);
		card1.add((evenStack), right0);
		// card1.add(close);
		card1.setBackground(Color.GREEN);

		JPanel card2 = new JPanel();

		submit.addActionListener(new Button4Handler());

		card2.setLayout(new GridBagLayout());
		GridBagConstraints left1 = new GridBagConstraints();
		left1.anchor = GridBagConstraints.EAST;
		GridBagConstraints center1 = new GridBagConstraints();
		center1.anchor = GridBagConstraints.CENTER;
		GridBagConstraints right1 = new GridBagConstraints();
		right1.weightx = 1.0;
		right1.fill = GridBagConstraints.HORIZONTAL;
		right1.gridwidth = GridBagConstraints.REMAINDER;
		card2.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("images/lion.png"))), left1);
		card2.add(new JLabel(""), right1);
		card2.add(equation, left1);
		equation.setFont(equation.getFont().deriveFont(40f));
		// card2.add(label2);
		card2.add(text, center1);
		card2.add(submit, right1);
		card2.setBackground(Color.ORANGE);

		JPanel card3 = new JPanel();

		submit3.addActionListener(new Button5Handler());

		card3.setLayout(new GridBagLayout());
		// card3.setLayout(new BoxLayout(card3, BoxLayout.Y_AXIS));
		GridBagConstraints left = new GridBagConstraints();
		left.anchor = GridBagConstraints.EAST;
		GridBagConstraints center = new GridBagConstraints();
		center.anchor = GridBagConstraints.CENTER;
		GridBagConstraints right = new GridBagConstraints();
		right.weightx = 1.0;
		right.fill = GridBagConstraints.HORIZONTAL;
		right.gridwidth = GridBagConstraints.REMAINDER;
		card3.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("images/circle.png"))), left);
		card3.add(label33, center);
		card3.add(text3, right);
		card3.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("images/square1.png"))), left);
		card3.add(label34, center);
		card3.add(text30, right);
		card3.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("images/triangle.png"))), left);
		card3.add(label35, center);
		card3.add(text31, right);
		card3.add(new JLabel(""), left);
		card3.add(submit3, center);
		card3.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		card3.setBackground(Color.cyan);

		JPanel card4 = new JPanel();

		card4.setLayout(new GridBagLayout());
		// card3.setLayout(new BoxLayout(card3, BoxLayout.Y_AXIS));
		GridBagConstraints left4 = new GridBagConstraints();
		left.anchor = GridBagConstraints.EAST;
		GridBagConstraints center4 = new GridBagConstraints();
		center4.anchor = GridBagConstraints.CENTER;
		GridBagConstraints right4 = new GridBagConstraints();
		right4.weightx = 1.0;
		right4.fill = GridBagConstraints.HORIZONTAL;
		right4.gridwidth = GridBagConstraints.REMAINDER;
		card4.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("images/trophy.png"))), left4);
		card4.add((label3), right4);
		label3.setFont(label3.getFont().deriveFont(40f));
		card4.add((label40), left4);
		label40.setFont(label40.getFont().deriveFont(20f));
		card4.add(new JLabel("          "), center4);
		card4.add((label41), right4);
		card4.add((label42), left4);
		label42.setFont(label42.getFont().deriveFont(20f));
		card4.add(new JLabel("          "), center4);
		card4.add((label43), right4);
		card4.add((label44), left4);
		label44.setFont(label44.getFont().deriveFont(20f));
		card4.add(new JLabel("          "), center4);
		card4.add((label45), right4);
		card4.add((queueLabel), left4);
		queueLabel.setFont(queueLabel.getFont().deriveFont(20f));
		card4.setBackground(Color.pink);

		tabbedPane.addTab(BUTTONPANEL, card1);
		tabbedPane.addTab(TEXTPANEL, card2);
		tabbedPane.addTab(SHAPEPANEL, card3);
		tabbedPane.addTab(SCOREPANEL, card4);

		pane.add(tabbedPane, BorderLayout.CENTER);

	}

	/**
	 * Create the GUI and show it. For thread safety, this method should be invoked
	 * from the event dispatch thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Class Games");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// tried to change size here but nothing happened
		// frame.setSize(300,200);

		// Create and set up the content pane.
		Tab demo = new Tab();
		demo.addComponentToPane(frame.getContentPane());

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
