
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class AnimationObjSOLN extends Canvas{
    // variables for the Canvas size
    static int w, h;

    // my object
    MyShape shape1 = new MyShape(100, 100, 10);

    // setup the frame
    public static void main(String[] args){
        // the Canvas size
        w = 800;
        h = 600;
        // standard setup stuff
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new AnimationObjSOLN(); // this must match the file/class name
        canvas.setSize(w,h);
        canvas.setBackground(new Color(255,255,255));
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // close main

    // this is where the action happens
    public void paint(Graphics g){
        // draw
        shape1.draw(g);

        // delay
        delay(5);
        
        // move
        shape1.move(w, h);

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

class MyShape{
    // these are the attributes of the object
    private int x, y, size, xV, yV;

    // this is the constructor
    // this gets called when we create an object from this class
    public MyShape(int xParam, int yParam, int sizeParam){
        this.x = xParam;
        this.y = yParam;
        this.size = sizeParam;
        this.xV = (int)(Math.random()*(9)) - 4;
        this.yV = (int)(Math.random()*(9)) - 4;
    }

    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.drawOval(this.x, this.y, this.size, this.size);
    }

    public void move(int w, int h){
        if (this.x<0 || this.x+this.size>w)
            this.xV *= -1;
        if (this.y<0 || this.y+this.size>h)
            this.yV *= -1;
        this.x += this.xV;
        this.y += this.yV;
    }

    // note: there are two other important methods that we should write
    // .toString() - gets called when we print this object
    // .equals() - how to tell of two objects are 'equal'


}
