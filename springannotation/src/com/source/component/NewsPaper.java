package com.source.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired
	@Qualifier("num")
	private int id;
	private String name;
	private String ownerName;
	@Autowired
	@Qualifier("language")
	private String lang;
	private short price;
	@Autowired
	public NewsPaper(@Qualifier("paperName") String name,@Qualifier("owner") String ownerName) {
		super();
		
		this.name = name;
		this.ownerName = ownerName;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getLang() {
		return lang;
	}

	public short getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", lang=" + lang + ", price="
				+ price + "]";
	}

	
	

}
