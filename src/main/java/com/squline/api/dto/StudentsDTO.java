package com.squline.api.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class StudentsDTO implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	private Integer studenId;
	public String nama;
	public String alamat;

	
}
