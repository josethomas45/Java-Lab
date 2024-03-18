package javaproj1;

import java.util.Scanner;

public class OwnException {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		char ch='y';
		while(ch=='y') {
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		

		
		try {
			int result=num1/num2;
			System.out.println("Result="+result);
		}
		catch(Exception e) {
			System.out.println("/ by zero");
		}
		finally {
			System.out.println("End of the program");
			System.out.println("Do you want to continue?");
			ch=sc.next().charAt(0);
			}
		
	}

}
}
