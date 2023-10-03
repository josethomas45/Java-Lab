/**********************************************************
 * File        :  frequency.java
 * Description :  To find the frequency of a character of given string
 * Author      :  Jose Thomas
 * Version     :  1.0
 * Date        :  03/10/2023
 **********************************************************/
package javaproj1;

import java.util.Scanner;

public class frequency {
	public static void main(String[] args) {
		String input;
		char checkCharacter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		input=sc.nextLine();
		System.out.println("Enter the character to be checked :");
		checkCharacter = sc.next().charAt(0);
		int count=frequency(input,checkCharacter);
		System.out.println("Frequency of entered character="+count );
		
		
		
	}
	static int frequency(String input,char checkCharacter){
		int count=0;
		char characterArray[]=input.toCharArray();
		for(int i=0;i<input.length();i++)
		{
			if(checkCharacter == characterArray[i])
			{
				count++;
			}
		}
		return count;
		
	}

}