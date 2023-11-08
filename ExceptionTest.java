/**********************************************************
 * File        :  exceptiontest.java
 * Description :  Application of try and catch
 * Author      :  Jose Thomas
 * Version     :  1.0
 * Date        :  8/11/2023
 **********************************************************/
public class ExceptionTest {
	
	public static void main(String[] args) {
		
		try {
			String s="123";
			System.out.println(Integer.parseInt(s));
		}
		
		catch(Exception e){
			System.out.println("Sorry, number format");
		}
		finally {
		System.out.println("program runs");
		}
	}

}
