package com.source.abstraction.runner;

import com.source.abstraction.Libraries;
import com.source.abstraction.overriding.Libraray;
import com.source.abstraction.ruler.Librarian;

public class LibrarayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libraries libraries = new Libraray();
		
		Librarian liber = new Librarian(libraries);
		
		
		liber.display();
		
		
		
		
		
	}

}
