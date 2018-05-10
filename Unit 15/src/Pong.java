
import java.awt.Color;

import java.awt.Graphics;

import java.awt.Graphics2D;

import java.awt.Canvas;

import java.awt.event.ActionEvent;

import java.awt.event.KeyListener;

import java.awt.event.KeyEvent;

import static java.lang.Character.*;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Timer;

import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable, Collidable

{

	private Ball ball;

	private Paddle leftPaddle;

	private Paddle rightPaddle;

	private boolean[] keys;

	private BufferedImage back;

	private int leftscore = 0;

	private int rightscore = 0;

	private Wall left;

	private Wall right;

	private Wall top;

	private Wall bottom;
	
	private ArrayList<Tile> above;
	
	private ArrayList<Tile> below;
	
	private ArrayList<Tile> leftside;
	
	private ArrayList<Tile> rightside;

	public Pong()

	{

		// set up all variables related to the game
		above = new ArrayList<Tile>();
		below = new ArrayList<Tile>();
		leftside = new ArrayList<Tile>();
		rightside = new ArrayList<Tile>();
		
		for(int i = 0; i < 770; i=i+100){
			above.add(new Tile(i,10,85,20,Color.pink));
			above.add(new Tile(i,40,85,20,Color.pink));
			below.add(new Tile(i,505,85,20,Color.pink));
			below.add(new Tile(i,535,85,20,Color.pink));		
		}
		
		for(int i = 75; i < 450; i=i+110){
			leftside.add(new Tile(10,i,20,85,Color.pink));
			leftside.add(new Tile(40,i,20,85,Color.pink));
			rightside.add(new Tile(755,i,20,85,Color.pink));
			rightside.add(new Tile(725,i,20,85,Color.pink));
		}

		ball = new Ball(100, 100, 10, 10, Color.BLUE, 2, 2);

		leftPaddle = new Paddle(200, 200, 40, 40, Color.gray, 5);

		left = new Wall(0, 0, 10, 600);

		right = new Wall(775, 0, 10, 600);

		top = new Wall(0, 0, 800, 10);

		bottom = new Wall(0, 555, 800, 10);

		keys = new boolean[4];

		setBackground(Color.WHITE);

		setVisible(true);

		new Thread(this).start();

		addKeyListener(this); // starts the key thread to log key strokes

	}

	public void update(Graphics window) {

		paint(window);

	}

	public void paint(Graphics window)

	{

		// set up the double buffering to make the game animation nice and
		// smooth

		Graphics2D twoDGraph = (Graphics2D) window;

		// take a snap shop of the current screen and same it as an image

		// that is the exact same width and height as the current screen

		if (back == null)

			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		// create a graphics reference to the back ground image

		// we will draw all changes on the background image

		Graphics graphToBack = back.createGraphics();

		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		
		for(Tile one: above){
			one.draw(graphToBack);
		}
		
		for(Tile one: below){
			one.draw(graphToBack);
		}
		
		for(Tile one: leftside){
			one.draw(graphToBack);
		}
		
		for(Tile one: rightside){
			one.draw(graphToBack);
		}
		
		left.draw(graphToBack);
		right.draw(graphToBack);
		top.draw(graphToBack);
		bottom.draw(graphToBack);

		graphToBack.setColor(Color.GREEN);

		// see if ball hits left wall or right wall

		if (!((ball.getX() >= left.getX() + left.getWidth()) && (ball.getX() <= right.getX() - right.getWidth())))

		{

			if (!(ball.getX() >= 770)){//left.getX() + left.getWidth())) {
				ball.setXSpeed(-ball.getxSpeed());
				ball.setYSpeed(ball.getySpeed());
			}
			if (!(ball.getX() <= 0)){//right.getX() - right.getWidth())) {
				ball.setXSpeed(-ball.getxSpeed());
				ball.setYSpeed(ball.getySpeed());
			}

		}
		
		//see if the ball is colliding with above or below tiles
		
		for(Tile one: above){
			if (ball.didCollideTileTop(one)) 

			{
				one.setColor(Color.white);
				one.draw(graphToBack);
				above.remove(one);
				ball.setYSpeed(-ball.getySpeed());
			}			
			
		}

		for(Tile one: below){
			if (ball.didCollideTileBottom(one)) 

			{
				one.setColor(Color.white);
				one.draw(graphToBack);
				below.remove(one);
				ball.setYSpeed(-ball.getySpeed());
			}			
			
		}

		//see if the ball is colliding with left or right tiles

		for(Tile one: leftside){
			if (ball.didCollideTileLeft(one))

			{
				one.setColor(Color.white);
				one.draw(graphToBack);
				leftside.remove(one);
				ball.setXSpeed(-ball.getxSpeed());
			}			
			
		}

		for(Tile one: rightside){
			if (ball.didCollideTileRight(one))

			{
				one.setColor(Color.white);
				one.draw(graphToBack);
				rightside.remove(one);
				ball.setXSpeed(-ball.getxSpeed());
			}			
			
		}

		
		
		
		
		
		
		// see if the ball hits the top or bottom wall
				
		if (ball.didCollideBottom(bottom) || ball.didCollideTop(top))

		{

			ball.setYSpeed(-ball.getySpeed());

		}
		

		if (keys[0] == true)

		{

			// move left paddle up and draw it on the window

			leftPaddle.moveUpAndDraw(graphToBack);

		}

		if (keys[1] == true)

		{

			// move left paddle down and draw it on the window

			leftPaddle.moveDownAndDraw(graphToBack);

		}

		if (keys[2] == true)

		{

			// move right paddle up and draw it on the window

			leftPaddle.moveLeftAndDraw(graphToBack);

		}

		if (keys[3] == true)

		{

			// move right paddle down and draw it on the window

			leftPaddle.moveRightAndDraw(graphToBack);

		}

		// see if the ball hits the left paddle (right side of paddle)
		
		if (((ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getxSpeed()))&&(ball.getX()> leftPaddle.getX() - 3)
				&& (ball.getY() >= leftPaddle.getY()) && ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight())) {
			if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getxSpeed()))
				ball.setYSpeed(-ball.getySpeed());
			else
				ball.setXSpeed(-ball.getxSpeed());

			} 
		
		
		
		

		
		// see if the ball hits left side of paddle

		if (((ball.getX() + ball.getWidth() >= leftPaddle.getX() - Math.abs(ball.getxSpeed())) &&(ball.getX()<leftPaddle.getX() + 3)
								&& (ball.getY() >= leftPaddle.getY()) && ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight())) {
							if (ball.getX() >= leftPaddle.getX() + Math.abs(ball.getxSpeed()))
								ball.setYSpeed(-ball.getySpeed());
							else
								ball.setXSpeed(-ball.getxSpeed());
								
			
						}
		
						

	


		twoDGraph.drawImage(back, null, 0, 0);

	}
	

	public void keyPressed(KeyEvent e)

	{

		switch (toUpperCase(e.getKeyChar()))

		{

		case 'U':
			keys[0] = true;
			break;

		case 'N':
			keys[1] = true;
			break;

		case 'H':
			keys[2] = true;
			break;

		case 'J':
			keys[3] = true;
			break;

		}

	}

	public void keyReleased(KeyEvent e)

	{

		switch (toUpperCase(e.getKeyChar()))

		{

		case 'U':
			keys[0] = false;
			break;

		case 'N':
			keys[1] = false;
			break;

		case 'H':
			keys[2] = false;
			break;

		case 'J':
			keys[3] = false;
			break;

		}

	}

	public void keyTyped(KeyEvent e) {
	}

	public void run()

	{

		try

		{

			while (true)

			{

				Thread.currentThread().sleep(8);

				repaint();

			}

		} catch (Exception e)

		{

		}

	}

	@Override
	public boolean didCollideLeft(Object obj) {
		Tile n = (Tile) obj;

		if (getX() <= n.getX() + n.getWidth())

			return true;

		else

			return false;

	}

	@Override
	public boolean didCollideRight(Object obj) {
		Tile n = (Tile) obj;

		if (getX() >= n.getX() - n.getWidth())

			return true;

		else

			return false;
	}

	@Override
	public boolean didCollideTop(Object obj) {
		Tile n = (Tile) obj;

		if (getY() <= n.getY() + n.getHeight())

			return true;

		else

			return false;

	}

	@Override
	public boolean didCollideBottom(Object obj) {
		Tile n = (Tile) obj;

		if (getY() >= n.getY() - n.getHeight())

			return true;

		else

			return false;

	}

}
