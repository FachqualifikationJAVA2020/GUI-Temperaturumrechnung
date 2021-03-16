package einfach;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Nicole_Temperaturumrechnung extends JFrame implements ActionListener, MouseListener {
    private JFrame frame;
    private JTextField fahrenheit;
    private JTextField celsius;
    private JButton calculateBtn;

    public Nicole_Temperaturumrechnung(){
        frame = new JFrame();
        frame.setTitle("Temperatur GUI");
        frame.setLocation(100, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        celsius = new JTextField(15);
        	celsius.setText("Temperatur Celsius");
        	celsius.setFont(new Font("Verdana", Font.ITALIC, 13));
        	celsius.setForeground(Color.gray);
        fahrenheit = new JTextField(15);
        	fahrenheit.setText("Temperatur Fahrenheit");
        	fahrenheit.setFont(new Font("Verdana", Font.ITALIC, 13));
        	fahrenheit.setForeground(Color.gray);
        calculateBtn = new JButton();
        	calculateBtn.setText("Zum Umrechnen bitte hier klicken");
        	calculateBtn.setFont(new Font("Alien Encounters", Font.PLAIN, 13));
        	calculateBtn.setBackground(Color.white);

    	frame.add(celsius, BorderLayout.WEST);
        frame.add(calculateBtn, BorderLayout.CENTER);
        frame.add(fahrenheit, BorderLayout.EAST);

        celsius.addMouseListener(this);
        fahrenheit.addMouseListener(this);
        calculateBtn.addActionListener(this);
        
        frame.setMinimumSize(new Dimension(710, 74));
        // frame.setMaximumSize(new Dimension(400, 300)); bringt mir grad nix
        // frame.pack(); wegen min und max raus
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Nicole_Temperaturumrechnung();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    	if(!celsius.getText().equals("")){
            double celsiusDouble = Double.parseDouble(celsius.getText());
            fahrenheit.setText(String.valueOf(celsiusDouble * 9 / 5 + 32));
        }else {
            double fahrenheitDouble = Double.parseDouble(fahrenheit.getText());
            celsius.setText(String.valueOf((fahrenheitDouble -32) /9 *5));
        }
    }

	@Override
	public void mouseClicked(MouseEvent me) {
		celsius.setText("");
	    	celsius.setFont(new Font("Verdana", Font.PLAIN, 11));
	    	celsius.setForeground(Color.black);
		fahrenheit.setText("");
		fahrenheit.setFont(new Font("Verdana", Font.PLAIN, 11));
		fahrenheit.setForeground(Color.black);
	}

	@Override
	public void mousePressed(MouseEvent me) {
	}

	@Override
	public void mouseReleased(MouseEvent me) {	
	}

	@Override
	public void mouseEntered(MouseEvent me) {
	}

	@Override
	public void mouseExited(MouseEvent me) {	
	}

//	@Override
//	public void focusGained(FocusEvent e) {
//		celsius.setText("");
//		fahrenheit.setText("");
//	}
//
//	@Override
//	public void focusLost(FocusEvent e) {
//		celsius.setText("Temperatur Celsius");
//		fahrenheit.setText("Temperatur Fahrenheit");
//	}


}