package com.app.easy2excel.dto;

import java.util.List;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AuthorDTO {
	private Long authorId;
	private String authorName;
	private List<BooksDTO> bookDtoList;

}
