package com.source.methods;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String avatar = "Avatar 2 The Way Of Water is the best movie in the world";
		String reverse = "";
		
		String[] avatar2 = avatar.split(" ");
		
		for(String av:avatar2)
		{
		System.out.println(av);
		}
		
		System.out.println("==================================");
		
	      char[] chars= avatar.toCharArray();
	      StringBuilder builder = new StringBuilder();
	      for(char c:chars)
	      {
	    	  if(Character.isDigit(c))
	    	  {
	    		  builder.append(c);
	    	  }
	      }
		System.out.println(builder);
		
		System.out.println("==================================");
		
		String[] result = avatar.split("");
		
		System.out.println("result =");
		
		for(String str:result)
		{
			System.out.println(str+"|-|");
		}
		
		System.out.println("==================================");
		
		char[] ch = avatar.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	
		System.out.println("==================================");
	
		for(int i=0;i<avatar.length();i++)
		{
			reverse = avatar.charAt(i)+reverse;
		
		System.out.println(reverse);
		}

		System.out.println("==================================");
		
		
		String str1 = avatar.toLowerCase();
		System.out.println(str1);
		
		System.out.println("==================================");
		
		String str2 = avatar.toUpperCase();
		System.out.println(str2);
	
		System.out.println("==================================");
		
		String str = new String("Automobile");
		int count = 0;
		char[] cha=str.toCharArray();
		for(int i=0;i<cha.length;i++)
		{
			for(int j=i+1;j<cha.length;j++)
			{
				if(cha[i]==cha[j])
				{
					System.out.println("Duplicate characters in String are:"+cha[j]);
					count++;
				}
			}
		}
		System.out.println("duplicate characters count:"+count);
		
		System.out.println("==================================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	
		int num = sc.nextInt();
		int org = num;
		int rev = 0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
	      if(org==rev)
	      {
	    	  System.out.println(org+"Palidrome number");
	      }
	      else
	      {
	    	  System.out.println("Not palidrome number");
	      }
	      
		System.out.println("==================================");
			   
	      char chr= 'r';
	      int freq=0;
	     for(int i=0;i<avatar.length();i++)
	     {
	    	 if(chr==avatar.charAt(i))
	    	 {
	    		 ++freq;
	    	 }
	     }
	      
	    System.out.println("No of r:"+chr+"="+freq);
	}

}
