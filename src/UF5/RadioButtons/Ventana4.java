package UF5.RadioButtons;

import javax.swing.*;
import java.awt.*;

public class Ventana4 extends JFrame {
    //khaso ykon global
    JPanel panel = new JPanel();
    public Ventana4() {
        this.setSize(500, 500); //Window dem
        setTitle("Radio Buttons"); //Window Title
        setLocationRelativeTo(null); //pone le ventana en el centro
      //khas funcion tkon f inicio
        ColocarJpanel();
        ButtonRadio();
        setDefaultCloseOperation(EXIT_ON_CLOSE); //cuando haga click se cierre
    }

    private void ColocarJpanel() {
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void ButtonRadio() {
        //add a normal text
        JLabel l1;
        l1 = new JLabel("Lenguajes:");
        l1.setBounds(50,65, 100,30);
        panel.add(l1);


        //Primer Button
       JRadioButton radiobutton1 = new JRadioButton("Java", true);
       radiobutton1.setBounds(50,100,100,50);
       panel.add(radiobutton1);


       //segundo button
       JRadioButton radiobutton2 = new JRadioButton("PHP", false);
       radiobutton2.setBounds(50,150,100,50);
       panel.add(radiobutton2);

        //segundo button
        JRadioButton radiobutton3 = new JRadioButton("C++", false);
        radiobutton3.setBounds(50,200,100,50);
        panel.add(radiobutton3);

        ButtonGroup gruporadiobuttones = new ButtonGroup();
        gruporadiobuttones.add(radiobutton1);
        gruporadiobuttones.add(radiobutton2);
        gruporadiobuttones.add(radiobutton3);

        JButton b;


        b = new JButton("validar");
        b.setBounds(50,250,80,30);
        panel.add(b);
    }

}
