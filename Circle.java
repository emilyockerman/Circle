/*
* Circle.java
* Author: Emily Ockerman
* Submission Date: October 24, 2018
*
* Purpose: To create a class circle that defines circle objects!
*
* Statement of Academic Honesty:
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

import java.util.Scanner;

//*******************************************************
// Circle.java
//
// 
//*******************************************************
public class Circle {
	
	private String name;       // declare the private String instance  name
	private double radius;      // declare the private double instance  radius
	private double x;       // declare the private double instance  x
	private double y;      // declare the private double instance  y

	//Used to compare doubles.  Remember, don't compare doubles directly using ==
	public static final double THRESHOLD = 0.000000001;

	//----------------------------------------------
	// getName - returns the value of name
	//----------------------------------------------
	public String getName()
	{
		return name;
	}
	
	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getX() 
	{
		return x;	
	}

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getY() 
	{
		return y;	
	}
	
	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() 
	{
		return radius;
	}
	
	//----------------------------------------------
	// setName - assigns a new value to name
	//----------------------------------------------
	public void setName(String name) 
	{
		this.name = name;
	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setX(double x) 
	{
		this.x = x;
	}
	
	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setY(double y) 
	{
		this.y = y;
	}
	
	
	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double radius) 
	{
		if (radius >= 0)
		{
			this.radius = radius;
		}
	}
	
	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
	public double area() 
	{
		double area = Math.PI * (radius*radius);
		return area;
	}
	
	//--------------------------------------------------------
	// parameter - returns the parameter of the circle
	//--------------------------------------------------------
	public double perimeter() 
	{
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	
	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() 
	{
		double diameter = radius * 2;
		return diameter;
	}

	
	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() 
	{
		if ((Math.abs(radius - 1) < THRESHOLD) && (Math.abs(x - 0) < THRESHOLD) && (Math.abs(y - 0) < THRESHOLD))
		{
			System.out.println("Unit circle");
			return true;
		}
		else
		{
			System.out.println("Not a unit circle.");
			return false;
		}
	}
	
	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//			  name: name
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() 
	{
		return "name: " + name + "\ncenter: " + "(" + x + "," + y + ")" + "\nradius: " + radius;
	}

	public boolean equals(Circle anotherCircle)
	{
		if (Math.abs((this.getRadius() - anotherCircle.getRadius())) < THRESHOLD && Math.abs(this.getX() - anotherCircle.getX()) < THRESHOLD && Math.abs(this.getY() - anotherCircle.getY()) < THRESHOLD)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public double distance(Circle anotherCircle)
	{
		double part1 = Math.pow(x - anotherCircle.getX(), 2);
		double part2 = Math.pow(y - anotherCircle.getY(), 2);
		double result = part1 + part2;
		return result = Math.sqrt(result);
	}
	
	public boolean isSmaller(Circle anotherCircle)
	{
		if ((this.diameter() - anotherCircle.diameter()) < 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int compareTo(Circle anotherCircle)
	{
		if ((this.diameter() - anotherCircle.diameter()) < 0)
		{
			return -1;
		}
		if ((this.diameter() - anotherCircle.diameter()) > 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public boolean intersects(Circle anotherCircle)
	{
		if (this.distance(anotherCircle) < this.getRadius() + anotherCircle.getRadius())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
