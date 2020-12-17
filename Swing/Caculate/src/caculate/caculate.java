package caculate;
import java.awt.TextArea;
import java.awt.TextComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.*;

public class caculate extends JPanel {
	JTextField n1=new JTextField();
	JTextField n2=new JTextField();
	JLabel text=new JLabel("=");
	JButton b1=new JButton("+");
	JButton b2=new JButton("-");
	JButton b3=new JButton("*");
	JButton b4=new JButton("/");
	
public caculate() {
	setLayout(null);
	n1.setBounds(30, 30, 100, 50);
	n2.setBounds(150, 30, 100, 50);
	text.setBounds(260, 30, 100, 50);
	add(n1);
	add(n2);
	add(text);
	
	b1.setBounds(30, 100, 100, 50);
	b1.addActionListener(new BListener());
	add(b1);
	b2.setBounds(150, 100, 100, 50);
	b2.addActionListener(new BListener());
	add(b2);
	b3.setBounds(270, 100, 100, 50);
	b3.addActionListener(new BListener());
	add(b3);
	b4.setBounds(390, 100, 100, 50);
	b4.addActionListener(new BListener());
	add(b4);
}


public class BListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		int x1=Integer.parseInt(n1.getText());
		int x2=Integer.parseInt(n2.getText());
		
		if(e.getSource()==b1) {
			text.setText("="+(x1+x2));
		}
		else if(e.getSource()==b2) {
			text.setText("="+(x1-x2));
	}
		else if(e.getSource()==b3) {
		text.setText("="+(x1*x2));
	}
		else text.setText("="+(x1/x2));
}
}
}