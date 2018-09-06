/**
 * The purpose of this class is to implement custom circle info generation into
 * my programs.  This is assignment one for CS 122.
 * 
 * @author Jonathan Meredith
 * 
 */

public class Circle {

	//declare variables
	private double rad;
	
	/**
	 * This constructor, if called, initializes the value of the radius to be 0.
	 */
	public Circle() {
		rad = 0.0;
	}
	
	/**
	 * This constructor, if called, initializes the value of the radius to be
	 * the double passed into it.
	 */
	public Circle(double radius) {
		rad = radius;
		if (rad < 0) {
			rad = 0;
		}
	}
	
	/**
	 * This constructor, if called, initializes the value of the radius to be
	 * the value of the string that is passed into the constructor.
	 */
	public Circle(String radius) {
		rad = Integer.parseInt(radius);
		if (rad < 0) {
			rad = 0;
		}
	}
	
	/**
	 * This function, if called, returns the radius that was previously set.
	 */
	public double getRadius() {
		return rad;
	}

	/**
	 * This function, if called, returns the diameter calculated from the 
	 * previously set radius.
	 */
	public double getDiameter() {
		return (rad * 2);
	}

	/**
	 * This function, if called, returns the area of a circle. It is calculated
	 * from the previously set radius.
	 */
	public double getArea() {
		return (rad * 2);
	}
}
