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
public class SoldierDTO extends AbstractAuditDTO {

	@NotNull
	@NotBlank
	@Size(min = 3,max = 23,message = "Name must >3 and <23 check the name again")
	private String name;
	@NotNull
	@NotBlank
	@Size(min = 3,max = 23,message = " Country Name must >3 and <23 check the name again")
    private String country;
    private int noOfKilling;
    private String batalianName;
    @NotBlank
    @NotNull
    @Size(min = 1 ,max = 30)
    private String rank;
    @Min(value = 0,message = "ID must be greater than zer")
    @Max(250000)
    private int id;
	
}
