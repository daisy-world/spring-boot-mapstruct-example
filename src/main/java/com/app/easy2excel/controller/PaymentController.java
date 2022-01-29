package com.app.easy2excel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.easy2excel.dto.PaymentDTO;
import com.app.easy2excel.entity.Payment;
import com.app.easy2excel.service.PaymentService;


@RestController
public class PaymentController {
	@Autowired
	PaymentService paymentService;

	    @PostMapping("/makePayment")
	    public ResponseEntity<Payment> makePayment(@RequestBody PaymentDTO paymentDTO){
	        return ResponseEntity.ok(paymentService.makePayment(paymentDTO));
	    }
	    @GetMapping("/getPayment/{id}")
	    public ResponseEntity<PaymentDTO> getPaymentById(@PathVariable Long id){
	        return ResponseEntity.ok(paymentService.getPaymentById(id));
	    }

}
