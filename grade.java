package javaproj1;

import java.util.Scanner;

public class grade {

	public static void main(String[] args){
		
		int mark;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark : ");
		mark=sc.nextInt();
		
		if(mark>90) {
			System.out.println("The grade is S");
		}
		else if(mark>85) {
			System.out.println("The grade is A+");
		}
		else if(mark>80) {
			System.out.println("The grade is A");
		}
		else if(mark>75) {
			System.out.println("The grade is B+");
		}
		else if(mark>70) {
			System.out.println("The grade is B");
		}
		else if(mark>65) {
			System.out.println("The grade is C+");
		}
		else if(mark>60) {
			System.out.println("The grade is C");
		}
		else if(mark>55) {
			System.out.println("The grade is D+");
		}
		else if(mark>50) {
			System.out.println("The grade is D");
		}
		else if(mark>45) {
			System.out.println("The grade is E+");
		}
		else if(mark>40) {
			System.out.println("The grade is E");
		}
		else{
			System.out.println("The grade is F");
		}
	}
}
