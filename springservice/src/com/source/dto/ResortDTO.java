package com.source.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResortDTO {

	@NotNull
	@NotBlank
	@Size(min = 3,max = 23,message = "Name must >3 and <23 check the name again")
	private String name;
	@NotNull
	@NotBlank
	@Size(min = 3,max = 23,message = "location must >3 and <23 check the name again")
	private String location;
	  @Min(value = 0,message = "noOfWoundPeople must be greater than zer0")
	    @Max(250000)
	private int noOfRooms;
	
	
}
