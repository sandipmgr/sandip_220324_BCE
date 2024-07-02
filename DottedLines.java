import java.awt.Frame;
import java.awt.Graphics;

public class DottedLines extends Frame {
    DottedLines(){
        setSize(500,500);
        setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);
        g.drawLine(200,200,210,200);
        g.drawLine(220,200,230,200);
        g.drawLine(240,200,250,200);
        g.drawLine(200,210,210,210);
        g.drawLine(220,210,230,210);
        g.drawLine(240,210,250,210);
        g.drawLine(200,220,210,220);
        g.drawLine(220,220,230,220);
        g.drawLine(240,220,250,220);

    }

    public static void main(String[] args) {
        new DottedLines();
    }
}