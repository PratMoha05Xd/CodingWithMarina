package UF5;

import javax.swing.*;
import java.awt.*;

public class ventana extends JFrame {
    public ventana() {
        this.setSize(500, 500);
        setTitle("El Mejor Equipazo");

        setLocationRelativeTo(null);

        setMaximumSize(new Dimension(200, 200));

        iniciarComponente();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponente() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);

        JLabel etiquita = new JLabel();
        etiquita.setText("Wydad Athelitic Club");
        etiquita.setBounds(75, 10, 300, 100);
        etiquita.setHorizontalAlignment(SwingConstants.CENTER);
        etiquita.setForeground(Color.black);
        etiquita.setOpaque(true);
        etiquita.setFont(new Font("arial", 3, 25));
        panel.add(etiquita);

        ImageIcon imageIcon = new ImageIcon("src\\\\UF5\\\\wac.png");
        if (imageIcon.getImageLoadStatus() == MediaTracker.ERRORED) {
            JOptionPane.showMessageDialog(this, "Failed to load image: wac.jpg");
        } else {
            JLabel etiquita2 = new JLabel(imageIcon);
            etiquita2.setBounds(60, 85, 350, 300);
            panel.add(etiquita2);
        }

    }
}