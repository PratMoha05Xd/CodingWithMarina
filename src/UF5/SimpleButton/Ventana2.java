package UF5.SimpleButton;

import javax.swing.*;
import java.awt.*;

public class Ventana2 extends JFrame {
    public Ventana2() {
        this.setSize(500, 500);
        setTitle("Simple Button");

        setLocationRelativeTo(null);

        setMaximumSize(new Dimension(200, 200));

        iniciarComponente();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponente() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);


        JButton etiquita = new JButton("Click Here");
        etiquita.setBounds(200, 130, 95, 35);
        etiquita.setHorizontalAlignment(SwingConstants.CENTER);
        etiquita.setForeground(Color.black);
        etiquita.setOpaque(true);
        etiquita.setFont(new Font("arial", 3, 10));
        panel.add(etiquita);
    }
}