package com.app.easy2excel.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Named;
import org.mapstruct.ValueMapping;

import com.app.easy2excel.dto.PaymentDTO;
import com.app.easy2excel.entity.Payment;
import com.app.easy2excel.entity.PaymentDetails;
import com.app.easy2excel.entity.PaymentMode;

/*Mapping Enums*/
@Mapper(componentModel = "spring")
public interface PaymentMapper {
	
	 //@ValueMapping(source = "VISA_CARD", target = "CARD")
    // @ValueMapping(source = "MASTER_CARD", target = "CARD")
    // @ValueMapping(source = "CREDIT_CARD", target = "CARD")
	 @ValueMapping(source = MappingConstants.ANY_REMAINING, target = "CARD")
	PaymentDetails toPaymentDetails(PaymentMode paymentMode);
	
	 
	 @Mapping(source = "paymentMode", target ="paymentDetails" )
	 Payment  toEntity(PaymentDTO paymentDTO);	
	 
	// @Mapping(source = "paymentDetails", target ="paymentMode")
	 PaymentDTO toDTO(Payment payment);


	
}
