package main.java.com.ecom.notificationservice.repository;

import main.java.com.ecom.notificationservice.entity.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends MongoRepository<Payment, Integer> {

}
