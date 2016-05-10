import java.util.ArrayList;

public class UFO extends Satellite
{
	//constructor
	public UFO(double massIn, double radiusIn, Vector positionIn, Vector velocityIn)
	{
		super(massIn, radiusIn, positionIn, velocityIn);
	}
	
	/**
	 * Calculates next position for the UFO and updates velocity
	 * @param array
	 * @return
	 */
	public void getNextPosition(ArrayList<Satellite> array)
	{
		Vector forceTot = new Vector(0.0, 0.0);
		for(Satellite s: array)
		{
			if(s.isPlanet() || s.isPlanet()) // true if is a planet or earth 
			{
				Vector newForce = new Vector(0.0, 0.0);
				double deltaX = super.getPosition().getX() - s.getPosition().getX();
				double deltaY = super.getPosition().getY() - s.getPosition().getY();
				double distance = deltaX - deltaY;
				double angle = Math.atan2(deltaY, deltaX);
				
				double f = s.GRAVITATIONAL_CONSTANT * s.getMass() * super.getMass() / (distance * distance);
				 
				newForce.setX(f * Math.cos(angle));
				newForce.setY(f * Math.sin(angle));
				forceTot.add(newForce);
			}
		}
		double accelX = forceTot.getX() / super.getMass();
		double accelY = forceTot.getY() / super.getMass();
		
		super.getPosition().setX(super.getVelocity().getX() * TIME_INTERVAL + 0.5 * accelX * TIME_INTERVAL * TIME_INTERVAL);
		super.getPosition().setX(super.getVelocity().getY() * TIME_INTERVAL + 0.5 * accelY * TIME_INTERVAL * TIME_INTERVAL);
		
		super.getVelocity().setX(super.getVelocity().getX() + accelX * TIME_INTERVAL);
		super.getVelocity().setY(super.getVelocity().getY() + accelY * TIME_INTERVAL);
	}
	
	public void draw()
	{
		
	}

	@Override
	public void getNextPosition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isPlanet() {
		// TODO Auto-generated method stub
		return false;
	}
}
