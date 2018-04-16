
//© A+ Computer Science  -  www.apluscompsci.com
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
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = Color.BLACK;

	}

	// add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y){
		xPos = x;
		yPos = y;
		color = Color.black;
		width = 10;
		height = 10;
	}

	public Block(int x, int y, int wdt, int hgt, Color col) {
		xPos = x;
		yPos = y;
		width = wdt;
		height = hgt;
		color = col;
	}
	
	public Block(int x, int y, int wdt, int hgt) {
		xPos = x;
		yPos = y;
		width = wdt;
		height = hgt;
		color = Color.BLACK;
	}
	
	public Block(int x, int y, int wdt) {
		xPos = x;
		yPos = y;
		width = wdt;
		color = Color.BLACK;
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
		color = col;
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
		

	}

	public boolean equals(Object obj) {
		
		Block new1 = (Block) obj;

		if ((this.getColor() == (new1.getColor()) && (this.getX() == new1.getX())
				&& (this.getY() == new1.getY()) && (this.getWidth() == new1.getWidth())
				&& (this.getHeight() == new1.getHeight()))) {

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