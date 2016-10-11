package gametut;
import java.awt.*;
import java.util.Random;
import java.awt.Graphics;

public class Ball {
	Random rand = new Random(); 
	int moveRandom = rand.nextInt(1) -1; 
	private static final int D = 50;
	private int y = 2;
	private int x = 2;
	private int moveX = 1;
	private int moveY = 1;
	private Game game;
	
	public Ball(Game game){
		this.game = game;
	}
	
	void moveBall(){
		
		if(x + moveX > game.getWidth() - D) 
			//game.gameOver();
		
		if(x < 0)
			//game.gameOver();
		if(y + moveY < 0)
			moveY = 1;
		
		if(y + moveY > game.getHeight() - D)
			moveY = -1;
		if(collision()){
			moveX = -moveX;
			moveY = moveRandom;
			game.bgcolor();
		
		}
			
		x += moveX;
		y += moveY;
	}
	
	

	
	
	public void paint(Graphics g){
		g.fillOval(x, y, D, D);
	}

	
	private Rectangle getBounds(){
		return new Rectangle(x,y, D, D);
	}
	
	private boolean collision(){
		if(game.racket2.getBounds().intersects(getBounds()))
			return true;
		else if(game.racket.getBounds().intersects(getBounds()))
		return true;
		
		else
		return false;
		
		
	}
}
