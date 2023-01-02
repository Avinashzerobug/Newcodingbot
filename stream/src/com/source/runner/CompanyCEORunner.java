package com.source.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.source.dto.CompanyCEODTO;
import com.source.dto.DaughterDTO;

public class CompanyCEORunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		DaughterDTO ref=new DaughterDTO("Olivia",45346384739L,23,false,true);

		DaughterDTO ref1=new DaughterDTO("anna",45354384739L,27,false,true);

		DaughterDTO ref2=new DaughterDTO("amanda",4534284739L,21,false,true);
	
		DaughterDTO ref3=new DaughterDTO("Olivia2",456384739L,23,false,true);
		
		
		
		
		
		
		
		
		Collection<CompanyCEODTO> dto = new LinkedList<CompanyCEODTO>();

		dto.add(new CompanyCEODTO("Ratan tata","TATA",85,"INDIA","Engineering",false,ref));
		dto.add(new CompanyCEODTO("Ratan tata","TATA SALT",85,"INDIA","Engineering",false,ref1));
		dto.add(new CompanyCEODTO("Bill Gates","Microsoft",80,"USA","Engineering",true,ref2));
		dto.add(new CompanyCEODTO("Sundar Pichai","Google",25,"INDIA","Engineering",true,ref3));
		
		dto.stream().collect(Collectors.toSet()).forEach(ele->System.out.println(ele));
		
		System.out.println(System.lineSeparator());
		dto.stream().map(ele->ele.getDto().getName()).collect(Collectors.toSet()).forEach(ele->System.out.println(ele));
		System.out.println(System.lineSeparator());
		dto.stream().filter(ele->ele.getAge()>30).collect(Collectors.toSet()).forEach(ele->System.out.println(ele));
		System.out.println(System.lineSeparator());
		dto.stream().forEach(ele->System.out.println("Father age:"+ele.getAge()+"Daughter age:"+ele.getDto().getAge()));
		
		
	}

}
