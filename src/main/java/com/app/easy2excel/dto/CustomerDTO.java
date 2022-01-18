package com.app.easy2excel.dto;

import lombok.Data;

@Data
public class CustomerDTO {
    private Long id;
    private String name;
    private String url;
    private AddressDTO addressDTO;
}
