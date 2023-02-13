package com.source.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "egg_table")
@Data
public class EggDTO {

	@Id
	@Column(name="e_id")
	private int id;
	@Column(name="e_hotelName")
	private String hotelName;
	@Column(name="e_dishName")
	private String dishName;
	@Column(name="e_type")
	private String type;
	@Column(name="e_price")
	private Double price; 
	@Column(name="e_quantity")
	private Integer quantity;
	@Column(name="e_takeAway")
	private boolean takeAway;
	
   public EggDTO ()
   {
	   System.out.println("Creating the DTO EGG");
	   System.out.println(this.getClass().getSimpleName());
   }

@Override
public String toString() {
	return "EggDTO [id=" + id + ", hotelName=" + hotelName + ", dishName=" + dishName + ", type=" + type + ", price="
			+ price + ", quantity=" + quantity + ", takeAway=" + takeAway + "]";
}
	
	
	
}
