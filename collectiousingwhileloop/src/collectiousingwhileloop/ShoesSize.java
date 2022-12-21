package collectiousingwhileloop;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class ShoesSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<Integer> shoes = new HashSet();
		
		shoes.add(15);
		shoes.add(14);
		shoes.add(13);
		shoes.add(12);
		shoes.add(11);
		shoes.add(10);
		shoes.add(9);
		shoes.add(8);
		shoes.add(7);
		shoes.add(6);
		shoes.add(5);
		shoes.add(4);
		shoes.add(3);
		shoes.add(2);
		shoes.add(1);
		
		System.out.println(shoes);
		
		System.out.println(System.lineSeparator());
		
		 System.out.println("******Using the for each loop condition*******");
		for(Integer ref:shoes)
		{
			System.out.println(ref);
		}
		
		System.out.println(System.lineSeparator());
		
		Iterator<Integer> shoe = shoes.iterator();
		
	    System.out.println("******Using the while loop condition*******");
		while(shoe.hasNext())
		{
		 Integer ref=shoe.next();
		 System.out.println(ref);
		}
		
		
	}

}
