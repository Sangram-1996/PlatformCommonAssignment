package com.masai.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdminSignupData {

		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer adminId;


		@NotNull
		@Size(min=5,max=12)
		private String userName;

		@NotNull
		@Pattern(regexp="[a-zA-Z0-9]{6,12}",message="Password must contain between 6 to 12 characters. Must be alphanumeric with both Upper and lowercase characters.")
		private String password;

		@NotNull
		@Pattern(regexp="[0-9]{10}", message = "Mobile number must have 10 digits")
		private String mobileNo;

		@Email
		@NotNull
		private String email;
		
		
	}



