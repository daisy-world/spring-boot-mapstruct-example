package com.app.easy2excel.entity;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name="books")
@Data
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "book_id")
	private Long bookId;

	@Column(name = "name")
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "author_id", foreignKey = @ForeignKey(name = "author_book_fk"))
	private Author author;

}
