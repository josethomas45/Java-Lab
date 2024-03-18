package javaproj1;

import java.util.Scanner;

public class abclass {
	
	public static void main(String[] args)
	{
		Rectangle rectangle=new Rectangle();
		Triangle triangle=new Triangle();
		Hexagon hexagon=new Hexagon();
		
		rectangle.numberOfSides();
		triangle.numberOfSides();
		hexagon.numberOfSides();
	}

}
abstract class shape{
	void numberOfSides() {
		
	}
}
class Rectangle extends shape{
	 
	void numberOfSides() {
		
		System.out.println("Number of sides of rectangle= 4");
		
	}
}
class Triangle extends shape{
	 
	void numberOfSides() {
		
		System.out.println("Number of sides of triangle= 3");
		
	}
}
class Hexagon extends shape{
	 
	void numberOfSides() {
		
		System.out.println("Number of sides of hexagon= 6");
		
	}
}
