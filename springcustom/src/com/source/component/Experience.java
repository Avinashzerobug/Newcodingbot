package com.source.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Experience {

	@Autowired
	Skill skill;
	
	
	public void experience()
	{
		System.out.println(skill.hashCode()+"Getting the value of Skill hash code");
	}
	
}
