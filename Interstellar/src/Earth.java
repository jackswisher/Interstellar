
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
	public boolean isPlanet()
	{
		return true;
	}

	@Override
	public boolean didCollide(Collision other) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRound() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Vector getPos() {
		// TODO Auto-generated method stub
		return null;
	}
}
