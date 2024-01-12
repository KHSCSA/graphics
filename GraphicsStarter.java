
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class CSAGraphicsStarter extends Canvas{
    // variables for the Canvas size
    static int w, h;

    // setup the frame
    public static void main(String[] args){
        // the Canvas size
        w = 800;
        h = 600;
        // standard setup stuff
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new CSAGraphicsStarter(); // this must match the file/class name
        canvas.setSize(w,h);
        canvas.setBackground(new Color(255,255,255));
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // close main

    // this is where the action happens
    public void paint(Graphics g){
        // g.drawLine params are x1, y1, x2, y2
        // g.drawRect params are top left x, y, width, height
        // g.drawOval params are x, y, horiz_size, vert_size
        //g.setColor(new Color(255,0,0));
        //g.setColor(Color.BLACK);

        
    } // close paint
  
    
} // close class
CSAGraphicsStarter.java
Displaying CSAGraphicsStarter.java.
