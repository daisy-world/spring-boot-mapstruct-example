package com.app.easy2excel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.easy2excel.dto.AuthorDTO;
import com.app.easy2excel.entity.Author;
import com.app.easy2excel.service.AuthorService;

@RestController
public class AuthorController {
	@Autowired
	AuthorService authorService;

	@PostMapping("/author")
	public ResponseEntity<Author> saveAuthor(@RequestBody AuthorDTO authorDTO) {
		return ResponseEntity.ok(authorService.saveAuthor(authorDTO));
	}

	@GetMapping("/author/{id}")
	public ResponseEntity<AuthorDTO> getAuthorById(@PathVariable Long id) {
		return ResponseEntity.ok(authorService.getAuthorById(id));
	}

}
