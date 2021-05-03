package Lab;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.NumberFormat;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;



public class FormattedTextFieldGame extends JPanel 
implements PropertyChangeListener{

	 //Values for the fields
    private double amount = 10;
    private double rate = 7.5;  //7.5%
    private int numPeriods = 30;
 
    //Labels to identify the fields
    private JLabel amountLabel;
    private JLabel rateLabel;
    private JLabel numPeriodsLabel;
    private JLabel paymentLabel;
 
    //Strings for the labels
    private static String amountString = "Loan Amount: ";
    private static String rateString = "APR (%): ";
    private static String numPeriodsString = "Years: ";
    private static String paymentString = "Monthly Payment: ";
 
    //Fields for data entry
    /*
    private JFormattedTextField amountField;
    private JFormattedTextField rateField;
    private JFormattedTextField numPeriodsField;
    private JFormattedTextField paymentField;
    */
    JTextField text = new JTextField("", 2);
 
    //Formats to format and parse numbers
    private NumberFormat amountFormat;
 
    public FormattedTextFieldGame() {
    	
        super(new BorderLayout());
        setUpFormats();
 
        Random rand = new Random(); 
    	
        //Create the labels.
        /*
        JLabel amountLabel = new JLabel(amountString);
        rateLabel = new JLabel(rateString);
        numPeriodsLabel = new JLabel(numPeriodsString);
        paymentLabel = new JLabel(paymentString);
        */
        int no1 = rand.nextInt(10);
    	int no2 = rand.nextInt(10);
    	String no11 = Integer.toString(no1);
    	String no22 = Integer.toString(no2);
    	JLabel equation = new JLabel(no1 + " + " + no2 + " = ");
    	JLabel label21 = new JLabel("");
    	JLabel label22 = new JLabel("");
    	JButton submit = new JButton("Submit");
    	
    	String eq = queue.equation();
 
        //Create the text fields and set them up.
    	/*
        amountField = new JFormattedTextField(amountFormat);
        amountField.setValue(new Double(amount));
        amountField.setColumns(10);
        amountField.addPropertyChangeListener("value", this);
 	*/
    	text = new JFormattedTextField(amountFormat);
        //text.setValue(new Integer(amount));
        text.setColumns(10);
        text.addPropertyChangeListener("value", this);
        /*
        rateField = new JFormattedTextField(percentFormat);
        rateField.setValue(new Double(rate));
        rateField.setColumns(10);
        rateField.addPropertyChangeListener("value", this);
 
        numPeriodsField = new JFormattedTextField();
        numPeriodsField.setValue(new Integer(numPeriods));
        numPeriodsField.setColumns(10);
        numPeriodsField.addPropertyChangeListener("value", this);
 
        paymentField = new JFormattedTextField(paymentFormat);
        paymentField.setValue(new Double(payment));
        paymentField.setColumns(10);
        paymentField.setEditable(false);
        paymentField.setForeground(Color.red);
        */
 
        
        //Tell accessibility tools about label/textfield pairs.
        /*
        amountLabel.setLabelFor(amountField);
        rateLabel.setLabelFor(rateField);
        numPeriodsLabel.setLabelFor(numPeriodsField);
        paymentLabel.setLabelFor(paymentField);
        */
        
        JPanel card2 = new JPanel();

		//submit.addActionListener(new Button4Handler());

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
		//card2.setBackground(Color.ORANGE);
 
    }
        /*
        //Lay out the labels in a panel.
        JPanel labelPane = new JPanel(new GridLayout(0,1));
        labelPane.add(amountLabel);
        labelPane.add(rateLabel);
        labelPane.add(numPeriodsLabel);
        labelPane.add(paymentLabel);
 

    }
 

 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("FormattedTextFieldDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add contents to the window.
        frame.add(new FormattedTextFieldGame());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
            UIManager.put("swing.boldMetal", Boolean.FALSE);
                createAndShowGUI();
            }
        });
    }
 

 
    //Create and set up number formats. These objects also
    //parse numbers input by user.
    private void setUpFormats() {
        amountFormat = NumberFormat.getNumberInstance();
 
        //percentFormat = NumberFormat.getNumberInstance();
       // percentFormat.setMinimumFractionDigits(3);
 
       // paymentFormat = NumberFormat.getCurrencyInstance();
    }

	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
	/*
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}
	*/


