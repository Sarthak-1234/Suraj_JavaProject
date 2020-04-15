package Gen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Edit {
	
	public static void main(String args[]) throws IOException {
		
		//String a = "{\"name\":\"sarthak\"}";
		
//		String inp =  "This is hit";
//		
//		
//		String out = "1sarthak";
//		
//	
//		
//		
//		
//		String input =  "{\"name\":\"sarthak\", \"phno\":\"43413412\", \"add\":\"244 Noida\"}";
//		System.out.println(input);
//		
//		//String output= {"id":3232, "name":"sarthak", "phno":"43413412", "add":"244 Noida"}
		
	 //Print "This is hit" (output should be in double quotes in console)
		
		String a = "\"This is hit\"";
		System.out.println(a);
		
		String b = "{\"name\":\"sarthak\", \"phno\":\"43413412\", \"add\":\"244 Noida\"}";
		System.out.println(b);
		
		//Assignment - you take b as a string input
		//Output = {\"id":3232, \"name\":\"sarthak\", \"phno\":\"43413412\", \"add\":\"244 Noida\"}
		
		//3232 should be random
		String aa = "\"id\":4234";
		String output =  aa.concat(b);
	}

}