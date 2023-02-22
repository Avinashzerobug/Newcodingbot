package com.source.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "aero_table")
public class AeroPlaneEntity {

	@Id
	@Column(name = "a_id")
	private int id;
	@Column(name = "a_company")
	private String company;
	@Column(name = "a_name")
	private String name;
	@Column(name = "a_cost")
	private Double cost;
	@Column(name = "a_type")
	private String type;
	@Column(name = "a_country")
	private String country;
	
	
	
}
