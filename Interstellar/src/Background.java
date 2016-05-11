import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Background implements Drawable
{
	public Background()
	{
		
	}

	public void draw(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(0, 0, PlayGame.MAX_WIDTH, PlayGame.MAX_HEIGHT);
		Random generator = new Random();
		  int xCoord;
		  int yCoord;
		  boolean exit = true;
		  int stars = 0;
		  while (exit == true)
		  {
		    if (stars == 777)
		    {
		      exit = false;
		    }
		    else
		    {
		      xCoord = generator.nextInt(1000);
		      yCoord = generator.nextInt(1000);
		      g.setColor(Color.white);
		      g.fillRect (xCoord + 20, yCoord + 20, 2, 2);
		      stars ++; 
		    }
		  }
	}

}
