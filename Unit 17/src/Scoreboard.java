import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Scoreboard {
	private int level=1;
	private int bossLevel;

	public Scoreboard(){
	}
	public void draw(Graphics window){
		window.setColor(Color.WHITE);
		window.setFont(new Font("Verdana", Font.BOLD, 12));
		window.drawString("level: "+level, 700, 50);
	}
	public void beatLevel(Graphics window){

		window.setFont(new Font("Courier", Font.BOLD, 60));
		window.setColor(Color.RED);
		window.drawString("Next Level: " + (level+1), 150, 250);
		long startTime = System.currentTimeMillis();
		long elapsedTime = 0L;
		while(elapsedTime<1500){
			elapsedTime=(new Date()).getTime()-startTime;
		}
		level++;
	}
	
	
}
