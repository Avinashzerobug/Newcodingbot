package com.Instantiation.boot;

public class TextTileShop {

	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public long   ownerDaughterNum;
	public int    ownersNoOfWifes;
	public int    shopNo;
	public long   contactNo;
	
	
	public TextTileShop()
	{
		System.out.println("///////////////////////////////////");
	}
	
	public TextTileShop(String ownerName,String ownerWifeName, String ownerDaughterName,long ownerDaughterNum,int   ownersNoOfWifes,int shopNo, long contactNo)
	{
		this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNum,ownersNoOfWifes,shopNo);
		this.contactNo = contactNo;
		
	}
	
	public TextTileShop(String ownerName,String ownerWifeName, String ownerDaughterName,long ownerDaughterNum,int ownersNoOfWifes,int shopNo)
	{
		this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNum,ownersNoOfWifes);
		this.shopNo = shopNo;
		
	}
	
	
	public TextTileShop(String ownerName,String ownerWifeName,String ownerDaughterName,long ownerDaughterNum,int ownersNoOfwifes)
	{
		this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNum);
		this.ownersNoOfWifes = ownersNoOfWifes;	
	}
	
	
	public TextTileShop(String ownerName,String ownerWifeName,String ownerDaughterName,long ownerDaughterNum)
	{
		this(ownerName,ownerWifeName,ownerDaughterName);
		this.ownerDaughterNum = ownerDaughterNum;
		
	}
	
    public TextTileShop(String ownerName,String ownerWifeName,String ownerDaughterName)
    {
    	this(ownerName,ownerWifeName);
    	this.ownerDaughterName = ownerDaughterName;
    }
	
    public TextTileShop(String ownerName,String ownerWifeName)
    {
       this(ownerName);
       this.ownerWifeName = ownerWifeName;
    	
    }
    
	public TextTileShop(String ownerName)
	{
		this();
		this.ownerName = ownerName;
		
	}
	
	
}




