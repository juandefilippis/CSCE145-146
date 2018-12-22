import java.applet.*;
import java.awt.*;
import java.util.*;

public class SHexaCarpetGon extends Applet {
    private Image display;// consider the window kind of
    private Graphics drawingArea;// drawing tools

    public void init()// called by applet
    {
        setSize(640,640);
        int height = getSize().height;
        int width = getSize().width;
        display = createImage(width, height);//creates the window
        drawingArea = display.getGraphics();
        drawGasket(0,0,width,drawingArea);
    }
    

    public void paint(Graphics g) {
        g.drawImage(display, 0, 0, null);

    }

    public static void drawGasket(int x, int y, int side, Graphics g) 
    {
        int sub = side/3;
        //TO DO DRAW HEXAGON
        drawHexagon(x,y,side,g);
        if(sub>=3)
        {
            drawGasket(x+sub, y,sub,g);//top middle
            drawGasket(x,y+sub ,sub,g);
            drawGasket(x+sub*2,y+sub,sub,g);
            drawGasket(x+sub,y+sub*2,sub,g);
            
        }
        
    }
    private static void drawHexagon(int x, int y, int side,Graphics g)
    {
        int[]xS= {x,
                   x+side/4,
                   x+side*3/4,
                   x+side,
                   x+side*3/4,
                   x+side/4,
                   x};
        int []yS={y+side/2,
                  y,
                  y,
                  y+side/2,
                  y+side,
                  y+side,
                  y+side/2};
    
    g.drawPolygon(xS,yS,xS.length);
    }
}


