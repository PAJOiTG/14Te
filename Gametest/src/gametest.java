//BG + chars - Mainfile
package Gametest;
import ch.aplu.jgamegrid.*;

public class gametest extends GameGrid
{
  public gametest()
  {
	 //background
	super(10, 10, 60, null, "sprites/MARTIN.jpg");
	
	//sprite variables
    character Javad = new character();
    addActor(Javad, new Location(0, 0));
    
    
    //sprite variables 2 (random bombs)
   
    
    addKeyListener(Javad); //KeyStrokes  
    show();
    doRun();
  }


  public static void main(String[] args)
  {
    new gametest();
  }
}

