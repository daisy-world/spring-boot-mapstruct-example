package com.app.easy2excel.service;

import com.app.easy2excel.dto.AuthorDTO;
import com.app.easy2excel.entity.Author;

public interface AuthorService {

	 Author saveAuthor(AuthorDTO authorDTO);
	 AuthorDTO getAuthorById(Long id);
}
