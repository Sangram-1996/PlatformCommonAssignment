package com.masai.entity;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@Data
public class CurrentUserSession {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotNull
	private String userName;
	
	@NotNull
	private String uuid;
	
	@NotNull
	private LocalDateTime localDateTime;

	public CurrentUserSession(String userName, String uuid, LocalDateTime localDateTime) {
		super();
		this.userName = userName;
		this.uuid = uuid;
		this.localDateTime = localDateTime;
	}
	
	

}
