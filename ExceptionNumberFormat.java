/**********************************************************
 * File        :  exceptiontest.java
 * Description :  Application of nested catch and nested try
 * Author      :  Jose Thomas
 * Version     :  1.0
 * Date        :  8/11/2023
 **********************************************************/
public class ExceptionNumberFormat {
	
public static void main(String[] args) {
		
		try {
			String s="abc";
			int [] array= new int[5];
			System.out.println(Integer.parseInt(s));
			System.out.println(10/0);
			System.out.println(array[6]);
		}
		
		catch(NumberFormatException e){
			System.out.println("Sorry, number format");
		}
		
		catch(ArithmeticException e){
			System.out.println("Sorry, Arithematic exception");
		}
		
		catch(Exception e){
			System.out.println("Unexpected exception occured");
		}
		
		finally {
			System.out.println("program runs");
			}

}
}
