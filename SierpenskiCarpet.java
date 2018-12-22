import java.util.*;
import java.awt.*;
import java.applet.*;
public class SierpenskiCarpet extends Applet{
    private Image display;
    private Graphics drawingArea;
    public void init()
    {
        int height= getSize().height;
        int width =getSize().width;
        display=createImage(width,height);
        drawingArea=display.getGraphics();
        //draw gasket
        drawGasket(0,0,width,drawingArea);
    }
    public void paint(Graphics g)
    {
     g.drawImage(display,0,0,null);
    }
    public static final int STOP=4;
    public static void drawGasket(int x, int y, int side,Graphics g)
    {
        int sub =side/3;
        g.fillRect(x+sub, y+sub,sub,sub);
        if(sub>=STOP)
        {
            drawGasket(x,y,sub,g);//top left
            drawGasket(x+sub,y,sub,g);//middle
            drawGasket(x+sub*2,y,sub,g);//right
            drawGasket(x,y+sub,sub,g);
            drawGasket(x,sub+y*2,sub,g);
            drawGasket(x,y+sub*2,sub,g);
            drawGasket(x+sub,y+sub*2,sub,g);
            drawGasket(x+sub*2,y+sub*2,sub,g);
        }

    }
}
