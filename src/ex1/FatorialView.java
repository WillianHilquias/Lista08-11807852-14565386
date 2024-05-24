package ex1;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FatorialView {
    private JFrame frame;
    private JTextField textField;
    private JLabel resultLabel;
    private JButton button;

    public FatorialView() {
        frame = new JFrame("Calculadora de Fatorial");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        textField = new JTextField();
        button = new JButton("Calcular");
        resultLabel = new JLabel();

        

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(textField.getText());
                    long result = FatorialController.calcular(n);
                    resultLabel.setText("Fatorial: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("ERRO: Entrada inválida");
                } catch (IllegalArgumentException ex) {
                    resultLabel.setText(ex.getMessage());
                }
            }
        });

        frame.setLayout(new GridLayout(3, 1));
        frame.add(textField);
        frame.add(button);
        frame.add(resultLabel);
    }

    public void show() {
        frame.setVisible(true);
    }

    public JTextField getTextField() {
        return textField;
    }

    public JButton getButton() {
       return button;
    }


}



