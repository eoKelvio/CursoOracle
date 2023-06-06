package classes;

import java.awt.Color;
import java.awt.Graphics;

public class Ellipse extends Rectangle {

	public Ellipse(Color color, int posX, int posY, int width, int height) {
		super(color, posX, posY, width, height);

	}

	@Override
	public void draw(Graphics g) {
		g.fillOval(super.getPosX(), super.getPosY(), super.getWidth(), super.getHeight());
		g.setColor(super.getColor());
	}
}
