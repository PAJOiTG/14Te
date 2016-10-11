package gametut;
import java.awt.*;
import java.awt.event.KeyEvent;


public class racket {
	private static final int WIDTH  = 10;
	private static final int HEIGHT = 100;
	private static final int X = 20;
	private int Y = 120;
	private int moveRacket = 0; 
	public Game game;
	public racket(Game game){
		this.game = game;
	}
	
	public void paint(Graphics2D g){
		g.setColor(Color.blue);
		g.fillRect(X, Y, WIDTH, HEIGHT);
	}
	
	void move(){
		if(Y + moveRacket > 0 && Y + moveRacket < game.getWidth() - WIDTH)
			Y += moveRacket;
	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_W)
			moveRacket = -2;
		
		if(e.getKeyCode() == KeyEvent.VK_S)
			moveRacket = 2;
		
	}

	public void keyReleased(KeyEvent e) {
		moveRacket = 0;
		
	}
	
	public Rectangle getBounds(){
		return new Rectangle(X, Y, WIDTH, HEIGHT);
	}
	
	public int getY(){
		return Y;
	}
}
