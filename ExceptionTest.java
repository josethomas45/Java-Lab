
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
