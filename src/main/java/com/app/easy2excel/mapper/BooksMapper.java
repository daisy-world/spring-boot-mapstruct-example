package com.app.easy2excel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.app.easy2excel.dto.BooksDTO;
import com.app.easy2excel.entity.Books;

@Mapper (componentModel = "spring")
public interface BooksMapper {

    @Mapping(source = "bookName", target = "name")
	Books toEntity(BooksDTO booksDTO);
    
    @Mapping(source = "name", target = "bookName")
	BooksDTO toDTO(Books books);
}
