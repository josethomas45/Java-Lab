package sample;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Filehandling {
	public static void main(String[]args) {
		char [] data = new char[60];
		FileReader input=null;
		FileWriter output=null;
		String content="This is a program on File handling";
		FileWriter info=null;
		try {
			info = new FileWriter("inputs.txt");
			info.write(content);
			info.flush();
			info.close();
			input = new FileReader("inputs.txt");
			int bytes=input.read(data);
			input.close();
			output = new FileWriter("output.txt");
			output.write(data,0,bytes);
			output.flush();
			output.close();
		}
		catch(IOException io){ 
			io.printStackTrace();
		}
	}

}
