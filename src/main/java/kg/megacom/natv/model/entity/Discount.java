package kg.megacom.natv.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "discounts")
public class Discount {
    @Id
    Long id;

    Integer percent;

    Double fromDaysCount;

    @OneToOne
    @JoinColumn(name = "id")
    Channel channel;

    LocalDate startDate;

    LocalDate endDate;

}
