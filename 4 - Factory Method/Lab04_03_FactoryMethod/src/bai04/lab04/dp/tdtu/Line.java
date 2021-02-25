package bai04.lab04.dp.tdtu;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Line {
	private Point a;
	private Point b;
	
	public Line(Point a, Point b) {
		this.a = a;
		this.b = b;
	}
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawLine(a.x, a.y, b.x, b.y);
	}
}
