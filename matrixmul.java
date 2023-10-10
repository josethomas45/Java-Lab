package javaproj1;

import java.util.Scanner;

public class matrixmul {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int i,j,row1,col1,row2,col2;
		
		System.out.println("enter the rows and columns of first matrix : \t");
		row1=sc.nextInt();
		col1=sc.nextInt();
		
		System.out.println("enter the rows and columns of Second matrix: \t");
		row2=sc.nextInt();
		col2=sc.nextInt();
		
		if(col1!=row2) {
			
			System.out.println("Matrix multiplication cannot be done.");
			
		}
		
		int[][]matrix1=new int[row1][col1];
		int[][]matrix2=new int[row2][col2];
		int[][]result=new int[row1][col2];
		
		System.out.println("Enter the value of first matrix: \t");
		for(i=0;i<row1;i++) {
		 for(j=0;j<col1;j++) {
			 matrix1[i][j]=sc.nextInt();
		 }
		}
		 System.out.println("The first matrix:\t");
		 for(i=0;i<row1;i++) {
			 for(j=0;j<col1;j++) {
				 System.out.print(matrix1[i][j]+"\t");
			 }
			 System.out.println();
		}
		System.out.println("Enter the value of Second matrix: \t");
		for(i=0;i<row2;i++) {
		 for(j=0;j<col2;j++) {
			 matrix2[i][j]=sc.nextInt();
		 }
		}
		 System.out.println("The second matrix:\t");
		 for(i=0;i<row2;i++) {
			 for(j=0;j<col2;j++) {
				 System.out.print(matrix2[i][j]+"\t");
			 }
			 System.out.println();
		}
		
		for(i=0;i<row1;i++) {
			for(j=0;j<col2;j++) {
				result[i][j]=0;
				for(int k=0;k<col1;k++) {
					result[i][j]+=matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		
		System.out.println("The result :");
		for(i=0;i<row1;i++) {
			for(j=0;j<col2;j++) {
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		
	}

		}
		}


