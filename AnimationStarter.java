import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class AnimationStarter extends Canvas{
    // variables for the Canvas size
    static int w, h;

    // initalize variables

    // setup the frame
    public static void main(String[] args){
        // the Canvas size
        w = 600;
        h = 600;
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new AnimationStarter(); // this must match the file/class name
        canvas.setSize(w,h);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // close main

    // 
    public void paint(Graphics g){
        // draw

        // delay
        delay(10);
        
        // move

        // repeat
        repaint();
    } // close paint

    /*
    // using this function will not 'erase' the screen 
    public void update(Graphics g){
        paint(g);
    }
    */

    // a helper method
    public static void delay(int n){
        try{
            Thread.sleep(n);
        }
        catch (InterruptedException e){}
    } // close delay

} // close class