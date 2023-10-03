/**********************************************************
 * File        :  palindom.java
 * Description :  To find palindrome numbers 
 * Author      :  Jose Thomas
 * Version     :  1.0
 * Date        :  03/10/2023
 **********************************************************/
package javaproj1;

import java.util.Scanner;

public class palindom {
  public static void main(String[] args) {
	  String input;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string to be checked");
		input=sc.next();
		boolean check=ispalindrome(input);
		if(check==true)
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}
	static boolean ispalindrome(String input)
	{
		char characterArray[] = input.toCharArray();
		int length=input.length();
		for(int i=0;i<length;i++)
		{
			if(characterArray[i]!=characterArray[length-i-1]) {
				return false;
			}
			
		}
		return true;
	}

}