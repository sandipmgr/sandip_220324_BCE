
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestGUI {
    TestGUI(){
        Frame frame = new Frame();

        Button lbl = new Button("North");
        frame.add(lbl,BorderLayout.NORTH);

        Button lbl1 = new Button("West");
        frame.add(lbl1, BorderLayout.WEST);

        Button lbl2 = new Button("East");
        frame.add(lbl2, BorderLayout.EAST);

        Button lbl3 = new Button("Center");
        frame.add(lbl3, BorderLayout.CENTER);

        Button lbl4 = new Button("South");
        frame.add(lbl4, BorderLayout.SOUTH);
        
        frame.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'windowOpened'");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
              frame.dispose();
            }

            @Override
            public void windowClosed(WindowEvent e) {
                // TODO Auto-generated method stub
                System.exit(0);
                
            }

            @Override
            public void windowIconified(WindowEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'windowIconified'");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'windowDeiconified'");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'windowActivated'");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'windowDeactivated'");
            }
        });


        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());}

        public static void main(String[] args) {
            new TestGUI();
        }  
    
    
}