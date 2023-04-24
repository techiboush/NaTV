package kg.megacom.natv.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.File;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "channels")
public class Channel {
    @Id
    Long id;

    String name;

    String logo;

    String IsActive;

    Long orderNum;
}
