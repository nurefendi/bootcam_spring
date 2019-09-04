package com.squline.api.service.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.squline.api.domain.Students;
import com.squline.api.dto.StudentsDTO;

@Mapper
public interface StudentMapper {
	StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);
	StudentsDTO EntityToDto(Students student);
	
	List<StudentsDTO> listEntityToListDto(List<Students> list);
	
	
//	jre Hanya untuk menjalankan
//	jdk
	
//	Java Build Tool
//	ANT
//	Aif
//	Gradle
//	Maven
//	composeble
}
