package caculate;

import javax.swing.JFrame;

public class main {
public static void main(String[] args) {
	JFrame j=new JFrame("Simple Caculator");
	j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	j.add(new caculate());
	j.setSize(500, 300);
	j.setVisible(true);
	
}
}
