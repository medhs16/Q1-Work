import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MethodPractice extends JPanel{
	
	// Practice calling methods with parameters
	// by drawing the required shapes/patterns from the document
	public void paint(Graphics g) {
		
		//colors
		//change color tool
		g.setColor(new Color(117,13,55));
		
		g.fillOval(0, 0, 50, 50);
		//parameters 1 and 2 is the x and y coordinates 
		//for the upper left 
		//paremeters 3 and 4 are the width and height 
		
		
		g.setColor(new Color(157, 205, 192));
		g.fillRect(0, 0, 10, 10);
		//parameters 1 and 2 is the x and y coordinates
		//for the upper left 
		//paremeters 3 and 4 are the width and height
		
		//emoji creation
		//set color and draw face
		g.setColor(new Color(255,222,52));
		g.fillOval(150, 150, 350, 350);
		//set and draw eyes
		g.setColor(new Color(150, 79, 32));
		g.fillOval(215,215,57,67);
		g.fillOval(385,215,57,67);
		//set and draw mouth
		g.setColor(new Color(0, 0, 0));
		g.fillRect(215,365,215,7);
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		MethodPractice m = new MethodPractice();
	}
	
	public MethodPractice() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
