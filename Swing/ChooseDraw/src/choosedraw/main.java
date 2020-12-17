package choosedraw;

import javax.swing.JFrame;

public class main {
	public static void main(String[] args) {
		JFrame f=new JFrame("Designed by Amanda Wang");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new work());
		f.setSize(700, 400);
	    f.setVisible(true);
	}
}