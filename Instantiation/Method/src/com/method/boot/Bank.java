package com.method.boot;
import com.method.boot.identify.branchLocation;
public class Bank {

	
	public String bankName;
	public String appName; 
	public branchLocation  branch;
	public int noOfBranch;
	
	
	public Bank()
	{
		System.out.println("Checking the enum datatype works or not");
		
	}
	
	
	public Bank(String bankName,String appName,int noOfBranch, branchLocation  branch)
	{
		this.bankName = bankName;
		this.appName = appName;
		this.noOfBranch = noOfBranch;
		this.branch = branch;
	}
	
	public void display()
	{
		System.out.println("Bank Name"); 
		System.out.println(this.bankName);
		System.out.println("*******************************");
		System.out.println("App Name");
		System.out.println(this.appName);
		System.out.println("*******************************");
		System.out.println("No Of Branches");
		System.out.println(this.noOfBranch);
		System.out.println("*******************************");
		System.out.println("Branch Location");
		System.out.println(this.branch);
		System.out.println("*******************************");
		
		
		
	}
	
	
	
}
