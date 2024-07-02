import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Pacman extends Frame {
    Pacman() {
        setSize(500, 500);
        setVisible(true);
    }

    public  void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.YELLOW);
        g.fillArc(100,100,100,100,15,315);

        g.setColor(Color.BLACK);
        g.drawOval(170,145,15,15);
        g.drawOval(200,145,15,15);
        g.drawOval(230,145,15,15);
        g.drawOval(260,145,15,15);
        g.drawOval(290,145,15,15);
        g.drawOval(320,145,15,15);
        g.drawOval(350,145,15,15);

    }

    public static void main(String[] args) {
        new Pacman();
    }
}