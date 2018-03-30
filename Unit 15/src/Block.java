
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		xPos = 0;
		yPos = 0;
		width = 0;
		height = 0;
		color = null;

	}

	// add other Block constructors - x , y , width, height, color

	public Block(int x, int y, int wdt, int hgt, Color col) {
		xPos = x;
		yPos = y;
		width = wdt;
		height = hgt;
		color = col;
	}

	// add the other set methods
	public void setX(int x) {
		xPos = x;
	}

	public void setY(int y) {
		yPos = y;
	}

	public void setWidth(int wdt) {
		width = wdt;
	}

	public void setHeight(int hgt) {
		height = hgt;
	}

	public void setColor(Color col) {
		color = col;

	}
	
	public void setPos( int x, int y){
		xPos = x;
		yPos = y;
	}

	public void draw(Graphics window) {
		// uncomment after you write the set and get methods
		 window.setColor(color);
		 window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void draw(Graphics window, Color col) {

	}

	public boolean equals(Object obj) {

		if ((this.getColor() == ((Graphics) obj).getColor()) && (this.getX() == ((Locatable) obj).getX())
				&& (this.getY() == ((Locatable) obj).getY()) && (this.getWidth() == ((Block) obj).getWidth())
				&& (this.getHeight() == ((Block) obj).getHeight())) {

			return true;

		}

		return false;
	}

	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Color getColor() {
		return color;

	}

	// add the other get methods
	// add a toString() method - x , y , width, height, color
	
	public String toString(){
		return "x position is " + getX() + "\ny position is " + getY() + "\nwidth is " + getWidth() + "\nheight is " + getHeight() + "\n" + getColor();
	}
	

}