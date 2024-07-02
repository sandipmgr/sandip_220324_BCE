
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI1 {
    public int a=0;
    GUI1(){
        
        Frame frame = new Frame();
        Panel panel= new Panel();
        Button btn = new Button("Increase");
        panel.add(btn);
        panel.setLayout(new FlowLayout());
        frame.add(panel,BorderLayout.WEST);

        Panel panel1 = new Panel();
        Label lbl = new Label("The number is:");
        panel1.add(lbl);
        Label result = new Label("0");
        panel1.add(result);
        panel1.setLayout(new FlowLayout());
        frame.add(panel1,BorderLayout.EAST);
        
        
        




        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                a=a+1;
                result.setText(String.valueOf(a));
                System.out.println(a);
            }
            
               });
    }

    public static void main(String[] args) {
        
        new GUI1();
        
    }
    
}