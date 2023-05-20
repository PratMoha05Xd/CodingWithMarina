package UF5.ComboBox;

import javax.swing.*;
import java.awt.event.*;

public class Ventana6 extends JFrame {
    JPanel panel = new JPanel();
    public Ventana6() {
        this.setSize(500, 500); //Window dem
        setTitle("ComboBox Example"); //Window Title
        setLocationRelativeTo(null); //pone le ventana en el centro
        //khas funcion tkon f inicio
        ColocarJpanel();
        ComboBox();
        setDefaultCloseOperation(EXIT_ON_CLOSE); //cuando haga click se cierre
    }
    private void ColocarJpanel() {
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    private void ComboBox() {
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        JButton b=new JButton("Show");
        b.setBounds(200,100,75,20);
        String languages[]={"C","C++","C#","Java","PHP"};
        final JComboBox cb=new JComboBox(languages);
        cb.setBounds(50, 100,90,20);
        panel.add(cb);
        panel.add(label);
        panel.add(b);
        panel.setLayout(null);
        panel.setSize(350,350);
        panel.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Programming language Selected: "
                        + cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });
    }

}
