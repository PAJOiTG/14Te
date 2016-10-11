package gametut;
import java.util.Random;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Game extends JPanel {
	
	Ball ball = new Ball(this);
    racket racket = new racket(this); 
    racket2 racket2 = new racket2(this);
    Font title = new Font("TRAJAN PRO 3", Font.PLAIN, 30);
    
    public Game(){
    	addKeyListener(new KeyListener(){

			public void keyPressed(KeyEvent e) {
			racket.keyPressed(e);
			racket2.keyPressed(e);
			}

			public void keyReleased(KeyEvent e) {
			racket.keyReleased(e);
			racket2.keyReleased(e);
			}

			public void keyTyped(KeyEvent e) {
				
			}
 
    				
    	});
    	setFocusable(true);
    }
    
    public void bgcolor() {
    	Random rand = new Random();
    	float r = rand.nextFloat();
    	float g = rand.nextFloat();
    	float b = rand.nextFloat();
    	Color randomColor = new Color(r, g, b);
    	
    	this.setBackground(randomColor);
    }
	private void move(){
		ball.moveBall();
		racket.move();
		racket2.move();
	}
	
	public void paint(Graphics g){
		super.paint(g);
        this.setOpaque(true);
        
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		
		ball.paint(g2d);
		racket.paint(g2d);
		racket2.paint(g2d);
		g2d.setFont(title);
		g2d.drawString("PINGAPOLLA", 15, 30);
	}
	
	public void gameOver(){
		JOptionPane.showMessageDialog(this,  "JAVAD HAS ENTERED YOUR ZONE!", "Game Over, Noob!", JOptionPane.YES_NO_CANCEL_OPTION);
		System.exit(ABORT);
	}
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Game game = new Game();		
		Character character = new Character();
		
		frame.setSize(600, 600); // x & y
		frame.setLocation(400, 50);
		frame.setDefaultCloseOperation(3); //Closes Program on X click
		
		frame.add(game); // displays content on screen
		//frame.add(character);
		
		//Default settings
		frame.setResizable(false); //Window resize
		frame.setVisible(true); //Shows the Window
		frame.setTitle("Game Test"); 

		// Moving ball Loop
		while(true){
			game.move();
			game.repaint();
			try {
				Thread.sleep(45);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
	}


