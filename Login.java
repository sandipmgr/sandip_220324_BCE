

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    int a,b;
    String s;
    Login(){
        Frame frame = new Frame("Login Form");

        frame.setSize(400,500);
        frame.setVisible(true);
        frame.setLayout(null);

        Label lbl1 = new Label("Welcome Back! You have been missed");
        lbl1.setBounds(10,15,300,100);
        lbl1.setBackground(Color.CYAN);
        frame.add(lbl1);


        Label lbl = new Label("First Number: ");
        lbl.setBounds(10, 115, 100,100);
        frame.add(lbl);
        TextField txt = new TextField();
        txt.setBounds(115, 150,350,30);
        frame.add(txt);
        Label lbl2 = new Label("Second Number: ");
        lbl2.setBounds(10, 205, 100,100);
        frame.add(lbl2);

        TextField txt1 = new TextField();
        txt1.setBounds(115, 240,350,30);
        frame.add(txt1);

        Button btn = new Button("Reset");
        btn.setBounds(70,320,100,40);
        frame.add(btn);

        Button btn1 = new Button("Calculate");
        btn1.setBounds(200,320,100,40);
        frame.add(btn1);

        Label lbl3 = new Label("The sum is");
        lbl3.setBounds(20, 260, 100, 100);
        frame.add(lbl3);

        Label result = new Label("0");
        result.setBounds(125, 260, 100, 100);
        frame.add(result);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                txt.setText(null);
                txt1.setText(null);
            }
        });
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent x){

                String num1 = txt.getText();
                String num2 = txt1.getText();
                 a = Integer.parseInt(num1);
                 b = Integer.parseInt(num2);
                int sum= a+b;
                 s= String.valueOf(sum);
                 result.setText(s);


            }
        });


    }
  public static void main(String[] args) {
      new Login();
  }  
}