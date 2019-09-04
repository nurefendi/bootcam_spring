package com.squline.api.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "student")

public class Students implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Integer studenId;
	
	@Column(name = "student_name")
	public String nama;
	
	@Column(name = "student_address")
	public String alamat;
	
	@Column(name = "ctd")
	public Date ctd;
	
	@Column(name = "mdd")
	public Date mdd;
	
	@Column(name = "ctb")
	public String ctb;
	 
	@Column(name = "mdb")
	public String mdb;
	
//	https://dzone.com/articles/using-mysql-jdbc-driver-with-spring-boot

}
