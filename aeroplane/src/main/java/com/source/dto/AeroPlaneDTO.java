package com.source.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AeroPlaneDTO {

	@NotBlank
	@NotNull
	@Size(min = 3,max = 20, message="Company name should be minimun 3 or maximum 20 character")
	private String company;
	@NotBlank
	@NotNull
	@Size(min = 3,max = 20, message=" name should be minimun 3 or maximum 20 character")
	private String name;
	@NotNull(message = "Amount shoud not emoty please fill it")
	private Double cost;
	@NotBlank( message="type should be selected")
	private String type;
	@NotBlank( message="country should be selected")
	private String country;
	private int id;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
