package javaproj1;

import java.util.Scanner;

public class matrixTranspose {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the row:\t");
		int row=sc.nextInt();
		System.out.println("Enter the column:\t");
		int col=sc.nextInt();
		
		int[][]a=new int[row][col];
		int[][]b=new int[row][col];
		System.out.println("enter the values of array");
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("transposed matrix");
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				b[i][j]=a[j][i];
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		
	}

}
