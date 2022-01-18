package com.app.easy2excel.mapper;

import com.app.easy2excel.dto.EmployeeDTO;
import com.app.easy2excel.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.time.LocalDate;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mapping(source = "dateOfJoining", target = "doj",qualifiedByName = "stringToLocalDate")
    Employee toEntity(EmployeeDTO employeeDTO);

    @Mapping(source = "doj", target = "dateOfJoining",qualifiedByName = "localDateToString")
    EmployeeDTO toDTO(Employee employee);

    @Named("stringToLocalDate")
    static LocalDate stringToLocalDate(String date) {
        if (date == null) {
            return null;
        }
        return LocalDate.parse(date);
    }
    @Named("localDateToString")
    static String localDateToString(LocalDate date) {
        if (date == null) {
            return null;
        }
        return date.toString();
    }
}
