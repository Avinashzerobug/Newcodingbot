package com.source.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CMDTO {

	@NotNull(message = "cm name canntot be null or blank")
	@Size (min = 3,max = 20,message = "CM name should be above 3 and below 20 characters")
	private String name;
	@NotBlank(message = "Party cannot be null")
	private String party;
	@NotBlank(message = "State cannot be null")
	private String state;
	@NotNull(message = "tenure canntot be null or blank")
	@Min(value = 1,message = "Tenure cannot be less than ZERO")
	private Integer tenure;
	@NotBlank(message = "portFolio cannot be null")
	private String  portFolio;
	
	@Override
	public String toString() {
		return "CMDTO [name=" + name + ", party=" + party + ", state=" + state + ", tenure=" + tenure + ", portFolio="
				+ portFolio + "]";
	}
	
	
	
	
	
	
	
	
}
