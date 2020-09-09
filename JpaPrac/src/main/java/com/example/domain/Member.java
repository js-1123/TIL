package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //JPA가 관리 하는 객체 설정
public class Member {

	@Id // SQL의 PK 설정
	private long id;
	private String name;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	
}
