package com.app.easy2excel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.easy2excel.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{

}
