package accountcheck;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class work extends JPanel{
	static final String username="amandawwang";
	static final int password=123456;
	JLabel user=new JLabel("Username：");
	JLabel pass=new JLabel("Password：");
	JButton su=new JButton("Check");
	JButton re=new JButton("Reset");
	JTextField u=new JTextField();
	JTextField p=new JTextField();
	
public work() {
	setLayout(null);
	user.setBounds(30, 30, 100, 50);
	add(user);
	u.setBounds(100, 30, 100, 40);
	add(u);
	
	pass.setBounds(30, 80, 100, 50);
	add(pass);
	p.setBounds(100, 80, 100, 40);
	add(p);
	
	su.setBounds(30, 200, 100, 50);
	add(su);
	su.addActionListener(new BListener());
	re.setBounds(150, 200, 100, 50);
	add(re);
	re.addActionListener(new BListener());
}

public class BListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==su) {
		String checku=u.getText().trim();
		int checkp=Integer.parseInt(p.getText());
		if(checku.equals(username) && checkp==password) JOptionPane.showMessageDialog(null, "Right");
		else JOptionPane.showMessageDialog(null, "Wrong"); 
	}
		else {
			u.setText("");
			p.setText("");
		}
		
		}
	
}
}
