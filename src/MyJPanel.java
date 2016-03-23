
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


public class MyJPanel extends JPanel implements MouseMotionListener{
	
	private Square square = new Square(100);
	private int pt_x;
	private int pt_y;
	
	public MyJPanel(){
		addMouseMotionListener(this);
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		// TODO Draw square and fill it with random color decided by method getRandomColor()
		// You should use fillRect()
		g.setColor(square.getRandomColor());
		//g.fillRect(square.getCenterX(mousePt.x), square.getCenterY(mousePt.y), square.getShapeWidth(), square.getShapeHeight());
		g.fillRect(pt_x ,pt_y , square.getShapeWidth(), square.getShapeHeight());
	}
	
	/*
	public void mousePressed(MouseEvent e) {
		
	}*/
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Get mouse dragged position and change suqare's position
		//Point pt = e.getPoint();
		
		pt_x = square.getCenterX(e.getX());
		pt_y = square.getCenterY(e.getY());
		//this.mousePt.setLocation(x, y);
		this.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}
}
