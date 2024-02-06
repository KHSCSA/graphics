import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
import javax.swing.JFrame;

public class SierpinskiSTARTER extends Canvas{

    static int w, h; // the canvas size
    static int x, y; // the current point
    static int x1, y1, x2, y2, x3, y3; // the 3 vertices
    static int xR, yR; // the randomly chosen vertex

    // setup the frame
    public static void main(String[] args){
        // the Canvas size
        w = 400;
        h = 400;

        // the first point
        x = w/2;
        y = h/2;

        // the original triangle
        x1 = 200;
        y1 = 10;
        x2 = 390;
        y2 = 390;
        x3 = 10;
        y3 = 390;

        // the random vertex
        xR = 0;
        yR = 0;

        // standard setup stuff
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new SierpinskiSTARTER(); // this must match the file/class name
        canvas.setSize(w,h);
        canvas.setBackground(new Color(255,255,255));
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // close main

    // this is where the action happens
    public void paint(Graphics g){   

        // draw the original triangle
        drawOrigTriangle(g);

        // in a loop
        // choose a random vertex
        // draw the point


    } // close paint

    // draw the original triangle
    public static void drawOrigTriangle(Graphics g){

    }

    // pick a random vertex
    // set xR, yR to that coordinate
    public static void pickRandVertex(){

    }

    // set x, y = to the midpoint between x, y and xR,yR
    // fill a circle there
    public static void drawPoint(Graphics g){

    }

    // a helper method
    public static void delay(int n){
        try{
            Thread.sleep(n);
        }
        catch (InterruptedException e){}
    } // close delay

} // close Main class
