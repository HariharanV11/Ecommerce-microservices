package main.java.com.ecom.notificationservice.service;

import main.java.com.ecom.notificationservice.dto.PaymentDto;
import main.java.com.ecom.notificationservice.entity.Payment;
import reactor.core.publisher.Mono;

import java.util.List;

public interface PaymentService {
    Mono<Payment> savePayment(PaymentDto paymentDto);
    Mono<Payment> getPayment(Integer paymentId);
    Mono<List<Payment>> getAllPayments();
    Mono<Void> deletePayment(Integer paymentId);
}
