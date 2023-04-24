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
@Table(name = "prices")
public class Price {
    @Id
    Long id;

    Double price;

    LocalDate startDate;

    LocalDate endDate;

    @OneToOne
    @JoinColumn(name = "id")
    Channel channel;


}
