package com.app.easy2excel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.easy2excel.dto.PaymentDTO;
import com.app.easy2excel.entity.Payment;
import com.app.easy2excel.exception.ResourceNotFoundException;
import com.app.easy2excel.mapper.PaymentMapper;
import com.app.easy2excel.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentRepository paymentRepository;
	@Autowired
	PaymentMapper paymentMapper;
	@Override
	public Payment makePayment(PaymentDTO paymentDTO) {
        return paymentRepository.save(paymentMapper.toEntity(paymentDTO));

	}

	@Override
	public PaymentDTO getPaymentById(Long id) {
		return paymentRepository.findById(id)
                .map(paymentMapper::toDTO)
                .orElseThrow(()->new ResourceNotFoundException("payment not found :" +id));

	}

}
