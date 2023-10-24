import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.color.*;
public class ForLoops2 extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		 
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		g.drawRect(10, 10, 760, 540);

		//Oval mania
		//outermost drawing
		g.setColor(new Color(7, 0, 77));//dark blue
		for (int i = 0; i < 43; i++) {//amount of lines
			int x = i*13; //y increment
			int y = i *17; //x increment
			g.drawLine(770, 570-x, 770-y, 10);//upper left
			g.drawLine(10 ,570-x, 10+y, 10);//upper right
			g.drawLine(770 ,x, 770-y, 550);//lower left
			g.drawLine(10 ,x, 10+y, 550);//lower right 
		}
		//second level drawing
		g.setColor(new Color(45, 130, 183));//blue
		for (int i = 0; i < 20; i++) {//amount of lines
			int x = i*13; //y increment
			int y = i *17; //x increment
			g.drawLine(600, 410-x, 600-y, 165);//upper left
			g.drawLine(175 ,410-x, 175+y, 165);//upper right
			g.drawLine(600 ,x+150, 600-y, 400); //lower left
			g.drawLine(175 ,x+150, 175+y, 400);//lower right 
		}
		//third level drawing
		g.setColor(new Color(66, 226, 184));//sea green
		for (int i = 0; i < 13; i++) {//amount of lines
			int x = i*13; //y increment
			int y = i *17; //x increment
			g.drawLine(500, 370-x, 500-y, 215);//upper left
			g.drawLine(290 ,370-x, 290+y, 215);//upper right
			g.drawLine(500 ,x+205, 500-y, 360);//lower left 
			g.drawLine(290 ,x+205, 290+y,360);//lower right 
		}
		//innermost drawing
		g.setColor(new Color(204, 201, 220));//lavender
		for (int i = 0; i < 7; i++) {//amount of lines
			int x = i*13; //y increment
			int y = i *17; //x increment
			g.drawLine(440, 325-x, 440-y, 245);//upper left
			g.drawLine(350 ,325-x, 350+y, 245);//upper right
			g.drawLine(440 ,x+250, 440-y, 330); //lower left
			g.drawLine(350 ,x+250, 350+y, 330);//lower right 
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		ForLoops2 m = new ForLoops2();
	}
	
	public ForLoops2() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);

		
	}
}
