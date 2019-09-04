package com.squline.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.squline.api.domain.Students;
import com.squline.api.repository.studentRepository;

@Service
public class StudentService {
	
	@Autowired
	private studentRepository studentRepository;
	
//	@Modifying
	public void save(Students entity) {
		studentRepository.save(entity);
	}
	public List<Students> findAll() {
		return studentRepository.findAll();
	}
	
	public Page<Students> findAll(Pageable pageable){
		return studentRepository.findAll(pageable);
	}
	
	
}
