package com.squline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.squline.api.dto.StudentsDTO;
import com.squline.api.service.StudentService;
import com.squline.api.service.mapper.StudentMapper;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/studentHome")
	public String getStudentHome() {
		return "Student Home";
	}
	
	@GetMapping("/getAllStudent")
	public ResponseEntity<List<StudentsDTO>> getAllStudent(){
		return new ResponseEntity<>(StudentMapper.INSTANCE.listEntityToListDto(studentService.findAll()), HttpStatus.OK);
	}
}
