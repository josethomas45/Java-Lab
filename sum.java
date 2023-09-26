/**********************************************************
 * File        :  sum.java
 * Description :  To add two numbers
 * Author      :  Jose Thomas
 * Version     :  1.0
 * Date        :  26/09/2023
 **********************************************************/
package javaproj1;

import java.util.Scanner;

public class sum {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int sum=num1+num2;
		
		System.out.println("Sum of the number is: \n"+sum);
	}

}
