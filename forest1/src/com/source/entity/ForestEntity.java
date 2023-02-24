package com.source.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "forest_table")
@NamedQuery(name = "findByName", query = "select entity from ForestEntity entity  where entity.name='Jakanari reserve forest'" )
@NamedQuery(name = "findByState", query = "select entity from ForestEntity entity  where entity.state='evergreen Sal forests'" )
@NamedQuery(name="findByNameAndStateAndArea",query= "select entity from  ForestEntity entity where entity.name='Bandipur National Park'and entity.state =' dry deciduous forests'and entity.area='874'")
@NamedQuery(name="findAreaByName",query= "select entity.area from  ForestEntity entity where entity.name='Kanha National Park'")
@NamedQuery(name="findIdByNameAndState",query= "select entity from  ForestEntity entity where entity.id='8'and entity.state ='Uttar Pradesh'and entity.name='plantation forest'")
@NamedQuery(name="findNameById",query= "select entity.name from  ForestEntity entity where entity.id='7'")
@NamedQuery(name="findStateByNameAndArea",query= "select entity.state from  ForestEntity entity where entity.name='Kanha National Park'and entity.area='651'")
@NamedQuery(name="findCount",query= "select count (entity) from  ForestEntity entity ")
@NamedQuery(name="findMax",query= "select max(entity.area) from  ForestEntity entity")
public class ForestEntity {
	
	@Id
	@Column(name = "f_id")
	private int id;
	@Column(name = "f_name")
	private String name;
	@Column(name = "f_state")
	private String state;
	@Column(name = "f_area")
	private int area;
	@Column(name = "f_type")
	private String  type;
	
	public ForestEntity(int id, String name, String state, int area, String type) {
		super();
		this.name = name;
		this.id = id;
		this.type = type;
		this.area = area;
		this.state = state;
	}

	public ForestEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	
	
	
	
	
	

}
