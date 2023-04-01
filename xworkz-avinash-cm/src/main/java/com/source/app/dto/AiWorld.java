package com.source.app.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class AiWorld {
	
	@NotBlank
    @NotNull
	@Size(min = 3, max = 20, message = " userId should be minimun 3 or maximum 20 character")
	private String userId;
	@NotBlank
	@NotNull
	private String email;
	@NotNull(message = " numbr or add standard mobile number")
	private long   num;
	@NotBlank
	 @NotNull
	@Size(min = 3, max = 20, message = " password should be minimun 3 or maximum 20 character")
	private String password;
	@NotBlank
	 @NotNull
	@Size(min = 3, max = 20, message = " confirmPassword should be minimun 3 or maximum 20 character")
	private String confirmPassword;
	@Id
	private int signUpId;
	
	

}
