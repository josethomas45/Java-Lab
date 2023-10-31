/**********************************************************
 * File        :  dowhile.java
 * Description :  problem using do while
 * Author      :  Jose Thomas
 * Version     :  1.0
 * Date        :  26/09/2023
 **********************************************************/package javaproj1;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		
		int sum=0,num,limit,i=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		do{
			
		sum=sum+num;
		System.out.println("Enter the next number ; ");
		num=sc.nextInt();
		
		}while(num>0);
		
		
		
		System.out.println("The sum is "+sum);
		
	}
}
