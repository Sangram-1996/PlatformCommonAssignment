package com.masai.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.masai.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studentId;

	@NotNull
	private String name;
	
	@NotNull
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dateOfBirth;
	
	@NotNull
	private Gender gender;
	
	@NotNull
	private String parentsName;
	
	@Email(message = "kindly pass a valid email")
	@NotNull
	private String email;
	
	@NotNull
	@Pattern(regexp="[0-9]{10}", message = "Mobile number must have 10 digits")
	private String mobileNumber;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> addresses= new ArrayList<Address>();
	
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Course> courses= new ArrayList<Course>();
	
	
	

}
