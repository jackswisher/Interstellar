
public abstract class Satellite implements Drawable
{
	//class scope variables
	private double mass;
	private double radius;
	private Vector position;
	private Vector velocity;
	
	final public double GRAVITATIONAL_CONSTANT = 0.0000000000667408;
	
	//constructor
	public Satellite(double massIn, double radiusIn, Vector positionIn, Vector velocityIn)
	{
		mass = massIn;
		radius = radiusIn;
		position = positionIn;
		velocity = velocityIn;
	}
	

	//abstract method to calculate movement of satellite
	public abstract void getNextPosition();
	
	public abstract boolean isPlanet();
	
	//getters
	public double getMass()
	{
		return mass;
	}
	public double getRadius()
	{
		return radius;
	}
	public Vector getPosition()
	{
		return position;
	}
	public Vector getVelocity()
	{
		return velocity;
	}
	
	
	
	//setters
	public void setMass(double m)
	{
		mass = m;
	}
	public void setRadius(double r)
	{
		radius = r;
	}
	public void setPosition(Vector p)
	{
		position = p;
	}
	public void setVelocity(Vector v)
	{
		velocity = v;
	}
	
}
