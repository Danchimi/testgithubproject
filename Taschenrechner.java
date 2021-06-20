package aufgaben.aufgabe8;

import java.awt.*;
import javax.swing.*;

public class Taschenrechner extends JFrame {

	public Taschenrechner()
	{
		super("Taschenrechner");
		JPanel mainPanel = init();
		this.add(mainPanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(500,200);
		setSize(250,350);
		setVisible(true);
	}

	private JPanel init()
	{
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		JPanel oben = new JPanel();
		oben.setLayout(new FlowLayout());
		JTextField tf = new JTextField(8);
		tf.setFont(new Font("Verdana", Font.PLAIN, 24));
		tf.setHorizontalAlignment(JTextField.RIGHT);
		oben.add(tf);
		
		JPanel unten = new JPanel();
		unten.setLayout(new GridLayout(6,3,10,10));
		JButton b[]=new JButton[9];
		 for(int i=0;i<9;i++)
	      {
	        b[i]=new JButton(i+1+"");
	        unten.add(b[i]);
	      }
		
		JButton b0 = new JButton("0");
		JButton bMal = new JButton("*");
		JButton bDurch = new JButton("/");
		JButton bPlus = new JButton("+");
		JButton bMinus = new JButton("-");
		JButton bKlauf = new JButton("(");
		JButton bKlzu = new JButton(")");
		JButton bKomma = new JButton(".");
		JButton bC = new JButton("C");
		JButton bCE = new JButton("CE");
		JButton bErg = new JButton("=");

		unten.add(bKlauf);		
		unten.add(b0);
		unten.add(bKlzu);		
		unten.add(bMal);
		unten.add(bDurch);
		unten.add(bPlus);
		unten.add(bMinus);
		unten.add(bKomma);
		unten.add(bErg);
		
		panel.add(oben, BorderLayout.NORTH);
		panel.add(unten, BorderLayout.CENTER);
		
		return panel;
	}

	public static void main(String[] args) {
		new Taschenrechner();
	}

}
