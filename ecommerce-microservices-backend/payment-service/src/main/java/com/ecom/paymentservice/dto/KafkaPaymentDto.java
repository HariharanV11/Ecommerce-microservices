package main.java.com.ecom.paymentservice.dto;

import main.java.com.ecom.paymentservice.entity.PaymentStatus;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
@Builder
public class KafkaPaymentDto {
    private Integer paymentId;
    private Boolean isPayed;
    private PaymentStatus paymentStatus;
    private Integer orderId;
    private Long userId;
}
