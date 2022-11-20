package com.masai.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.masai.enums.AddressType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	
	@NotNull
	private String area;
	
	@NotNull
	private String state;
	
	@NotNull
	private String district;
	
	@NotNull
	@Pattern(regexp="[0-9]{6}", message = "pincode must have 6 digits")
	private String pincode;
	
	@NotNull
	private AddressType addresstype;
	
	

}
