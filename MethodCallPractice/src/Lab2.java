// The AWT Graphics Program
// This is the student starting version of Graphics Lab 01.
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Lab2 extends JPanel
{

	public void paint(Graphics g)
	{
    	// DRAW CUBE
   	 g.drawRect(175, 175, 175, 175);
   	 g.drawRect(90, 90, 175,175);
   	 g.drawLine(175,175,90,90);
   	 g.drawLine(175,350,90,265);
   	 g.drawLine(350,175,265,90);
   	 g.drawLine(350,350,265,265);



    	// DRAW SPHERE
   	 int widthConstant = 50;
   	 int hC = 550;
   	 for (int i=0; i < 4; i++) {
   		 g.drawOval(hC,90,widthConstant,200);
   		 widthConstant = widthConstant + 50;
   		 hC = hC - 25;
   	 }
   	 
   	widthConstant = 200;
  	hC = 90;
   	for (int i=0; i < 4; i++) {
  		 g.drawOval(475,hC,200,widthConstant);
  		 widthConstant = widthConstant - 50;
  		 hC = hC + 25;
  	 }



    	// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
   	g.drawOval(575,355,200,200);
   	g.drawLine(675,555,760,405);
   	g.drawLine(760,405,575,455);
   	g.drawLine(675,555,575,455);
   	g.drawOval(617,431,94,94);



    	// DRAW APCS
   	//DRAW A
   	g.fillRect(35,435,15,100);
   	g.fillRect(35,435,55,15);
   	g.fillRect(75,435,15,100);
   	g.fillRect(35,480,55,15);
   	//DRAW P
   	g.fillRect(100,435,15,100);
   	g.fillRect(100,435,55,15);
   	g.fillRect(140,435,15,50);
   	g.fillRect(100,480,55,15);
   	//DRAW C
   	g.fillRect(165,435,15,100);
   	g.fillRect(165,435,55,15);
   	g.fillRect(165,520,55,15);
   	//DRAW S
   	g.fillRect(230,435,15,55);
   	g.fillRect(230,435,55,15);
   	g.fillRect(230,475,55,15);
   	g.fillRect(270,475,15,50);
   	g.fillRect(230,520,55,15);
   	
   	




    	// DRAW PACMEN FLOWER
   	g.fillArc(445,400,60,60,45,275);
   	g.fillArc(405,360,60,60,45,-275);
   	g.fillArc(365,400,60,60,135,-275);
   	g.fillArc(405,440,60,60,225,-275);
   	


	}

	public static void main(String[] arg) {
   	 Lab2 l = new Lab2();
	}
    
	public Lab2() {
   	 JFrame j = new JFrame("Method Calls");
   	 j.setSize(new Dimension(800,600));
   	 j.add(this);
   	 j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     	 j.setVisible(true);
 	}
}
