
public class Earth extends Satellite implements Collision
{
	public Earth(double massIn, double radiusIn, Vector positionIn, Vector velocityIn)
	{
		super(massIn, radiusIn, positionIn, velocityIn);
	}
	
	public void getNextPosition()
	{
		Vector v = super.getPosition();
		super.setPosition(v);
	}
	
	public void draw()
	{
		
	}
}
