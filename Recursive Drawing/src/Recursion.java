import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Recursion extends JPanel implements ActionListener{
	
	/* this method should recursive draw concentric rings */
	public void concentricCircles(Graphics g, int width, int x, int y) {
		//set color to a lighter color to contrast against black background
		g.setColor(Color.yellow);
		g.drawOval(x, y, width, width);
		
		//base case - when does it stop calling itself
		if(width <= 0) {
			return; //done with recursion
		} else {
			//call the method to draw the next part of the pattern
			concentricCircles(g, width-10, x+5, y+5);
		}
		
		
	}	
	
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 2000, 2000);
		concentricCircles(g, 100, 0, 0);
		squares(g, 100, 200, 200);
		clover(g, 100, 400, 100);
		roundy(g, 1400, 200, -100);
	} //my code should go above this bracket unless I know about classes
	
	public void squares(Graphics g, int width, int x, int y) {
		//add the additional parameters (arguments) so that you can call
		//on the method recursively
		int red = (int)(Math.random()*(255-0+1));
		int green = (int)(Math.random()*(255-0+1));
		int blue = (int)(Math.random()*(255-0+1));
		Color newColor = new Color(red, green, blue);
		
		g.setColor(newColor);
		
		//each method draws a square
		g.fillRect(x, y, width, width);
		
		//when do you end the recursion?
		if(width <= 0) {
			return; //done with recursion
		} else {
			//call squares 8 times
			//vary how you're updating the variables
			squares(g, width/3, x+width/3, y-2*width/3); //top
			squares(g, width/3, x+width/3, y+4*width/3); //bottom
			squares(g, width/3, x-2*width/3, y+4*width/3); //bottom left
			squares(g, width/3, x+4*width/3, y+4*width/3); //bottom right
			squares(g, width/3, x-2*width/3, y-2*width/3); //top left
			squares(g, width/3, x+4*width/3, y-2*width/3); //top right
			squares(g, width/3, x-2*width/3, y+width/3); //middle left
			squares(g, width/3, x+4*width/3, y+width/3); //middle right
		}
		 
	}
	
	public void roundy(Graphics g, int width, int x, int y) {
		//set color to a lighter color to contrast against black background
		int red = (int)(Math.random()*(255-0+1));
		int green = (int)(Math.random()*(255-0+1));
		int blue = (int)(Math.random()*(255-0+1));
		Color newColor = new Color(red, green, blue);
		
		g.setColor(newColor);		
		g.drawOval(x, y, width, width);
		
		//base case - when does it stop calling itself
		if(width <= 0) {
			return; //done with recursion
		} else {
			//call the method to draw the next part of the pattern
			roundy(g, width-3, x+2, y+1);
		}
		
		
	}	
	
	public void snowflake(Graphics g, int width, int x, int y) {
		
	}
	
	public void clover(Graphics g, int width, int x, int y) { //What additional variables will you need to draw the shape?
		//set color to a lighter color to contrast against black background
		g.setColor(Color.white);
		g.drawOval(x, y, width, width); //top left
		g.drawOval(x+width, y, width, width); //top right
		g.drawOval(x, y+width, width, width); //bottom left
		g.drawOval(x+width, y+width, width, width); //bottom right
		//g.drawOval(x+100, y+100, width, width);
		
		//base case - when does it stop calling itself
		if(width <= 0) {
			return; //done with recursion
		} else {
			//call the method to draw the next part of the pattern
			clover(g, width-10, x+10, y+10);
		}
	}
	

	
	public static void main(String[] arg) {
		
		// line of code to create a MethodPractice object
		Recursion m = new Recursion();
	
	}// end of main method body 
	
	
	//constructor for the class
	//kind of looks like a method but no return type!!!
	public Recursion() {
		JFrame f = new JFrame("Recursive Methods");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		f.setSize(800,600);
		f.add(this);
		t.start();
		f.setVisible(true);
		
	}
	Timer t = new Timer(1000, this);
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

}//last curly - do not delete