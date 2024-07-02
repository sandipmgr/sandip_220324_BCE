
    
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class TwoSection {
    public int a=0;
    TwoSection(){
        
        Frame frame = new Frame();
        Panel panel= new Panel();



        Button btn = new Button("Left");
        panel.add(btn);
        panel.setBackground(Color.DARK_GRAY);
        panel.setPreferredSize(new Dimension(250,500));
        panel.setLayout(new FlowLayout());
        frame.add(panel,BorderLayout.WEST);

        Panel panel1 = new Panel();
        
        Label result = new Label("Hello World");
        Font myFont = new Font("Serif", Font.BOLD, 30);
        result.setFont(myFont);
        result.setAlignment(1);
        
        panel1.add(result);
        panel1.setBackground(Color.BLUE);
        
        panel1.setLayout(new FlowLayout());
        frame.add(panel1,BorderLayout.EAST);
        panel1.setPreferredSize(new Dimension(250,500));
        
        MenuBar menu = new MenuBar();
        frame.setMenuBar(menu);
        Menu fileMenu = new Menu("File");
        Menu subMenu = new Menu("More");
        Menu editMenu = new Menu("Edit");
        Menu search = new Menu("Search");
        Menu ref = new Menu("References");
        MenuItem item1 = new MenuItem("New");
        MenuItem item2 = new MenuItem("Open");
        MenuItem item3 = new MenuItem("Save");
        MenuItem item4 = new MenuItem("Save as");
        MenuItem item5 = new MenuItem("Clear Cache");
        MenuItem item6 = new MenuItem("Restore Defaults");
        MenuItem item7 = new MenuItem("Undo");
        MenuItem item8 = new MenuItem("Redo Typing");
        MenuItem item9 = new MenuItem("Text");
        MenuItem item10 = new MenuItem("Reference 2");
        MenuItem item11= new MenuItem("Reference 1");
        MenuItem item12= new MenuItem("Exit");
        MenuItem item13= new MenuItem("Java");




        fileMenu.add(item1);
        fileMenu.add(item2);
        fileMenu.addSeparator();
        fileMenu.add(item3);
        fileMenu.add(item4);
        fileMenu.addSeparator();
        fileMenu.add(subMenu);
        subMenu.add(item5);
        subMenu.add(item6);
        fileMenu.addSeparator();
        fileMenu.add(item12);


        editMenu.add(item7);
        editMenu.add(item8);

        search.add(ref);
        ref.add(item10);
        ref.add(item11);
        search.addSeparator();
        search.add(item9);
        search.addSeparator(); 
        search.add(item13); 
        
        
        menu.add(fileMenu);
        menu.add(editMenu);
        menu.add(search);

        



        




        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                panel1.setBackground(Color.CYAN);
                result.setBackground(Color.CYAN);
                result.setText("Hello");
            }
            
               });

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
                throw new UnsupportedOperationException("Unimplemented method 'windowClosed'");
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

        item12.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                frame.dispose();
            }
            
        });
    }

    public static void main(String[] args) {
        
        new TwoSection();
        
    }
    
}

    
