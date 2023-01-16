package com.source.interfacing.dto;

import org.springframework.stereotype.Component;

import com.source.interfacing.Browser;

@Component
public class Chrome implements Browser {

	@Override
	public void browse() {
		System.out.println("Creating  the browser method from Browser INterface");
		
	}

}
