/**********************************************************
 * File        :  attendance.java
 * Description :  To find the internal mark for attendance
 * Author      :  Jose Thomas
 * Version     :  1.0
 * Date        :  26/09/2023
 **********************************************************/
package javaproj1;

import java.util.Scanner;

public class attendance {
	
	public static void main(String[] args) {
		
		float attendance;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the attendance: ");
		attendance=sc.nextInt();		
		
		if(attendance>90) {
			System.out.println("Attendance mark = 10");
		}
		
		else {
			attendance=attendance/10;
			System.out.println("Attendence mark = "+attendance);
		}
			
		
	}

}
