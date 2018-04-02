
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block {
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;
		setWidth(10);
		setHeight(10);
		setColor(Color.BLACK);
	}

	// add the other Ball constructors
	public Ball(int x, int y) {

		super(x, y);
		xSpeed = 3;
		ySpeed = 1;
		setWidth(10);
		setHeight(10);
		setColor(Color.BLACK);

	}

	public Ball(int x, int y, int w, int h) {

		super(x, y, w, h);
		xSpeed = 3;
		ySpeed = 1;
		setColor(Color.BLACK);

	}

	public Ball(int x, int y, int w, int h, Color col) {

		super(x, y, w, h, col);
		xSpeed = 3;
		ySpeed = 1;

	}

	public Ball(int x, int y, int w, int h, Color col, int xs, int ys) {

		super(x, y, w, h, col);
		xSpeed = xs;
		ySpeed = ys;
	}

	public void setxSpeed(int xs) {
		
		xSpeed = xs;
		
	}
	
	public void setySpeed(int ys) {
		
		ySpeed = ys;
		
	}
	


	public int getxSpeed() {
		return xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	// add the set methods

	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location
		draw(window, Color.WHITE);

		setX(getX() + xSpeed);
		setY(getY() + ySpeed);
		// setY

		// draw the ball at its new location
		draw(window, getColor());
	}

	public boolean equals(Object obj) {

		Ball new2 = (Ball) obj;

		if ((this.getColor() == (new2.getColor()) && (this.getX() == new2.getX()) && (this.getY() == new2.getY())
				&& (this.getWidth() == new2.getWidth()) && (this.getHeight() == new2.getHeight()))
				&& (this.getxSpeed() == (new2.getxSpeed())) && (this.getxSpeed() == (new2.getxSpeed()))) {

			return true;

		}

		return false;
	}

	// add the get methods

	// add a toString() method
	public String toString() {
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getxSpeed() + " "
				+ getySpeed();
	}
}