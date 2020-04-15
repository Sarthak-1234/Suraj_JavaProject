package ListLearning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorUse {
	
public static void main(String args[]) {
		
		List<String> list = new ArrayList<String>();
		list.add("Sarthak1");
		list.add("Surag1");
		list.add("Sarthak2");
		list.add("Surag2");
		list.add("Sarthak3");
		list.add("Surag3");
		
		//for loop
		//for each loop
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
