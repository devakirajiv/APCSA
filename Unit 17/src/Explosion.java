//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;


public class Explosion extends MovingThing{
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

	public Explosion()
	{
		xPos = 300;
		yPos = 500;
		width = 200;
		height = 200;
		color = Color.GREEN;
	}

	public Explosion(int x, int y, int wdt, int hgt) {
		xPos = x;
		yPos = y;
		width = wdt;
		height = hgt;
		color = Color.GREEN;
	}
	

	

	public void draw( Graphics window )
	{
		window.setColor(color);
		window.fillRect(xPos, yPos, width, height);
	}



	@Override
	public void setSpeed(int s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move(String direction) {
		// TODO Auto-generated method stub
		
	}

}
