package main.java.com.ecom.notificationservice.dto;

import main.java.com.ecom.notificationservice.entity.PaymentStatus;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
@Builder
public class PaymentDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer paymentId;
    private Boolean isPayed;
    private PaymentStatus paymentStatus;

    private Integer orderId;
    private Long userId;

}
