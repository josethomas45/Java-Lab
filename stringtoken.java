package javaproj1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class stringtoken {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String sent=sc.nextLine();
		StringTokenizer input=new StringTokenizer(sent);
		int sum=0;
		while(input.hasMoreTokens()) {
			int num = Integer.parseInt(input.nextToken());
			System.out.println(num);
			sum=sum+num;
		}
		System.out.println("Sum of the token="+sum);
		
	}

}
