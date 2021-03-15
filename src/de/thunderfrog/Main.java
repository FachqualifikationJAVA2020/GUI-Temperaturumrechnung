package de.thunderfrog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {


    private JFrame frame;
    private JTextField fahrenheitText;
    private JTextField celciusText;
    private JButton calulateButton;


    public Main(){
        // Frame
        frame = new JFrame();
        frame.setTitle("Temperaturumwandeln");
        frame.setLocation(100,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //  Layout Manager
        frame.setLayout(new BorderLayout());

        // Components
        celciusText = new JTextField(25);
        fahrenheitText = new JTextField(25);
        calulateButton = new JButton();

        //  Components Layout
        calulateButton.setText("Zum umrechnen Bitte hier klicken!");
        frame.add(celciusText, BorderLayout.WEST);
        frame.add(calulateButton, BorderLayout.CENTER);
        frame.add(fahrenheitText, BorderLayout.EAST);

        calulateButton.addActionListener(this);

        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new Main();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!celciusText.getText().equals("")){
            double celcius = Double.parseDouble(celciusText.getText());
            fahrenheitText.setText(String.valueOf(celcius * 9 / 5 + 32));
        }else {
            double fahrenheit = Double.parseDouble(fahrenheitText.getText());
            celciusText.setText(String.valueOf((fahrenheit -32) /9 *5));
        }
    }
}
