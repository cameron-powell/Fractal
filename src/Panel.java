import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel {

    /*variables*/
    private int width;
    private int height;
    private Color backgroundColor;

    /*constructors*/
    public Panel() {
        //set the width and height
        width = 0;
        height = 0;
        //set the background color
        backgroundColor = Color.BLACK;
        setBackground(backgroundColor);
    }

    public Panel(int w, int h) {
        //set the width and height
        width = w;
        height = h;
        //set the background color
        backgroundColor = Color.BLACK;
        setBackground(backgroundColor);
    }

    /*accessors*/
    public int getWidth() {return width;}
    public int getHeight() {return height;}
    public Color getBackgroundColor() {return backgroundColor;}

    /*mutators*/
    public void setWidth(int w) {width = w;}
    public void setHeight(int h) {height = h;}
    public void setBackgroundColor(Color c) {backgroundColor = c;}

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        circleFractal(width / 2, height / 2 - 16, 256, g);
    }

    private void circleFractal(int xLoc, int yLoc, int radius, Graphics g) {
        g.drawOval(xLoc-radius/2,yLoc-radius/2,radius,radius);

        if(radius > 8) {
            circleFractal(xLoc+radius/2,yLoc,radius/2,g);
            circleFractal(xLoc-radius/2,yLoc,radius/2,g);
            circleFractal(xLoc,yLoc+radius/2,radius/2,g);
            circleFractal(xLoc,yLoc-radius/2,radius/2,g);
        }
    }

}
