
public interface Collision 
{
	/**
	 *  Returns true if the object collides with another object
	 * @param other
	 */
	public boolean didCollide(Collision other);
	
	/**
	 * Returns true if the object is round i.e. a Satellite
	 * Returns false if the object is a rectangle
	 */
	public boolean isRound();
	
	/**
	 * Returns the position of the object
	 */
	public Vector getPos();
}
