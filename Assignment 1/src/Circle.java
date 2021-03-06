/**
 * The purpose of this class is to implement custom circle info generation into
 * my programs.  This is assignment one for CS 122.
 * 
 * @author Jonathan Meredith
 * 
 */

public class Circle {

	//declare variables
	private double radius;
	
	/**
	 * This constructor, if called, initializes the value of the radius to be 0.
	 */
	public Circle() {
		radius = 0.0;
	}
	
	/**
	 * This constructor, if called, initializes the value of the radius to be
	 * the value of the double passed into it.
	 * @param rad The value to store in the radius
	 */
	public Circle(double rad) {
		radius = rad;
		if (radius < 0) {
			radius = 0;
		}
	}
	
	/**
	 * This constructor, if called, initializes the value of the radius
	 * to be the value of the string that is passed into the constructor.
	 * @param rad The value to store in the radius
	 */
	public Circle(String rad) {
		radius = Integer.parseInt(rad);
		if (radius < 0) {
			radius = 0;
		}
	}
	
	/**
	 * This function, if called, returns the radius that was previously set.
	 * @return The radius of the circle
	 */
	public double getRadius() {
		return radius;
	}
	
	
	/**
	 * This function, if called, returns the diameter calculated from the 
	 * previously set radius.
	 * @return The Diameter of the circle
	 */
	public double getDiameter() {
		return (radius * 2);
	}
	
	
	/**
	 * This function, if called, returns the circumference calculated from
	 * the previously set radius.
	 * @return The Circumference of the circle
	 */
	public double getCircumference() {
		return (2 * Math.PI * radius);
	}
	
	
	/**
	 * This function, if called, returns the area of a circle. It is
	 * calculated from the previously set radius.
	 * @return The area of a circle
	 */
	public double getArea() {
		return ((radius * radius) * Math.PI);
	}
}
