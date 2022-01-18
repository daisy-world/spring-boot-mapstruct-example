package com.app.easy2excel.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="address")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="address_1")
    private String address1;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="country")
    private String country;

    @Column(name="pin_code")
    private String pinCode;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cust_add_fk", nullable = false)
    private Customer customer;

}
