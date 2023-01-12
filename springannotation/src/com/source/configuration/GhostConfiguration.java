package com.source.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.ghost.constant.Gender;

@Configuration
@ComponentScan("com.xworkz.ghost")
public class GhostConfiguration {
	
	public GhostConfiguration() {
		System.out.println("created ghostConfiguration default const by spring");
	}
	
	@Bean
	public int num() {
		System.out.println("registering num by spring..");
		return 3;
	}
	
	@Bean
	public String owner() {
		System.out.println("registering owner by spring");
		String refOfOwner = new String("VRL");
		return refOfOwner;
	}
	@Bean
	public String paperName() {
		System.out.println("registering paperName by spring");
		String refOfName = new String("PrajaVani");
		return refOfName;
	}
	@Bean
	public String language() {
		System.out.println("registering language by spring");
		String refOfLanguage = new String("kannada");
		return refOfLanguage;
	}
	@Bean
	public short getPrice() {
		System.out.println("registering price by spring");
		return 5;
	}
	@Bean
	public String engineName() {
		System.out.println("registering engineName by spring");
		String refOfEnginename = new String("RotaryEngine");
		return refOfEnginename;
	}
	@Bean
	public String engineType() {
		System.out.println("registering type by spring");
		String refOfType = new String("V6");
		return refOfType;
	}
	@Bean
	public long number() {
		System.out.println("registering number by spring");
		return 567;
	}
	@Bean
	public double version() {
		System.out.println("registering vrsion by spring");
		return 5.2;
	}
	@Bean
	public String engineCompany() {
		System.out.println("registering company by spring");
		String refOfCompany = new String("SLV");
		return refOfCompany;
	}
	@Bean
	public int strokes() {
		System.out.println("registerig strokes by spring");
		return 4;
	}
	@Bean
	public String snakeName() {
		System.out.println("registering snakeName by spring");
		String refOfSName = new String("anaconda");
		return refOfSName;
	}
	@Bean
	public byte length() {
		System.out.println("registering length by spring");
		return 32;
	}
	@Bean
	public String shade() {
		System.out.println("registering color by spring");
		return "green";
	}
	@Bean
	public String snakeType() {
		System.out.println("registering type by spring");
		return "forestType";
	}
	@Bean
	public boolean poisionous() {
		System.out.println("registering poisionous by spring");
		return true;
	}
	@Bean
	public String title() {
		System.out.println("registering title by spring");
		return "Shashank";
	}
	@Bean
	public Gender gender() {
		System.out.println("registering gender by spring");
		return Gender.male;
	}
	@Bean
	public int height() {
		System.out.println("registering height by spring");
		return 6;
	}
	@Bean
	public int hands() {
		System.out.println("registering hands by spring");
		return 2;
	}
	@Bean
	public int legs() {
		System.out.println("registering legs by spring");
		return 3;
	}
	@Bean
	public boolean beralu() {
		System.out.println("registering beralu by spring");
		return true;
	}
	@Bean
	public float nailLength() {
		System.out.println("registering nailLength by spring");
		return 4.5f;
	}
	@Bean
	public String from() {
		System.out.println("registering from by spring");
		return "hosaDurga";
	}
	@Bean
	public LocalDate localdate() {
		System.out.println("registering localdate by spring");
		return LocalDate.of(2023, 01, 24);
	}
	@Bean
	public int studiedTill() {
		System.out.println("registering studied by spring");
		return 16;
	}
	@Bean
	public String snehitaru() {
		System.out.println("registering snehitaru by spring");
		return "nayana";
	}
	@Bean
	public boolean ultaKaalu() {
		System.out.println("registering ultakaalu by spring");
		return false;
	}
	@Bean
	public char nameStartFrom() {
		System.out.println("registering startfrom by spring");
		return 's';
	}
	@Bean
	public String banna() {
		System.out.println("registering banna by spring");
		return "skin";
	}
	@Bean
	public boolean mane() {
		System.out.println("registering mane by spring");
		return true;
	}
	@Bean
	public String maneColor() {
		System.out.println("registerinng maneColor by spring");
		return "blue";
	}
	@Bean
	public boolean clean() {
		System.out.println("registering clean by spring");
		return false;
	}
	@Bean
	public boolean phone() {
		System.out.println("registering phone by spring");
		return true;
	}
	@Bean
	public String samaadhi() {
		System.out.println("registering samaadhi by spring");
		return "harishChandraGhatt";
	}
	@Bean
	public String howDead() {
		System.out.println("registering howDead by spring");
		return "heavyTeasing";
	}
	

}
