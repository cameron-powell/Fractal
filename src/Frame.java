import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Frame extends JFrame {

    /*variables*/
    private Dimension screenSize;
    private int height;
    private int width;
    private Panel panel;

    /*constructors*/
    public Frame() {
        //determine the width and height based on screen size
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        height = (int)screenSize.getHeight();
        width = (int)screenSize.getWidth();
        setSize(width, height);
        //exit the app when the close button is pressed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //center the frame on the screen
        setLocationRelativeTo(null);
        //create a new panel
        panel = new Panel(width,height);
        //add the panel
        add(panel);
        //allow the frame to be viewed
        setVisible(true);
    }

    /*accessors*/
    public Dimension getDimension() {return screenSize;}
    public int getHeight() {return height;}
    public int getWidth() {return width;}

    /*mutators*/
    public void setScreenSize(Dimension d) {screenSize = d;}
    public void setHeight(int h) {height = h;}
    public void setWidth(int w) {width = w;}
}
