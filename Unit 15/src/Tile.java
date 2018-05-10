import java.awt.Color;
import java.awt.Graphics;

public class Tile extends Block
{
	
	public Tile(int x, int y, int wdt, int hgt, Color col)
	{
		super(x,y,wdt,hgt,col);
	}
	


}

//see if the ball is colliding with above or below tiles
/**
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
*/



/**
//see if the ball is colliding with above or below tiles

for(int i = 0; i < above.size(); i++){
	if (ball.didCollideTileTop(above.get(i))) 

	{
		above.get(i).setColor(Color.white);
		above.get(i).draw(graphToBack);
		above.remove(i);
		ball.setYSpeed(-ball.getySpeed());
	}			
	
}

for(int i = 0; i < below.size(); i++){
	if (ball.didCollideTileBottom(below.get(i))) 

	{
		below.get(i).setColor(Color.white);
		below.get(i).draw(graphToBack);
		below.remove(i);
		ball.setYSpeed(-ball.getySpeed());
	}			
	
}

//see if the ball is colliding with left or right tiles

for(int i = 0; i < leftside.size(); i++){
	if (ball.didCollideTileLeft(leftside.get(i)))

	{
		leftside.get(i).setColor(Color.white);
		leftside.get(i).draw(graphToBack);
		leftside.remove(i);
		ball.setXSpeed(-ball.getxSpeed());
	}			
	
}

for(int i = 0; i < rightside.size(); i++){
	if (ball.didCollideTileRight(rightside.get(i)))

	{
		rightside.get(i).setColor(Color.white);
		rightside.get(i).draw(graphToBack);
		rightside.remove(i);
		ball.setXSpeed(-ball.getxSpeed());
	}			
	
}
*/
