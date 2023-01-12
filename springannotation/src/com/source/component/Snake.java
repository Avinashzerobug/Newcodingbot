package com.source.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	
	private String name;
	@Autowired
	private byte length;
	@Autowired
	@Qualifier("shade")
	private String color;
	private String type;
	private boolean poisionous;

	@Autowired
	public Snake(@Qualifier("snakeName") String name,@Qualifier("snakeType") String type, boolean poisionous) {
		super();
		this.name = name;
		this.type = type;
		this.poisionous = poisionous;
	}


	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisionous="
				+ poisionous + "]";
	}
	
	

}
