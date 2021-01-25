//*******************************************************
// CircleTester.jav
// Author: Emily Ockerman (kinda)
// Submission Date: October 24, 2018
//
// Purpose: A client to test the functionality of objects
// of the class Circle
// 
/* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
CSCI 1301: Project 1 Page 3
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/
//*******************************************************
public class CircleTester{
	public static final double THRESHOLD = 0.000000001;
	
	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.setName("Circle 1");
		circle1.setX(0.0);
		circle1.setY(0.0);
		circle1.setRadius(2);
		circle2.setName("Circle 2");
		circle2.setX(2.0);
		circle2.setY(1.0);
		circle2.setRadius(1);
		System.out.println("circle1="+circle1);
		circle1.toString();
		System.out.println("circle2="+circle2);
		circle2.toString();
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		
		//This is a unit test.  It is best to have tests output pass or fail instead of just a bunch of values.
		//Notice how the double comparison is done
		if(Math.abs(2-circle1.getRadius()) < THRESHOLD)
			System.out.println("PASSED: Set Radius");
		else
			System.out.println("FAILED: Set Radius");
		
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setX(-3.0);
		circle1.setY(4.0);
		
		
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		System.out.println("circle1=" + circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.30);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2=" + circle2);	
		
		// print circle1 diameter, area and perimeter
		System.out.println("circle1=\n diameter: " + circle1.diameter() + "\n area: " + circle1.area() + "\n perimeter: " + circle1.perimeter());
		
		// print circle2 diameter, area and perimeter
		System.out.println("circle2=\n diameter: " + circle2.diameter() + "\n area: " + circle2.area() + "\n perimeter: " + circle2.perimeter());
		
		// display whether circle1 is a unit circle
		System.out.println("Circle 1: ");
		circle1.isUnitCircle();
		
		// display whether circle2 is a unit circle
		System.out.println("Circle 2: ");
		circle2.isUnitCircle();
		
		// your additional tests should be placed below here.  Make sure to include at least 2-3 test cases
		// for each method you write.  It is best to write proper unit tests which print pass, fail for each
		// test instead of just dumping values to the screen.
		
		Circle circle3 = new Circle();
		Circle secondUnit = new Circle();
		secondUnit.setName("unit 2");
		secondUnit.setX(0);
		secondUnit.setY(0);
		secondUnit.setRadius(1);
		
		
		//testing get and set name
		System.out.println("NAME TESTS");
		//1
		circle1.setName("circle 1");
		if (circle1.getName() == "circle 1")
		{
			System.out.println("test 1 passed");
		}
		//2
		circle2.setName("circle 2");
		if (circle2.getName() == "circle 2")
		{
			System.out.println("test 2 passed");
		}
		//3
		circle3.setName("circle 3");
		if (circle3.getName() == "circle 3")
		{
			System.out.println("test 3 passed");
		}
		
		
		//testing get and set x
		System.out.println("X TESTS");
		//1
		circle1.setX(2.0);
		if (circle1.getX() == 2.0)
		{
			System.out.println("test 1 passed");
		}
		//2
		circle2.setX(0);
		if (circle2.getX() == 0)
		{
			System.out.println("test 2 passed");
		}
		//3
		circle3.setX(3.0);
		if (circle3.getX() == 3.0)
		{
			System.out.println("test 3 passed");
		}
		
		
		//testing get and set y
		System.out.println("Y TESTS");
		//1
		circle1.setY(4.0);
		if (circle1.getY() == 4.0)
		{
			System.out.println("test 1 passed");
		}
		//2
		circle2.setY(-3);
		if (circle2.getY() == -3)
		{
			System.out.println("test 2 passed");
		}
		//3
		circle3.setY(0);
		if (circle3.getY() == 0)
		{
			System.out.println("test 3 passed");
		}
		
		
		//testing get and set radius
		System.out.println("RADIUS TESTS");
		//1
		circle1.setRadius(-1);
		if (circle1.getRadius() == 2.0)
		{
			System.out.println("test 1 passed");
		}
		//2
		circle2.setRadius(1);
		if (circle2.getRadius() == 1)
		{
			System.out.println("test 2 passed");
		}
		//3
		circle3.setRadius(6);
		if (circle3.getRadius() == 6)
		{
			System.out.println("test 3 passed");
		}
		
		
		//testing area
		System.out.println("AREA TESTS");
		//1
		circle1.area();
		if (circle1.area() == Math.PI*4)
		{
			System.out.println("test 1 passed");
		}
		//2
		circle2.area();
		if (circle2.area() == Math.PI*1)
		{
			System.out.println("test 2 passed");
		}
		//3
		circle3.area();
		if (circle3.area() == Math.PI*36)
		{
			System.out.println("test 3 passed");
		}
		
		
		//testing perimeter
		System.out.println("PERIMETER TESTS");
		//1
		circle1.perimeter();
		if (circle1.perimeter() == 2*Math.PI*2)
		{
			System.out.println("test 1 passed");
		}
		//2
		circle2.perimeter();
		if (circle2.perimeter() == 2*Math.PI*1)
		{
			System.out.println("test 2 passed");
		}
		//3
		circle3.perimeter();
		if (circle3.perimeter() == 2*Math.PI*6)
		{
			System.out.println("test 3 passed");
		}
		
		
		//testing diameter
		System.out.println("DIAMETER TESTS");
		//1
		circle1.diameter();
		if (circle1.diameter() == 4)
		{
			System.out.println("test 1 passed");
		}
		//2
		circle2.diameter();
		if (circle2.diameter() == 2)
		{
			System.out.println("test 2 passed");
		}
		//3
		circle3.diameter();
		if (circle3.diameter() == 12.0)
		{
			System.out.println("test 3 passed");
		}
		
		
		//testing isUnitCircle
		System.out.println("ISUNITCIRCLE TESTS");
		//1
		if (circle1.isUnitCircle() == false)
		{
			System.out.println("test 1 passed");
		}
		//2
		if (circle2.isUnitCircle() == false)
		{
			System.out.println("test 2 passed");
		}
		//3
		Circle unit = new Circle();
		unit.setName("unit circle");
		unit.setX(0);
		unit.setY(0);
		unit.setRadius(1);
		if (unit.isUnitCircle() == true)
		{
			System.out.println("test 3 passed");
		}
		
		
		//testing equals method
		System.out.println("EQUALS TESTS");
		//1
		if(circle1.equals(circle2) == false)
		{
			System.out.println("test 1 passed");
		}
		//2
		if(circle1.equals(circle3) == false)
		{
			System.out.println("test 2 passed");
		}
		//3
		if(unit.equals(secondUnit) == true)
		{
			System.out.println("test 3 passed");
		}
		
		
		//testing distance method
		System.out.println("DISTANCE TESTS");
		//1
		if (unit.distance(secondUnit) == 0)
		{
			System.out.println("test 1 passed");
		}
		//2
		if (circle2.distance(circle3) == Math.sqrt(18))
		{
			System.out.println("test 2 passed");
		}
		//3
		if (circle1.distance(circle3) == Math.sqrt(17))
		{
			System.out.println("test 3 passed");
		}
		
		
		//testing isSmaller method
		System.out.println("ISSMALLER TESTS");
		//1
		if (unit.isSmaller(secondUnit) == false)
		{
			System.out.println("test 1 passed");
		}
		//2
		if (circle2.isSmaller(circle3) == true)
		{
			System.out.println("test 2 passed");
		}
		//3
		if (circle3.isSmaller(circle1) == false)
		{
			System.out.println("test 3 passed");
		}
		
		
		//testing compareTo method
		System.out.println("COMPARETO TESTS");
		//1
		if (unit.compareTo(secondUnit) == 0)
		{
			System.out.println("test 1 passed");
		}
		//2
		if (circle2.compareTo(circle3) == -1)
		{
			System.out.println("test 2 passed");
		}
		//3
		if (circle3.compareTo(circle2) == 1)
		{
			System.out.println("test 3 passed");
		}
		
		
		//testing intersects method
		System.out.println("INTERSECTS TESTS");
		//1
		if (unit.intersects(secondUnit) == true)
		{
			System.out.println("test 1 passed");
		}
		//2
		if (circle2.intersects(circle3) == true)
		{
			System.out.println("test 2 passed");
		}
		//3
		if (circle1.intersects(circle3) == true)
		{
			System.out.println("test 3 passed");
		}
	}
	
}
