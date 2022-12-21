package collectiousingwhileloop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompanyNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> company = new ArrayList();
		
		company.add("Oracle");
		company.add("TCS");
		company.add("Microsoft");
		company.add("HCL");
		company.add("Tech Mahindra");
		company.add("GOOGLE");
		company.add("Amazon");
		company.add("Wipro");
		company.add("Cognizante");
		company.add("Accenture");
		company.add("Infosys");
		company.add("Samsung");
		company.add("Apple");
		company.add("Xiomi");
		company.add("IBM");
		company.add("Autodek");
		company.add("Splunk");
		company.add("Dell");
		company.add("Atlassian");
		company.add("Citric System");
		company.add("BMC software");
		
		System.out.println(company);
		
		System.out.println(System.lineSeparator());
		
		 System.out.println("******Using the for each loop condition*******");
		for(String ref:company)
		{
			System.out.println(ref);
		}
		
		Iterator<String> software = company.iterator();
		
	    System.out.println("******Using the while loop condition*******");
		while(software.hasNext())
		{
			String ref1=software.next();
			System.out.println(ref1);
		}
	}

}
