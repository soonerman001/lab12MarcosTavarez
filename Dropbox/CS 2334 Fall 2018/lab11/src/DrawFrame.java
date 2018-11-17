
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // TODO: draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(600,500), 400, Color.ORANGE, true);
        Circle circleOutLine = new Circle(new Point(750,650), 700, Color.WHITE, false);
        
        // Ears:
        RightTriangle ears1 = new RightTriangle(new Point(250,200), 50, -150, Color.BLACK, true);
        RightTriangle insideEars1 = new RightTriangle(new Point(260,195), 15, -100, Color.PINK, true);
        RightTriangle ears2 = new RightTriangle(new Point(550,200), -50, -150, Color.BLACK, true);
        RightTriangle insideEars2 = new RightTriangle(new Point(540,195), -15, -100, Color.PINK, true);
        
        
        
        // Eyes:
        Oval eyes1 = new Oval(new Point(350,250), 50, 100, Color.WHITE, true);
        Oval eyes2 = new Oval(new Point(500, 250), 50, 100, Color.WHITE, true);
        Oval eyesPupils = new Oval(new Point(350,250), 44, 85, Color.BLACK, true);
        Oval eyesPupils2 = new Oval(new Point(500,250), 44, 85, Color.BLACK, true);
        
        
        // Nose and Whiskers:
        Circle nose = new Circle(new Point(425,300), 50, Color.RED, true);
        PolyLine mouth = new PolyLine(new Point(500,330), new Point(400, 375), 50, Color.BLACK, true);
        PolyLine mouth1 = new PolyLine(new Point(320,330), new Point(400, 375), 50, Color.BLACK, true);
        Oval tounge = new Oval(new Point(480, 475), 50, 100, Color.RED, true);
        
        // Collar:
        Oval colar = new Oval(new Point(585,525), 375, 75, Color.BLACK, true);
        Circle tag = new Circle(new Point(425, 500), 50, Color.LIGHT_GRAY, true);
        Circle tagOutline = new Circle(new Point(420,495), 35, Color.BLACK, false);
        
        // Square around the dog:
        Square square = new Square(new Point(400,300), 500, Color.CYAN, false);
        
        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        
        drawPanel.addShape(base);
        drawPanel.addShape(circleOutLine);
        drawPanel.addShape(ears1);
        drawPanel.addShape(ears2);
        drawPanel.addShape(insideEars1);
        drawPanel.addShape(insideEars2);
        drawPanel.addShape(eyes1);
        drawPanel.addShape(eyes2);
        drawPanel.addShape(eyesPupils);
        drawPanel.addShape(eyesPupils2);
        drawPanel.addShape(nose);
        drawPanel.addShape(colar);
        drawPanel.addShape(tag);
        drawPanel.addShape(tagOutline);
        drawPanel.addShape(square);
        drawPanel.addShape(mouth);
        drawPanel.addShape(mouth1);
        drawPanel.addShape(tounge);
        // set background color
        drawPanel.setBackground(Color.LIGHT_GRAY);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
               
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
