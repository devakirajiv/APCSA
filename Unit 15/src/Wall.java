
import java.awt.Color;

import java.awt.Graphics;

public class Wall extends Block {

	private int x;

	private int y;

	private int width;

	private int height;

	public Wall() {

		super(100, 100);

	}

	public Wall(int X, int Y, int W, int H) {

		super(X, Y, W, H);

		x = X;

		y = Y;

		width = W;

		height = H;

	}

	public int getX() {

		return x;

	}

	public void setX(int X) {

		x = X;

	}

	public int getY() {

		return y;

	}

	public void setY(int Y) {

		y = Y;

	}

	public int getWidth() {

		return width;

	}

	public void setWidth(int w) {

		width = w;

	}

	public int getHeight() {

		return height;

	}

	public void setHeight(int h) {

		height = h;

	}

	public void draw(Graphics window)

	{

		window.setColor(Color.GRAY);

		window.fillRect(getX(), getY(), getWidth(), getHeight());

	}

}
