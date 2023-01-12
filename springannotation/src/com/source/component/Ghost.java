package com.source.component;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.ghost.constant.Gender;

@Component
public class Ghost {

	private String name;
	private Gender gender;
	private int height;
	private int hands;
	private int legs;
	private boolean fingers;
	private float nailLength;
	private String place;
	private LocalDate dateOfDeath;
	private int studiedTill;
	@Autowired
	@Qualifier("snehitaru")
	private String friends;
	@Autowired
	@Qualifier("ultaKaalu")
	private boolean reverseLeg;
	@Autowired
	private char nameStartFrom;
	@Autowired
	@Qualifier("banna")
	private String color;
	@Autowired
	@Qualifier("mane")
	private boolean house;
	@Autowired
	@Qualifier("maneColor")
	private String houseColor;
	@Autowired
	@Qualifier("clean")
	private boolean neatness;
	@Autowired
	@Qualifier("phone")
	private boolean mobile;
	@Autowired
	@Qualifier("samaadhi")
	private String graveyard;
	@Autowired
	@Qualifier("howDead")
	private String reason;

	@Autowired
	public Ghost(@Qualifier("title") String name, Gender gender, int height, int hands, int legs,@Qualifier("beralu") boolean fingers, float nailLength,
			@Qualifier("from") String place, LocalDate dateOfDeath, int studiedTill) {
		super();
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.hands = hands;
		this.legs = legs;
		this.fingers = fingers;
		this.nailLength = nailLength;
		this.place = place;
		this.dateOfDeath = dateOfDeath;
		this.studiedTill = studiedTill;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", gender=" + gender + ", height=" + height + ", hands=" + hands + ", legs="
				+ legs + ", fingers=" + fingers + ", nailLength=" + nailLength + ", place=" + place + ", dateOfDeath="
				+ dateOfDeath + ", studiedTill=" + studiedTill + ", friends=" + friends + ", reverseLeg=" + reverseLeg
				+ ", nameStartFrom=" + nameStartFrom + ", color=" + color + ", house=" + house + ", houseColor="
				+ houseColor + ", neatness=" + neatness + ", mobile=" + mobile + ", graveyard=" + graveyard
				+ ", howDead=" + reason + "]";
	}

}
