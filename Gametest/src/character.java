import ch.aplu.jgamegrid.*;
import java.awt.event.KeyEvent;

class character extends Actor implements GGKeyListener

{
  public character()
  {
    super(true, "sprites/char.png");
   
  }

  public boolean keyPressed(KeyEvent evt)
  {
	  System.out.println("test");
    switch (evt.getKeyCode())
    {
      case KeyEvent.VK_UP:
    	System.out.println("test");
        setDirection(270);
        break;
      case KeyEvent.VK_RIGHT:
        setDirection(0);
        break;
      case KeyEvent.VK_LEFT:
        setDirection(180);
        break;
      case KeyEvent.VK_DOWN:
        setDirection(90);  
        break;
    }
     move();
     return true;
    
  }

  public boolean keyReleased(KeyEvent evt)
  {
    return true;
  }

@Override
public boolean keyHit(int keyCode) {
	// TODO Auto-generated method stub
	return true;
}
}

