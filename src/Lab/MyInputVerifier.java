package Lab;

import java.math.BigDecimal;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class MyInputVerifier extends InputVerifier{

	@Override
    public boolean verify(JComponent text) {
        String text1 = ((JTextField) text).getText();
        try {
            BigDecimal value = new BigDecimal(text1);
            return (value.scale() <= Math.abs(4)); 
        } catch (NumberFormatException e) {
            return false;
        }
    }
	
	public boolean verify2(JComponent text) {
	       String text0 = ((JTextField) text).getText();
	       try {
	          Integer.parseInt(text0);
	       } catch (NumberFormatException e) {
	    	   JOptionPane.showInputDialog("Please enter an integer."  );
	          return false;
	       }

	       return true;
	    }
	
	//how to implement
	//InputVerifier verifier = new MyInputVerifier();
	//textField1.setInputVerifier(verifier);
}
