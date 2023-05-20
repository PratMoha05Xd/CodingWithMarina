package UF5.TextField;

import javax.swing.*;
import java.awt.*;

public class Ventana5 extends JFrame {
    JPanel panel = new JPanel();
    public Ventana5() {
        this.setSize(500, 500); //Window dem
        setTitle("TextFieldExample"); //Window Title
        setLocationRelativeTo(null); //pone le ventana en el centro
        //khas funcion tkon f inicio
        ColocarJpanel();
        Textfield();
        setDefaultCloseOperation(EXIT_ON_CLOSE); //cuando haga click se cierre
    }

    private void ColocarJpanel() {
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    private void Textfield() {
        JTextField t1,t2;
        t1=new JTextField("Escribe tu E-Mail");
        t1.setForeground(Color.lightGray);
        t1.setBounds(50,100, 200,30);
        t2=new JTextField("First Name Please");
        t2.setForeground(Color.lightGray);
        t2.setBounds(50,150, 300,50);
        panel.add(t1);
        panel.add(t2);
        panel.setSize(400,400);
    }
}
