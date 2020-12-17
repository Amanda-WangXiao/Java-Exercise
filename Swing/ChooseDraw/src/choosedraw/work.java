package choosedraw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter; 

public class work extends JPanel{

	int flag,shape;
	int x1,y1,x2,y2;
	
	JButton c1=new JButton("BLACK");
	JButton c2=new JButton("RED");
	JButton c3=new JButton("BLUE");
	JButton s1=new JButton("LINE");
	JButton s2=new JButton("NUMBER");
	JButton s3=new JButton("RECTANGLE");
	JLabel text=new JLabel("Mouse Position：");

public work() {
		setLayout(null);
		c1.setBounds(20, 80, 80, 40);
		add(c1);
		c2.setBounds(20, 150, 80, 40);
		add(c2);
		c3.setBounds(20, 220, 80, 40);
		add(c3);
		s1.setBounds(150, 20, 100, 40);
		add(s1);
		s2.setBounds(300, 20, 100, 40);
		add(s2);
		s3.setBounds(450, 20, 100, 40);
		add(s3);
		text.setBounds(20, 300, 200, 50);
		add(text);
		c1.addActionListener(new BListener());
		c2.addActionListener(new BListener());
		c3.addActionListener(new BListener());
		s1.addActionListener(new SListener());
		s2.addActionListener(new SListener());
		s3.addActionListener(new SListener());
		addMouseListener(new MouseChange());
		addMouseMotionListener(new MouseMotion());
	}
public class BListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==c1) {
		flag=1;
		}
		else if(e.getSource()==c2){
			flag=2;
		}
		else {
			flag=3;
	}
	}
}

public class SListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==s1){
			
			shape=1;
		}
		else if(e.getSource()==s2){
	
			shape=2;
		}
		else {
		
			shape=3;
		}
	
}
}

private class MouseChange extends MouseAdapter{
	public void mousePressed(MouseEvent e) {
		Graphics2D g=(Graphics2D) getGraphics();
		
		if(shape==1) {
		x1=e.getX();
		y1=e.getY();
	}
		else if(shape==2) {
		x1=e.getX();
		y1=e.getY();
		if(flag==1) g.setColor(Color.BLACK);
		else if(flag==2) g.setColor(Color.RED);
		else g.setColor(Color.BLUE);
			g.drawString("Designed by Amanda Wang", x1, y1);
		}
			
		else {
			x1=e.getX();
			y1=e.getY();
			if(flag==1) g.setColor(Color.BLACK);
			else if(flag==2) g.setColor(Color.RED);
			else g.setColor(Color.BLUE);
			g.drawRect(x1, y1, 100, 50);
}

}
}


private class MouseMotion extends MouseMotionAdapter{
	public void mouseDragged(MouseEvent e) {
		Graphics2D g=(Graphics2D) getGraphics();
		if(shape==1) {
			if(flag==1) g.setColor(Color.BLACK);
			else if(flag==2) g.setColor(Color.RED);
			else g.setColor(Color.BLUE);
			x2=e.getX();
			y2=e.getY();
			g.drawLine(x1, y1, x2, y2);
			x1=x2;
			y1=y2;
			g.dispose();
		}
	
	}
	
	public void mouseMoved(MouseEvent e) {
		text.setText("Mouse Position：(" + e.getX()+ " ," + e.getY()+")");
	}
}

}
