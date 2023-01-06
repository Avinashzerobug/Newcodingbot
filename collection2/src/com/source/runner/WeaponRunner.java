package com.source.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.source.constant.Type;
import com.source.dto.WeaponDTO;

public class WeaponRunner {

	public static void main(String[] args) {
		
		
		WeaponDTO dto=new  WeaponDTO("A1-47","Avinash","Metal",170000,Type.AK47);
		WeaponDTO dto1=new  WeaponDTO("Tanker","longer world","alluminum",1000,Type.M416);
		WeaponDTO dto2=new  WeaponDTO("Rocket Launcher","Wrold war","Platinum",176000,Type.MA47);
		WeaponDTO dto3=new  WeaponDTO("F16-weapon","lord of rings","Gold",350000,Type.AK47);
		WeaponDTO dto4=new  WeaponDTO("Panzer","Netflix","Tagad",10,Type.M416);
		WeaponDTO dto5=new  WeaponDTO("A1-47","Avinash","Metal",170000,Type.AK47);
		WeaponDTO dto6=new  WeaponDTO("Tanker","longer world","alluminum",1000,Type.M416);
		WeaponDTO dto7=new  WeaponDTO("Rocket Launcher","Wrold war","Platinum",176000,Type.MA47);
		WeaponDTO dto8=new  WeaponDTO("F16-weapon","lord of rings","Gold",3500,Type.AK47);
		WeaponDTO dto9=new  WeaponDTO("Panzer","Netflix","Vibranium",10,Type.M416);
		WeaponDTO dto10=new  WeaponDTO("A1-47","Avinash","Metal",170000,Type.AK47);
		WeaponDTO dto11=new  WeaponDTO("Tanker","longer world","alluminum",1000,Type.M416);
		WeaponDTO dto12=new  WeaponDTO("Rocket Launcher","Wrold war","Platinum",176000,Type.MA47);
		WeaponDTO dto13=new  WeaponDTO("F16-weapon","lord of rings","Gold",35000,Type.AK47);
		WeaponDTO dto14=new  WeaponDTO("Panzer","Netflix","Tagad",10,Type.M416);
		WeaponDTO dto15=new  WeaponDTO("A1-47","Avinash","Metal",170000,Type.AK47);
		WeaponDTO dto16=new  WeaponDTO("Tanker","longer world","alluminum",1000,Type.M416);
		WeaponDTO dto17=new  WeaponDTO("Rocket Launcher","Wrold war","Platinum",1700,Type.MA47);
		WeaponDTO dto18=new  WeaponDTO("F16-weapon","lord of rings","Gold",35000,Type.AK47);
		WeaponDTO dto19=new  WeaponDTO("Panzer","Netflix","Tagad",10,Type.M416);
		
		
		Collection<WeaponDTO> dtos = Stream.of(dto,dto1,dto2,dto3,dto4,dto5,dto6,dto7,dto8,dto9,dto10,dto11,dto12,dto13,dto14,dto15,dto16,dto17,dto18,dto19).collect(Collectors.toSet());
		
		System.out.println("Checking the Ascending order");
		
		dtos.stream().sorted((a1,a2)->a1.getName().compareTo(a2.getName())).forEach(e->System.out.println(e));
		 System.out.println(System.lineSeparator());
	    dtos.stream().forEach(e->System.out.println("Made By"+e.getMadeBy()+" "+"Made on"+e.getMadeOn()));
		
	    System.out.println(System.lineSeparator());
		dtos.stream().sorted((a1,a2)->a2.getName().compareTo(a1.getName())).forEach(e->System.out.println(e.getName()));
		
	    System.out.println(System.lineSeparator());
		dtos.stream().sorted((a1,a2)->a1.getMadeBy().compareTo(a2.getMadeBy())).forEach(e->System.out.println(e.getMadeBy()));
		
		
	    System.out.println(System.lineSeparator());
		dtos.stream().sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn())).forEach(e->System.out.println(e.getMadeOn()));
		

	    System.out.println(System.lineSeparator());
	    dtos.stream().filter(ele->ele.getPrice()>500).sorted((a1,a2)->Double.compare(a1.getPrice(),a2.getPrice())).forEach(e->System.out.println(e.getPrice()));
	    
	    System.out.println(System.lineSeparator());
	    dtos.stream().sorted((a1,a2)->Double.compare(a2.getPrice(),a1.getPrice())).forEach(e->System.out.println(e.getPrice()));
	   
	
		System.out.println(System.lineSeparator());
		dtos.stream().sorted((a1,a2)->(a1.getName()+a1.getMadeOn()).compareTo(a2.getName()+a2.getMadeOn())).forEach(e->System.out.println(e.getName()+"--"+e.getMadeOn()
		));
		
		System.out.println(System.lineSeparator());
		dtos.stream().sorted((a1,a2)->(a2.getType()+a2.getMadeBy()+a2.getName()).compareTo(a1.getType()+a1.getMadeBy()+a1.getName())).forEach(e->System.out.println(e.getType()+"--"+e.getMadeBy()+"--"+e.getName()));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
