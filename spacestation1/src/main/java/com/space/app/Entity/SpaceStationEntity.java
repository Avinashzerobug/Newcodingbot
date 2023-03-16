package com.space.app.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name = "space_table")
@NamedQuery(name = "findByCountries", query = "select entity from SpaceStationEntity entity where entity.countries=:count")
@NamedQuery(name = "allData", query = "select entity from SpaceStationEntity entity")
@NamedQuery(name = "findByName", query = "select entity from SpaceStationEntity entity where entity.name=:nam")
@NamedQuery(name="findByNameAndCountry",query = "select entity from SpaceStationEntity entity where entity.name=:nam And entity.countries=:count")

public class SpaceStationEntity {

	@Id
	@Column(name = "s_id")
	private int id; 
	@Column(name = "s_name")
	private String name;
	@Column(name = "s_countries")
	private String countries;
	@Column(name = "s_noOfStation")
	private int      noOfStation;
	@Column(name = "s_astranautName")
	private String astranuatNames;
	@Column(name = "s_cost")
	private Double cost;

	
}
