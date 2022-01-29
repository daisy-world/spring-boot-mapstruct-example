package com.app.easy2excel.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.app.easy2excel.dto.StudentDTO;
import com.app.easy2excel.entity.Student;

/*@BeforeMapping and @AfterMapping*/
@Mapper(componentModel = "spring")
public interface StudentMapper {


	
	
	Student toEntity(StudentDTO studentDTO);

	@BeforeMapping
	default void setEmail( Student student) {
		if (student.getEmail()==null || student.getEmail().isEmpty()) {
			student.setEmail("Not Available");
		}

	}
	
	StudentDTO toDTO(Student student);
	
	@AfterMapping
	default void toUpperCase(@MappingTarget StudentDTO studentDTO) {
		studentDTO.setName(studentDTO.getName().toUpperCase());
	}


}
