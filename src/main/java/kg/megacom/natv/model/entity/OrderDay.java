package kg.megacom.natv.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "order_days")
public class OrderDay {
    @Id
    Long id;

    LocalDate day;

    @ManyToOne
    @JoinColumn(name = "id")
    OrderChannel orderChannel;

}
