package Gen;

import java.util.HashMap;
import java.util.Map;

public class charFrequency {
	
	public static void main(String args[]) {

		String value = "Sarthak";

		Map<Character, Object> hm = new HashMap<Character, Object>();
		
		
		for(int i=0;i<value.length();i++) {
			
			int count = 1;
			
			for(int j=i+1;j<value.length();j++) {
				if(value.charAt(i)==value.charAt(j)) {
					count++;
					hm.put(value.charAt(i), count);
				} else {
					hm.put(value.charAt(i), count);
				}
				
				
				
			}
			
			
		}
		
		for(Map.Entry e: hm.entrySet()) {
			System.out.println(e.getKey() +"------->"+e.getValue()); 
		}
		
}}
