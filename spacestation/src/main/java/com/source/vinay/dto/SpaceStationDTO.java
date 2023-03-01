package com.source.vinay.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SpaceStationDTO {

	@NotBlank
	@NotNull
	@Size(min = 3, max = 20, message = " name should be minimun 3 or maximum 20 character")
	private String name;
	@NotBlank
	@NotNull
	@Size(min = 3, max = 20, message = "country should be minimun 3 or maximum 20 character")
	private String countries;
	@NotNull(message = "station shoud not be null")
	private int noOfStation;
	@NotBlank
	@NotNull
	@Size(min = 3, max = 20, message = "Astranauts should be minimun 3 or maximum 20 character")
	private String astranuatNames;
	@NotNull(message = "Amount shoud not emoty please fill it")
	private Double cost;
	private int id;
}
