
package bd.pai_dto.converters;

import bd.pai_dto.domain.Student;
import bd.pai_dto.dto.StudentDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StudentConverter implements Converter<Student, StudentDto> {

    @Override
    public StudentDto convert(Student source) {
        return StudentDto.builder()
                .id(source.getId())
                .name(source.getName())
                .surname(source.getSurname())
                .age(source.getAge())
                .addressStreet(source.getAddress() != null ? source.getAddress().getStreet() : null)
                .addressCity(source.getAddress() != null ? source.getAddress().getCity() : null)
                .addressState(source.getAddress() != null ? source.getAddress().getState() : null)
                .addressZip(source.getAddress() != null ? source.getAddress().getZip() : null)
                .build();
    }
}
