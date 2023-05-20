package UF5.TextField;

import javax.swing.*;
import java.awt.*;

public class NameTextFieldExample extends JFrame {
    private JTextField firstNameField;
    private JTextField lastNameField;

    public NameTextFieldExample() {
        setTitle("Name Field Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        firstNameField = createTextField("First Name");
        lastNameField = createTextField("Last Name");

        add(firstNameField);
        add(lastNameField);

        pack();
        setVisible(true);
    }

    private JTextField createTextField(String placeholder) {
        JTextField textField = new JTextField(10);
        textField.setText(placeholder);
        textField.setForeground(new Color(0, 0, 0, 128)); // Set text color with low opacity
        textField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(new Color(0, 0, 0, 128));
                }
            }
        });

        return textField;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new NameTextFieldExample();
        });
    }
}
