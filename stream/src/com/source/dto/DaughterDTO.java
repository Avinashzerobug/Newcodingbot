package com.source.dto;

import java.io.Serializable;

public class DaughterDTO implements Serializable {

	
    private String name;
    private long   mobile;
    private int    age;
    private boolean commited;
    private boolean alive;
    
	public DaughterDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DaughterDTO(String name, long mobile, int age, boolean commited, boolean alive) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.age = age;
		this.commited = commited;
		this.alive = alive;
	}

	@Override
	public String toString() {
		return "DaughterDTO [name=" + name + ", mobile=" + mobile + ", age=" + age + ", commited=" + commited
				+ ", alive=" + alive + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof DaughterDTO)
			{
				DaughterDTO dto = (DaughterDTO)obj;
				dto.setAge(20);
				dto.setAlive(true);
				dto.setCommited(true);
				dto.setMobile(8618461535L);
				dto.setName("Huliya");
				System.out.println(dto.getAge());
				System.out.println(dto.getMobile());
				System.out.println(dto.getName());
				System.out.println(dto.isAlive());
				System.out.println(dto.isCommited());
				System.out.println(dto);
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCommited() {
		return commited;
	}

	public void setCommited(boolean commited) {
		this.commited = commited;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	
	
	
	
	
	
}
