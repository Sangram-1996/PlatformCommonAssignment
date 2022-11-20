package com.masai.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@ToString
public class AdminLoginDTO {

	@NotNull
	private String userName;
	@NotNull
	private String password;
	
}
