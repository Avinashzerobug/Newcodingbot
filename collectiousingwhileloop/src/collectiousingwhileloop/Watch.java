package collectiousingwhileloop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class Watch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Collection<String> watches = new ArrayList();	
		
    watches.add("Rolex");
    watches.add("Titan");
    watches.add("Fast track");
    watches.add("Richard Mille");
    watches.add("Rado");
    
    System.out.println(watches);
    
 
    
    System.out.println(System.lineSeparator());
    
    System.out.println("******Using the for each loop condition*******");
    for(String ref:watches)
    {
    	System.out.println(ref);
    }
    
    Iterator<String> watch = watches.iterator();
    
    System.out.println(System.lineSeparator());
    
    System.out.println("******Using the while loop condition*******");
    while(watch.hasNext())
    {
    String	ref1=watch.next();
    System.out.println(ref1);
    }
    	
    
    
    
	}

}
