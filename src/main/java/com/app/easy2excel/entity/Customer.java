package com.app.easy2excel.entity;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "customer")
@Data
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "url")
	private String url;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id", foreignKey = @ForeignKey(name = "cust_address_fk"))	
	private Address address;
}
