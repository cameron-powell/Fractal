import java.awt.*;
import javax.swing.JPanel;

public class Panel extends JPanel {

    /*variables*/
    private int width;
    private int height;

    /*constructors*/
    public Panel() {
        //set the width and height
        width = 0;
        height = 0;
        //set the background color
        setBackground(Color.BLACK);
    }

    public Panel(int w, int h) {
        //set the width and height
        width = w;
        height = h;
        //set the background color
        setBackground(Color.BLACK);
    }

    /*accessors*/
    public int getWidth() {return width;}
    public int getHeight() {return height;}

    /*mutators*/
    public void setWidth(int w) {width = w;}
    public void setHeight(int h) {height = h;}

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.drawOval(width/2 - 200/2,height/2-200/2,200,200);
    }

}
