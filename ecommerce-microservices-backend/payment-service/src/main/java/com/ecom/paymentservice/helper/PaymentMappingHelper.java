package main.java.com.ecom.paymentservice.helper;

import main.java.com.ecom.paymentservice.dto.OrderDto;
import main.java.com.ecom.paymentservice.dto.PaymentDto;
import main.java.com.ecom.paymentservice.dto.UserDto;
import main.java.com.ecom.paymentservice.entity.Payment;

public interface PaymentMappingHelper {
    static PaymentDto map(final Payment payment) {
        return PaymentDto.builder()
                .paymentId(payment.getPaymentId())
                .isPayed(payment.getIsPayed())
                .paymentStatus(payment.getPaymentStatus())
                .orderId(payment.getOrderId())
                .userId(payment.getUserId())
                .orderDto(
                        OrderDto.builder()
                                .orderId(payment.getOrderId())
                                .build())
                .userDto(UserDto.builder()
                        .id(payment.getUserId())
                        .build())
                .build();
    }

    static Payment map(final PaymentDto paymentDto) {
        return Payment.builder()
                .paymentId(paymentDto.getPaymentId())
                .orderId(paymentDto.getOrderId())
                .userId(paymentDto.getUserId())
                .isPayed(paymentDto.getIsPayed())
                .paymentStatus(paymentDto.getPaymentStatus())
                .build();
    }
}
