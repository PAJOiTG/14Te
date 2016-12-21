import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;


public class Grid extends JFrame implements KeyListener {
	private static final long serialVersionUID = 1L;

	public static class Gridprop extends StartGame {
		private static final long serialVersionUID = -2983438987027364863L;
        static int width = Integer.parseInt(String.valueOf(StartGame.field1));
		static int height = Integer.parseInt(String.valueOf(StartGame.field2));
		static int gameHeight = Grid.length*height+height-20;
		static int gameWidth = Grid[0].length*width+7;	

	}
	  
	 
	// Game properties Variables
	static int Grid[][] = new int[][]{
		{1,2,3,3,3,7,7,3,4,2,1,6,1},
		{2,3,4,5,1,7,7,7,1,3,2,2,9},
		{3,4,5,1,2,7,3,1,2,3,1,4,1},
		{4,5,1,2,7,2,4,1,2,3,1,5,2},
		{5,1,2,3,4,3,7,2,3,1,4,6,3},
		{4,5,1,2,3,1,7,1,2,6,1,3,7},
		{1,4,6,9,7,2,5,6,2,1,2,3,8},
		{7,3,8,2,2,1,3,2,4,1,2,4,2},
		{1,3,1,8,1,7,1,1,8,2,6,3,9},
		{9,1,2,3,9,5,1,5,2,1,5,6,1},
		{7,2,7,9,3,1,2,1,5,3,2,1,5}
	};
	
	char[] Key = new char[] {'K','E','K','L',' ',' '};
	int var1;
	
	public Grid() {
		JFrame frame = new JFrame();
		// The Game window properties

		System.out.println(Gridprop.width);
		 //Layout Squares = new Layout();		
		frame.setSize(Gridprop.gameWidth, Gridprop.gameHeight); // x & y
		frame.setLocation(400, 50);
		frame.setDefaultCloseOperation(3); //Closes Program on X click	

		frame.setResizable(false); // Disables Window resize
		frame.setTitle("Not Sudoko but Something Else kappal0rd"); 
		frame.setVisible(true);
	}

	
		public void paint(Graphics g){
			super.paint(g);
		      for (int y=0; y<Grid.length; y++) // height
				for (int x=0; x<Grid[0].length; x++){ //width
					g.drawRect(x*Gridprop.width,y*Gridprop.height, Gridprop.width, Gridprop.height);
					g.drawRect(x*Gridprop.width+1,y*Gridprop.height+1, Gridprop.width-2, Gridprop.height-2);
					g.setFont(new Font("",0,17));
					g.drawString(String.valueOf(Grid[y][x]), x*Gridprop.width+2, y*Gridprop.height+16);

					var1 = Grid[y][x];
					
					if (var1 == 1) {
					g.drawString(String.valueOf(Key[1]), x*Gridprop.width+2, (y+1)*Gridprop.height-3);
					}
					g.setFont(new Font("",0,26));
				  }
	}
		@Override
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == 'w') {
				
				System.out.println("kek");
			}
			
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

}
		
		
