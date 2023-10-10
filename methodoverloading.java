/**********************************************************
 * File        :  methodoverloading.java
 * Description :  To get the area of different shapes
 * Author      :  Jose Thomas
 * Version     :  1.0
 * Date        :  10/10/2023
 **********************************************************/


package javaproj1;

import java.util.Scanner;

public class methodoverloading {
	public static void main(String[]args) {
		Shapes shapes=new Shapes();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the base and height of the triangle: \t");
		float base=sc.nextFloat();
		float height=sc.nextFloat();
		
		System.out.println("enter the length and breadth of the rectangle: \t");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		
		System.out.println("enter the radius of the circle: \t");
		float radius=sc.nextFloat();
		
		
		shapes.area(base,height);
		shapes.area(length,breadth);
		shapes.area(radius);
		}

}
 class Shapes
{
	double area;
	public void area(float base,float height)
	{
		
		area=base*height*0.5;
		System.out.println("area of triangle="+area);
	}
	public void area(int length,int breadth)
	{
		area=length*breadth;
		System.out.println("area of rectangle="+area);
	}
	public void area(float radius)
	{
		area=3.14*radius*radius;
		System.out.println("area of circle="+area );
	}
	
}