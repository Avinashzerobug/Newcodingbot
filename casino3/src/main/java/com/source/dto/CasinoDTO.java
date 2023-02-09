
package com.source.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name = "casino_rich")
public class CasinoDTO {

	@Column (name = "c_id")
	@Id
	private int id;
	@Column (name = "c_name")
	private String name;
	@Column (name = "c_crusie")
	private String crusie;
	@Column (name = "c_entryFee")
	private Double entryFee;
	@Column (name = "c_freeFood")
	private boolean freeFood;
	
	
	public CasinoDTO() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Created Casino Using no arg const");
	}


	
	
	
}