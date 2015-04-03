import java.awt.*;

public class CantorFractal extends Fractal {

    /*variables*/
    private int screenWidth;
    private int screenHeight;
    private Graphics graphics;

    /*constructors*/
    public CantorFractal(int sw, int sh, Graphics g) {
        screenWidth = sw;
        screenHeight = sh;
        graphics = g;
    }

    /*accessors*/
    public int getScreenWidth() {return screenWidth;}
    public int getScreenHeight() {return screenHeight;}
    public Graphics getGraphics() {return graphics;}

    /*mutators*/
    public void setScreenWidth(int w) {screenWidth = w;}
    public void setScreenHeight(int h) {screenHeight = h;}
    public void setGraphics(Graphics g) {graphics = g;}

    /*abstract*/
    public void drawFractal() {
        //set the color the lines will be drawn with
        graphics.setColor(Color.WHITE);
        //draw the cantor set
        recursiveCantor(10, screenWidth-10, screenHeight/4, graphics);
    }

    public void recursiveCantor(int leftX, int rightX, int y, Graphics g) {
        //draw the line
        g.fillRect(leftX, y, rightX-leftX, 20);

        //if the length of the line is greater than a pixel
        if(rightX-leftX >= 1) {
            recursiveCantor(leftX, leftX+(rightX-leftX)/3, y+50, g);
            recursiveCantor(rightX-(rightX-leftX)/3, rightX, y+50, g);
        }
    }
}
