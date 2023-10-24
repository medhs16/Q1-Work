import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class WhileLoops extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		 
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		g.drawRect(10, 10, 760, 540);
		
		
		//2) Draw a horizontal line to bisect the Rectangle
		g.drawLine(10, 280,770, 280);
		
		
		//3) Draw a vertical line to bisect the shape again
		g.drawLine(390, 10, 390, 550);
		g.drawLine(200,10, 200, 280);
		
		//
		int x1 = 20;
		int x2 = 190;
		int y1 = 20;
		int y2 = 20;
		int counter1 = 0;
		int counter2 = 0;
		while (counter1 < 10) {
			System.out.println("Hello World");
			counter1++;
		}
		//lines
		while (counter2 < 10) {
			g.drawLine(x1, y1, x2, y2);
			y2 = y2+15;
			counter2++;
		}
		//horizontal lines
		int var = 0;
		int xx = 20;
		int yy = 170;
		while (var <10) {
			g.drawLine(xx, yy, xx+170, yy);
			yy += 10;
			var++;
		}
		//concentric circles
		int count = 0;
		int size = 15;
		int x = 270;
		int y = 70;
		while (count <6) {
			g.drawOval(x, y, size, size);
			size +=20;
			x -=10;
			y-=10;
			count++;
		}
		//squares
		int i = 0;
		int side = 20;
		int xxx = 210;
		int yyy = 130;
		while (i < 7) {
			g.drawRect(xxx, yyy, side, side);
			side +=10;
			xxx +=10;
			yyy+=10;
			i++;
		}
		//math equations
		int i2 = 2;
		int sum = 0;
		String declare = "2";
		while (i2 <= 31) {
			sum =i2 + sum;
			i2++;
			if (i2 != 32) {
				declare += " + " + i2;
			}
		}
		System.out.println(declare);
		System.out.println(sum);
		g.drawString(declare.substring(0,65), 400 , 50);
		g.drawString(declare.substring(66,declare.length()-5), 400, 75);
		g.drawString(declare.substring(declare.length()-5,declare.length())+ " = " +sum, 400, 95);
		
		 //factorials
		int n = (int) ((Math.random()*6) +5);
		int i3 = 1;
		int product = 1;
		String answer = "1";
		while (i3 < n) {
			i3++;
			product = product * i3;
			answer += " * " + i3;
		}
		g.drawString(answer + " = " + product, 40 , 320);
		
		//circle mania
		for (int i4 = 0; i4 < 71; i4++) {
			int sized = (int)((Math.random()*80)+28);
			g.drawOval((int)((Math.random()*276)+390),(int)((Math.random()*161)+280),sized, sized); 
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		WhileLoops m = new WhileLoops();
	}
	
	public WhileLoops() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);

		
	}
}
