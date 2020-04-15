package sets;

import java.util.HashSet;
import java.util.Set;

public class SetLearning {
	
	public static void main(String args[]) {
		//1. sets are unique
		//2. single null value
		//3. It does not have indexing -- no get method
		
		Set<String> set = new HashSet<String>();
		set.add("Sarthak");
		set.add("Surag");
		set.add("Surag");
		set.add("Java");
		//set.add(4.5);
	
		//for loop ---run from particular 1 to 5
		//for each loop will run for all the data
		
		for(int i=0;i<set.size();i++) {
			//set.get
		}
		
		for(String e: set) {
			System.out.println(e);
		}
		
	}

}
