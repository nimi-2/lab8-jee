package bd.pai_dto.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {
    private Long id;
    private String name;
    private String surname;
    private int age;
    private String addressStreet;
    private String addressCity;
    private String addressState;
    private String addressZip;
}