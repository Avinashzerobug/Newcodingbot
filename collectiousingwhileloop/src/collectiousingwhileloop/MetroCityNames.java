package collectiousingwhileloop;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MetroCityNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Collection<String> names = new LinkedHashSet();
		
		names.add("Bangalore");
		names.add("Hyderabad");
		names.add("Mumbai");
		names.add("Delhi");
		names.add("Kolkata");
		
		System.out.println(names);
		
		System.out.println(System.lineSeparator());
		
		 System.out.println("******Using the for each loop condition*******");
		for(String ref:names)
		{
			System.out.println(ref);
		}
		
		System.out.println(System.lineSeparator());
		Iterator<String> name = names.iterator();
		
	    System.out.println("******Using the while loop condition*******");
		while(name.hasNext())
		{
			String ref1=name.next();
			System.out.println(ref1);
		}
		
	}

}
