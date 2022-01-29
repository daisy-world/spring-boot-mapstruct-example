package com.app.easy2excel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.easy2excel.dto.AuthorDTO;
import com.app.easy2excel.entity.Author;
import com.app.easy2excel.entity.Books;
import com.app.easy2excel.exception.ResourceNotFoundException;
import com.app.easy2excel.mapper.AuthorMapper;
import com.app.easy2excel.mapper.BooksMapper;
import com.app.easy2excel.repository.AuthorRepository;
import com.app.easy2excel.repository.BooksRepository;

@Service
public class AuthorServiceImpl implements AuthorService {
	@Autowired
	AuthorRepository authorRepository ;
	@Autowired
	BooksRepository booksRepository;
	@Autowired
	AuthorMapper authorMapper;
	@Autowired
	BooksMapper booksMapper;
	@Override
	public Author saveAuthor(AuthorDTO authorDTO) {

		Author author=	authorRepository.save(authorMapper.toEntity(authorDTO));
		/*
		 * System.out.println("author {} " +author );
		 * authorDTO.getBookDtoList().forEach(bookDto->{ Books book =
		 * booksMapper.toEntity(bookDto); System.out.println("book {} " +book );
		 * 
		 * book.setAuthor(author); System.out.println("book after {} " +book );
		 * 
		 * booksRepository.save(book); System.out.println("book saved" );
		 * 
		 * });
		 */
		return author;

	}

	@Override
	public AuthorDTO getAuthorById(Long id) {
		return authorRepository.findById(id).map(authorMapper::toDTO)
				.orElseThrow(() -> new ResourceNotFoundException("Author not found :" + id));
	}

}
