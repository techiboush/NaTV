package kg.megacom.natv.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "orders")
public class Order {
    @Id
    Long id;

    String customerName;

    String phoneNumbers;

    String email;

    String orderText;

    Status status;

    Double totalPrice;
}
