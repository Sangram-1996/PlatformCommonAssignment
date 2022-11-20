package com.masai.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer courseId;

	private String courseName;
	
	private String description;
	
	private String courseType;
	
	private Double duration;
	
	@ElementCollection
	private List<String> topics;
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "courses")
	private List<Student> students;
	
	
}
