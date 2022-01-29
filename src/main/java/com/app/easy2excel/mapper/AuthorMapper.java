package com.app.easy2excel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.app.easy2excel.dto.AuthorDTO;
import com.app.easy2excel.entity.Author;

/*Mapping Child Entities*/
@Mapper (componentModel = "spring",uses = {BooksMapper.class})
public interface AuthorMapper {

    @Mapping(source = "authorName", target = "name")
    @Mapping(source = "bookDtoList", target = "bookList")

	Author toEntity(AuthorDTO authorDTO);
	
    @Mapping(source = "name", target = "authorName")
    @Mapping(source = "bookList", target = "bookDtoList")

	AuthorDTO toDTO(Author author);

}
