package penanderaser;

import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;


public class work extends JPanel{
	int x1,y1,x2,y2;
	int flag;
	JLabel text1=new JLabel("Use the left mouse button to draw");
	JLabel text2=new JLabel("Use the right mouse button to erase");
	public work(){
		setBackground(Color.WHITE);
		setLayout(null);
		text1.setBounds(20, 20, 350, 20);
		add(text1);
		text2.setBounds(20, 30, 350, 30);
		add(text2);
		addMouseListener(new MouseChange());
		addMouseMotionListener(new MouseMotion());

	}
	
private class MouseChange extends MouseAdapter {
	public void mousePressed(MouseEvent e) {
		//Graphics2D g=(Graphics2D) getGraphics();
		x1=e.getX();
		y1=e.getY();
		if(SwingUtilities.isRightMouseButton(e)==true) flag=1;
		else flag=2;
	}
}

private class MouseMotion extends MouseMotionAdapter {
	public void mouseDragged(MouseEvent e) {
		Graphics2D g=(Graphics2D) getGraphics();
		x2=e.getX();
		y2=e.getY();
		if(flag==1) g.setColor(Color.WHITE);
		else g.setColor(Color.BLACK);
		g.drawLine(x1, y1, x2, y2);
		x1=x2;
		y1=y2;
		g.dispose();
	}
	
}



}
