package bd.pai_dto.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private int age;

    @JoinColumn(name = "address_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @Lob
    @Basic(fetch = FetchType.LAZY) // Opóźnione pobieranie dużego pola
    private byte[] attachment;
}
