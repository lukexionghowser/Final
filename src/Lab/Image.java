package Lab;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Image extends JPanel{
	
	private BufferedImage image;
	
	public Image() {
		try {
			image = ImageIO.read(new File("images/circle.JPG"));
		} catch (IOException ex) {
			//handle exception..)
		}
	
	}

	/** Returns an ImageIcon, or null if the path was invalid. */
	public ImageIcon createImageIcon(String path,
	                                           String description) {
	    java.net.URL imgURL = getClass().getResource(path);
	    if (imgURL != null) {
	        return new ImageIcon(imgURL, description);
	    } else {
	        System.err.println("Couldn't find file: " + path);
	        return null;
	    }
	}
  
	/*//puts an image in one of 5 locations
	protected void paintComponent(Graphics gc) {
	    super.paintComponent(gc);

	    Dimension                           cs=getSize();                           // component size

	    gc=gc.create();
	    gc.clipRect(insets.left,insets.top,(cs.width-insets.left-insets.right),(cs.height-insets.top-insets.bottom));
	    if(mmImage!=null) { gc.drawImage(mmImage,(((cs.width-mmSize.width)/2)       +mmHrzShift),(((cs.height-mmSize.height)/2)        +mmVrtShift),null); }
	    if(tlImage!=null) { gc.drawImage(tlImage,(insets.left                       +tlHrzShift),(insets.top                           +tlVrtShift),null); }
	    if(trImage!=null) { gc.drawImage(trImage,(cs.width-insets.right-trSize.width+trHrzShift),(insets.top                           +trVrtShift),null); }
	    if(blImage!=null) { gc.drawImage(blImage,(insets.left                       +blHrzShift),(cs.height-insets.bottom-blSize.height+blVrtShift),null); }
	    if(brImage!=null) { gc.drawImage(brImage,(cs.width-insets.right-brSize.width+brHrzShift),(cs.height-insets.bottom-brSize.height+brVrtShift),null); }
	    }*/
	
@Override
protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.drawImage(image, 0, 0, this);
}
}
