import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentListener;

import org.w3c.dom.events.DocumentEvent;


public class Practice {

		 static String lastValidValue;
		 
		  public static void main(String... args) {
		    JFrame frame = new JFrame();
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    JPanel contentPane = new JPanel();
		    
		    String num1 = "8";
		    String num2 = "1";
		    
		    int numOne = Integer.parseInt(num1);
		    int numtwo = Integer.parseInt(num2);
		    
		    int answer = numOne + numtwo;

		    JFormattedTextField ftf = new JFormattedTextField(
		        NumberFormat.getNumberInstance());
		    JLabel numUno = new JLabel(num1);
		    JLabel numDos = new JLabel(num2);

		    ftf.setColumns(2);
		    ftf.setFocusLostBehavior(JFormattedTextField.PERSIST);
		   // ftf.setValue(100);
		   // lastValidValue = "100";
		    ftf.addCaretListener(e->{
		        //System.out.println("Last Valid Value : " + lastValidValue);
		        if (ftf.isEditValid()) {
		          String latestValue = ftf.getText();
		          //System.out.println("Latest Value : " + latestValue);
		          if (!(latestValue.equals(answer)))
		            ftf.setBackground(Color.green.darker());
		        	  //JOptionPane.showMessageDialog(null, "correct");
		          else {
		            lastValidValue = ftf.getText();
		            ftf.setBackground(Color.WHITE);
		          }
		        } else {
		          //System.out.println("Invalid Edit Entered.");
		          JOptionPane.showMessageDialog(null, "Enter a number only.");
		        }
		    });
		    contentPane.add(numUno);
		    contentPane.add(numDos);
		    contentPane.add(ftf);
		    frame.setContentPane(contentPane);
		    frame.pack();
		    frame.setVisible(true);
		  }
		 
		 /*
	        JFrame frame = new JFrame("Frame");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        frame.addKeyListener(new SimpleKeyListener());

	        JLabel label = new JLabel("Hello Swing");
	        frame.getContentPane().add(label);
	        frame.pack();
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
	
	/*
	private static JTextField field = new JTextField(2);
	  private static JLabel errorMsg = new JLabel("Invalid input");
	  private static String pattern = "\\d+\\.\\d{0}";
	  //private static String pattern = "^\d*$";
	  private static JFrame frame = new JFrame();
	  private static JPanel panel = new JPanel();
	
	public static void main(String args[])
    {
		errorMsg.setForeground(Color.RED);
	    panel.setLayout(new GridBagLayout());
	    GridBagConstraints c = new GridBagConstraints();
	    c.insets = new Insets(5, 0, 0, 5);
	    c.gridx = 1;
	    c.gridy = 0;
	    c.anchor = GridBagConstraints.SOUTH;
	    panel.add(errorMsg, c);

	    c.gridx = 1;
	    c.gridy = 1;
	    c.anchor = GridBagConstraints.CENTER;
	    panel.add(field, c);

	    frame.getContentPane().add(panel);
	    field.getDocument().addDocumentListener(new DocumentListener()
	    {

		@Override
		public void changedUpdate(javax.swing.event.DocumentEvent e) {
			// notneeded
			
		}

		@Override
		public void insertUpdate(javax.swing.event.DocumentEvent e) {

			 validateInput();
		}

		@Override
		public void removeUpdate(javax.swing.event.DocumentEvent e) {
			 validateInput();
			
		}

		
	  });

	    frame.setSize(200, 200);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	  }

	  private static void validateInput()
	  {
	    String text = field.getText();
	    Pattern r = Pattern.compile(pattern);
	    Matcher m = r.matcher(text);
	    if (m.matches())
	    {
	      errorMsg.setForeground(frame.getBackground());
	    }
	    else
	    {
	      errorMsg.setForeground(Color.RED);
	    }
	  }
		/*
		Random rand = new Random();
		Stack<Integer> stack = new Stack<>();
		
		int push1 = (rand.nextInt(5));
    	System.out.println("Push: " + push1);
    	stack.push(push1);
    	
    	int push2 = (rand.nextInt(5));
    	System.out.println("Push: " + push2);
    	stack.push(push2);
    	
    	int push3 = (rand.nextInt(5));
    	System.out.println("Push: " + push3);
    	stack.push(push3);
		
    	System.out.println("Pop: " + push3);
    	int total = 0;
    	total = (stack.pop() + stack.pop() + stack.pop());
    	
    	System.out.println(total); //this works
    	// not helpful for undefined # inside stack tho
		
    	
    	
    	
    	
    	
    	//while (stack != Stack.isEmpty()) {
    		
    	
    	
    	/*
		//int sum = 0;
		//while (stack.size()>0) sum += stack.pop();
    	int total = 0;
    	while(stack.size() > 0){
    		  total += stack.pop();
    		}
    	System.out.println(total);
    	    }
    	    */
   
	

}
