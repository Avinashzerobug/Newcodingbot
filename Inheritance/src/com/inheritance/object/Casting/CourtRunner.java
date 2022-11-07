package com.inheritance.object.Casting;

import com.inheritance.object.Court;
import com.inheritance.object.boot.DistrictCourt;
import com.inheritance.object.boot.HightCourt;
import com.inheritance.object.boot.SupremeCourt;

public class CourtRunner {

	public static void main (String[]  args)
	{
	
	Court cu = new Court();
	System.out.println(cu.name);
	System.out.println(cu.location);
	
	Court court = new HightCourt();
	HightCourt hg = (HightCourt)court; 
   System.out.println(hg.name);
   System.out.println(hg.location);
   System.out.println(hg.caseName);
   System.out.println(hg.noOfEmployee);
	
	
	System.out.println(System.lineSeparator());
	
	Court cu1 = new SupremeCourt();
	SupremeCourt su = (SupremeCourt)cu1;
	 System.out.println(su.name);
	   System.out.println(su.location);
	   System.out.println(su.judgeName);
	   System.out.println(su.noOfTypers);
	   
		System.out.println(System.lineSeparator());
		
   Court cu2 = new DistrictCourt();
   DistrictCourt ds = (DistrictCourt)cu2;
   System.out.println(ds.name);
   System.out.println(ds.location);
   System.out.println(ds.districtName);
   System.out.println(ds.noOfWorkers);
	
	
	
	}	
	
}
