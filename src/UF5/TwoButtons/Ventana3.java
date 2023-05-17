package UF5.TwoButtons;

import javax.swing.*;
import java.awt.*;

public class Ventana3 extends JFrame {
    JPanel panel1 = new JPanel();
    public Ventana3() {
        this.setSize(500, 500); //Window dem
        setTitle("Two Buttons"); //Window Title
        setLocationRelativeTo(null); //pone le ventana en el centro
        iniciarComponente();
        ButtonComponente();
        setDefaultCloseOperation(EXIT_ON_CLOSE); //cuando haga click se cierre
    }

     public void iniciarComponente() {
        panel1.setLayout(null);
        this.getContentPane().add(panel1);
     }

    private void ButtonComponente() {
        JButton boton1 = new JButton();
        boton1.setBounds(100,100,100,40);
        boton1.setForeground(Color.BLUE);
        boton1.setFont(new Font("cooper black",3,20));
        boton1.setText("Click");
        panel1.add(boton1);

        JButton boton2 = new JButton();
        boton2.setBounds(100,200,100,40);
        ImageIcon ClickAqui = new ImageIcon("src\\\\UF5\\\\TwoButtons\\\\botonClick.png");
        boton2.setIcon(new ImageIcon(ClickAqui.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
        panel1.add(boton2);
    }

}
