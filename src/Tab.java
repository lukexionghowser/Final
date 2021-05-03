import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.swing.*;

import Lab.BarGraph;
import Lab.BinaryTree;
import Lab.MyInputVerifier;
import Lab.Node;
import Lab.Priority;
import Lab.Scores;
import Lab.SelectionSort;
import Lab.Shape;
import Lab.Tree;
import Lab.queue;
import Lab.stack;


public class Tab {

	final static String BUTTONPANEL = "Odds/Evens";
	final static String TEXTPANEL = "Math Problems";
	final static String SHAPEPANEL = "Shapes";
	final static String SCOREPANEL = "SCORE";
	final static String TREEPANEL = "Chart";
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

	InputVerifier verifier = new MyInputVerifier();
	//textField1.setInputVerifier(verifier);

	//Panel 4 - Scores
	JTable table = new JTable();
	JLabel label3 = new JLabel("SCORES");
	JLabel label40 = new JLabel("Odds/Evens");
	JLabel label41 = new JLabel("");
	JLabel label42 = new JLabel("Math");
	JLabel label43 = new JLabel("");
	JLabel label44 = new JLabel("Shapes");
	JLabel label45 = new JLabel("");
	JLabel queueLabel = new JLabel("TESTING");
	JLabel queueLabel2 = new JLabel("Test2");
	private String[] imageList;
	
	////Panel 5 - Planets
	ImageIcon p1 = createImageIcon("images/p4.png", "Good Start!");
	ImageIcon p2 = createImageIcon("images/mercury.png", "Keep Going!");
	ImageIcon p3 = createImageIcon("images/saturn.png", "Awesome!");
	ImageIcon p4 = createImageIcon("images/pluto.png", "Flying High!");
	ImageIcon p5 = createImageIcon("images/p3.png", "Almost home!");
	ImageIcon p33 = createImageIcon("images/p33.png", "You did it!");
	ImageIcon astro = createImageIcon("images/astro.png", "You did it!");
	JLabel label50 = new JLabel("PLANETS DISCOVERED");
	JLabel label51 = new JLabel();
	JLabel label52 = new JLabel();
	JLabel label53 = new JLabel();
	JLabel label54 = new JLabel();
	JLabel label55 = new JLabel();
	JLabel label56 = new JLabel();
	JLabel label58 = new JLabel();
	JLabel labelastro = new JLabel("", astro, JLabel.CENTER);
	JButton button57 = new JButton("Blast Off!");
	JButton tripLog = new JButton("Trip Log");

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
				String sort = Scores.SelectionSorter();
				//JOptionPane.showMessageDialog(submit, "Saved to Queue: " + Scores.SelectionSorter());

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
				label41.setText(Scores.totalOddEven());
				
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
				label41.setText(Scores.totalOddEven());
				
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
				label41.setText(Scores.totalOddEven());
				
				String g = Scores.games.toString();
				
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
			
			//if (text.getText().equals("") || !(Pattern.matches("^[0-9]+$", text.getText()))) {
			 //    JOptionPane.showMessageDialog(null, " Enter Numbers Only ");
			 //  }

				if (in == sum ||  !(Pattern.matches("^[0-9]+$", text.getText()))) {
					// add to #correct stack
					Scores.countMath.add(1);
					int a = rand.nextInt(10);
					int b = rand.nextInt(10);
					no11 = Integer.toString(a);
					no22 = Integer.toString(b);
					equation.setText(no11 + " + " + no22 + " = ");
					text.setText("");
					label43.setText(Scores.totalMath());
				
				} else if (input.equals("") || !(Pattern.matches("^[0-9]+$", input))) 
				{
				 JOptionPane.showMessageDialog(null, " Enter Numbers Only ");
				
				} else {
					// add to #wrong stack
					Scores.wrongMath.add(1);
					int a = rand.nextInt(10);
					int b = rand.nextInt(10);
					no11 = Integer.toString(a);
					no22 = Integer.toString(b);
					equation.setText(no11 + " + " + no22 + " = ");
					text.setText("");
					label43.setText(Scores.totalMath());
					JOptionPane.showMessageDialog(submit, "Correct Answer: " + sum);
					   }
				}

			
	

	}

	private class Button5Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String getValue1 = text3.getText();
			String getValue2 = text30.getText();
			String getValue3 = text31.getText();
			
			if (getValue1.toUpperCase().contentEquals("CIRCLE")) {
				Scores.countCircle.add(1);
			}else {
				Scores.wrongShapes.add(1);
				if (getValue1.equals("") || (Pattern.matches("^[0-9]+$", getValue1))) {
				     JOptionPane.showMessageDialog(null, " Enter letters Only ");
		}
			}
			
			 if (getValue2.toUpperCase().contentEquals( "SQUARE")) {
				Scores.countSquare.add(1);
			 }else {
					Scores.wrongShapes.add(1);
					if (getValue2.equals("") || (Pattern.matches("^[0-9]+$", getValue2))) {
					     JOptionPane.showMessageDialog(null, " Enter letters Only ");
			}
				}
				
				if (getValue3.toUpperCase().contentEquals( "TRIANGLE")) {
					Scores.countTriangle.add(1);
			} else {
				Scores.wrongShapes.add(1);
				if (getValue3.equals("") || (Pattern.matches("^[0-9]+$", getValue3))) {
					     JOptionPane.showMessageDialog(null, " Enter letters Only ");
			}
			} 
	
			JOptionPane.showMessageDialog(submit3, "Check out your scores on the next Tab!" );
			label45.setText(Scores.totalShape2());
			
			text3.setText("");
			text30.setText("");
			text31.setText("");
	
			
			 
				}
	}
	private class Button57Handler implements ActionListener {
		private String num;

		public void actionPerformed(ActionEvent e) {
			
			//IF STATEMENT USING BINARY TREE AND SCORES
			//BinaryTree tree = new BinaryTree();
			
			Tree tree = new Tree();

			// GET TEXT FROM SCORE PANEL LABELS
			String getOE = label41.getText();
			Double newOE = Double.parseDouble(getOE);
			String getM = label43.getText();
			Double newM = Double.parseDouble(getM);
			String getS = label45.getText();
			Double newS = Double.parseDouble(getS);
			
			double mPlays = Scores.countMath.size();
			double oePlays = Scores.oddList.size() + Scores.evenList.size();
			double sPlays = 1.0;

			if (oePlays > 3.0 && newOE > 75.0) {
			label51.setIcon(p1);
			tree.add("Blasting off from Earth!", 1);
			} else {
				tree.add("Got a little lost!", 1);
			}

			if(mPlays > 3.0 && newM > 75.0) {
				label53.setIcon(p3);
				tree.add("You reached Saturn!", 2);
			} else {
				tree.add("Uh oh. Need to work on my math!", 2);
			}
			
			if(sPlays > 0 && newS > 75.0) {
				label55.setIcon(p5);
				tree.add("Looks like a new planet!", 3);
			} else {
				tree.add("Keep working on math!", 3);
			}
			
			if (oePlays > 6.0 && newOE > 75.0) {
				label56.setIcon(p33);
				tree.add("Another new planet!", 4);
			} else {
				tree.add("Working on math.", 4);
			}
			
			if(mPlays > 6.0 && newM > 75.0) {
				label54.setIcon(p4);
				tree.add("Pluto!", 5);
			} else {
				tree.add("Math will help you get there!", 5);
			}
			if (oePlays > 10.0 && newOE > 75.0) {
				label52.setIcon(p2);
				tree.add("Mercury!", 6);
			} else {
				tree.add("Better luck next time!", 6);
			}
			//blank
			//String x = tree.inorderTraversal(node).toString();
			/*
			Stack<String> stack1 = new Stack<String>();
			while(!BinaryTree.TripLog.isEmpty()) {
				String x = BinaryTree.TripLog.dequeue();
				stack1.push(temp);
			}
			Arrays.toString(stack1.toArray());*/
			//this freezes the blast off button
			//Lab.BinaryTreeNode node = tree.convertList2Binary(tree.root);
			//String x = BinaryTree.convertList2Binary(node).toString();
			//Integer[] values = extractValues(n).toArray(new Integer[] {});
			//String arr0 = (Arrays.toString(tree.convertList2Binary(tree.root)));
			String arr = (Arrays.toString(Scores.stackM.toArray()));
			//String arr2 = (Arrays.toString());
			 //ArrayList<String> list = new ArrayList<String>();
			 //Double[] arr1 = (Double[]) Scores.stackM.toArray();
			 //String arr2 = SelectionSort.sort(arr1); //this array has doubles
			
			/*// tried this to see if i can sort strings
			 int i,j;
			  String key;
			  String x="";
			  String[] inputArray = (String[]) Scores.stackM.toArray();
			  //String[] inputArray = {"E","D","C","B","A","B"};
			 // System.out.println(Arrays.toString(inputArray));
			  for (j = 1; j < inputArray.length; j++) { //the condition has changed
			    key = inputArray[j];
			    i = j - 1;
			    while (i >= 0) {
			      if (key.compareTo(inputArray[i]) > 0) {//here too
			        break;
			      }
			      inputArray[i + 1] = inputArray[i];
			      i--;
			    }
			    inputArray[i + 1] = key;
			    //System.out.println(Arrays.toString(inputArray));
			    x = (Arrays.toString(inputArray));
			  }
			 // System.out.println(Arrays.toString(inputArray));
			  x = (Arrays.toString(inputArray));
			*/
			String x = tree.printInorder(); //showing up blank
			// x.toString() //the dialogbox doesn't appear
			// tree.printInorder().toCharArray() // doesnt appear
			String y = tree.linealNotation();
			//String y = treeToString(tree);
			//String stringValue = tree.convertValueToText(value, isSelected, expanded, leaf, row, hasFocus);
			
			JOptionPane.showMessageDialog(button57, "Trip Log: "  );
		//create label and set text. See if it will print tree nodes
			//label58.setText(tree.inorderTraversal(node));
			// this just shows [] in label
			//label58.setText("");
			//^ this size() was 0 so its not saving into stack from traversal method
			//BinaryTree.inorderTraversal(node); //blank
			//tree.toString(); //blank
			
		}
		
		
		}
	
	private class Button58Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {

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
		
		//text3.setInputVerifier(verifier);
		//text30.setInputVerifier(verifier);
		//text31.setInputVerifier(verifier);

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
		card4.setBackground(Color.pink);
		
		JPanel card5 = new JPanel();
		
		//card5.add(new JLabel());
		//card5.setLayout(new BoxLayout(card5, BoxLayout.Y_AXIS));
		card5.setLayout(new GridBagLayout());
		GridBagConstraints left5 = new GridBagConstraints();
		left5.anchor = GridBagConstraints.EAST;
		GridBagConstraints center5 = new GridBagConstraints();
		center5.anchor = GridBagConstraints.CENTER;
		GridBagConstraints right5 = new GridBagConstraints();
		right5.weightx = 1.0;
		right5.fill = GridBagConstraints.HORIZONTAL;
		right5.gridwidth = GridBagConstraints.REMAINDER;
		card5.add((new JLabel()), left);
		card5.add((label50),center);
		card5.add((new JLabel()), right);
		label50.setFont(queueLabel.getFont().deriveFont(20f));
		//card5.add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("images/stary.JPG"))));
		card5.add((label51), left);
		card5.add((label52), center);
		card5.add((label53), right);
		card5.add((label54), left);
		card5.add((labelastro), center);
		card5.add((label55), right);
		card5.add((new JLabel(new ImageIcon(getClass().getClassLoader().getResource("images/rocket1.png")))), left);
		card5.add((button57), center);
		card5.add((label56), right);
		card5.add((label58), left);
		card5.setBackground(Color.black);
		
		button57.addActionListener(new Button57Handler());
		tripLog.addActionListener(new Button58Handler());

		tabbedPane.addTab(BUTTONPANEL, card1);
		tabbedPane.addTab(TEXTPANEL, card2);
		tabbedPane.addTab(SHAPEPANEL, card3);
		tabbedPane.addTab(SCOREPANEL, card4);
		tabbedPane.addTab(TREEPANEL, card5);

		pane.add(tabbedPane, BorderLayout.CENTER);
		
		

	}

	/** Returns an ImageIcon, or null if the path was invalid. */
	private ImageIcon createImageIcon(String path,
	                                           String description) {
	    java.net.URL imgURL = getClass().getResource(path);
	    if (imgURL != null) {
	        return new ImageIcon(imgURL, description);
	    } else {
	        System.err.println("Couldn't find file: " + path);
	        return null;
	    }
	}

	/**
	 * Create the GUI and show it. For thread safety, this method should be invoked
	 * from the event dispatch thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("Class Games");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create and set up the content pane.
		Tab demo = new Tab();
		demo.addComponentToPane(frame.getContentPane());

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {

		try {
			
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

		UIManager.put("swing.boldMetal", Boolean.FALSE);

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();

			}
		});
	}
}
	
