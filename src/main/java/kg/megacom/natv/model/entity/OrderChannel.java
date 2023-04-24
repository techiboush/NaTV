package kg.megacom.natv.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "order_channels")
public class OrderChannel {
    @Id
    Long id;

    @OneToOne
    @JoinColumn(name = "id")
    Channel channel;

    @ManyToOne
    @JoinColumn(name = "id")
    Order order;

    Double price;


}
