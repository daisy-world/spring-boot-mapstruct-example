package com.app.easy2excel.service;

import com.app.easy2excel.dto.PaymentDTO;
import com.app.easy2excel.entity.Payment;

public interface PaymentService {

	Payment makePayment(PaymentDTO paymentDTO);

	PaymentDTO getPaymentById(Long id);

}
