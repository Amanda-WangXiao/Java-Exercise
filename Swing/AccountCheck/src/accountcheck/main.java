package accountcheck;

import javax.swing.JFrame;

public class main {
public static void main(String[] args) {
	JFrame j=new JFrame("Account Check Demo");	
	j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	j.add(new work());
	j.setSize(300, 300);
	j.setVisible(true);
	
}
}
