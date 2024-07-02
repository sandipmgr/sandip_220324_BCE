import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class TrafficLight extends Frame {
    TrafficLight(){
        setSize(500,500);
        setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawRect(100,50,100,250);
        g.setColor(Color.red);
        g.fillOval(125,75,50,50);
        g.setColor(Color.orange);
        g.fillOval(125,150,50,50);
        g.setColor(Color.green);
        g.fillOval(125,225,50,50);
        g.setColor(Color.black);

        g.drawLine(140,300,140,350);
        g.drawLine(160,300,160,350);
        g.drawLine(160,350,140,350);
    }

    public static void main(String[] args) {
        new TrafficLight();
    }

}