package com.source.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String name;
	private String type;
	@Autowired
	private long number;
	@Autowired
	private double version;
	private String company;
	private int strokes;

	@Autowired
	public Engine(@Qualifier("engineName") String name, @Qualifier("engineType")String type,@Qualifier("engineCompany")
			String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}

	@Autowired
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public long getNumber() {
		return number;
	}

	public double getVersion() {
		return version;
	}

	public String getCompany() {
		return company;
	}

	public int getStrokes() {
		return strokes;
	}

}
