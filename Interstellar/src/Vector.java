
public class Vector 
{
	//x and y variables
	private double x;
	private double y;
	
	//constructor
	public Vector(double xIn, double yIn)
	{
		x = xIn;
		y = yIn;
	}
	
	/**
	 * Returns a new vector, which is the sum of the two vectors.
	 * @param v
	 * @return Vector (sum of both vectors)
	 */
	public Vector add(Vector v)
	{
		//creates new vector then returns vector
		Vector newV = new Vector(x + v.getX(), y + v.getY());
		return newV;
		
	}
	
	//Setters and getters
	public void setX(double newX)
	{
		x = newX;
	}
	public void setY(double newY)
	{
		y = newY;
	}
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
}
