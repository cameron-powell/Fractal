import java.awt.*;

public class CircleFractal extends Fractal {

    /*variables*/
    private int screenWidth;
    private int screenHeight;
    private int radius;
    private Graphics graphics;

    /*constructors*/
    public CircleFractal(int sw, int sh, Graphics g) {
        screenWidth = sw;
        screenHeight = sh;
        radius = 256;
        graphics = g;
    }

    /*accessors*/
    public int getScreenWidth() {return screenWidth;}
    public int getScreenHeight() {return screenHeight;}

    /*mutators*/
    public void setScreenWidth(int w) {screenWidth = w;}
    public void setScreenHeight(int h) {screenHeight = h;}

    /*abstract*/
    public void drawFractal() {
        //set the color the lines will be drawn with
        graphics.setColor(Color.WHITE);
        //draw the recursive circles
        recursiveCircles(screenWidth/2, screenHeight/2-16, radius, graphics);
    }

    public void recursiveCircles(int xLoc, int yLoc, int radius, Graphics g) {
        g.drawOval(xLoc-radius/2,yLoc-radius/2,radius,radius);

        if(radius > 8) {
            recursiveCircles(xLoc + radius / 2, yLoc, radius / 2, g);
            recursiveCircles(xLoc - radius / 2, yLoc, radius / 2, g);
            recursiveCircles(xLoc, yLoc + radius / 2, radius / 2, g);
            recursiveCircles(xLoc, yLoc - radius / 2, radius / 2, g);
        }
    }


}
