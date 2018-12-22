import java.applet.*;
import java.awt.*;
import java.util.*;

public class  SCarpet extends Applet
{
    private Image display;// consider the window kind of
    private Graphics drawingArea;// drawing tools


    public void init ()// called by applet
    {
        int height=getSize().height;
        int width=getSize().width;
        display= createImage(width,height);//creates the window
        drawingArea=display.getGraphics();
        
        //TO DO CALL THE RECURSIVE METHOD
       drawGasket(0,0,width,drawingArea);
    }
    public void paint(Graphics g)
    {
        g.drawImage(display,0,0,null);
    }
    public static void drawGasket(int x, int y, int side, Graphics g)
    {
        int sub = side/3;
        g.fillRect(x+sub, y+sub, sub, sub);
        if(sub >= 3)
        {
            //top 3 squares
            drawGasket(x,y,sub,g);//top left
            drawGasket(x+sub, y,sub,g);//top middle
            drawGasket(x+sub*2,y ,sub,g);
            //middle 2 squares
            drawGasket(x,y+sub,sub,g);//middle left
            drawGasket(x+sub*2,y+sub,sub,g);//middle right
            //bottom 3 squares
            drawGasket(x,y+sub*2,sub,g);
            drawGasket(x+sub,y+sub*2,sub,g);
            drawGasket(x+sub*2,y+sub*2,sub,g);
        }
    }





}
