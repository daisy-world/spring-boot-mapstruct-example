package com.app.easy2excel.dto;

import com.app.easy2excel.entity.PaymentMode;

import lombok.Data;

@Data
public class PaymentDTO {
	
	private Long id;
	private PaymentMode paymentMode;
	private float amount;

}
