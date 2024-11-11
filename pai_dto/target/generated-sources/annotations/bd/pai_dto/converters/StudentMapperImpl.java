package bd.pai_dto.converters;

import bd.pai_dto.domain.Address;
import bd.pai_dto.domain.Student;
import bd.pai_dto.dto.StudentDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-03T10:33:46+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 23 (Oracle Corporation)"
)
@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentDto mapStudentToStudentDto(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentDto.StudentDtoBuilder studentDto = StudentDto.builder();

        studentDto.addressStreet( studentAddressStreet( student ) );
        studentDto.addressCity( studentAddressCity( student ) );
        studentDto.addressState( studentAddressState( student ) );
        studentDto.addressZip( studentAddressZip( student ) );
        studentDto.id( student.getId() );
        studentDto.name( student.getName() );
        studentDto.surname( student.getSurname() );
        studentDto.age( student.getAge() );

        return studentDto.build();
    }

    private String studentAddressStreet(Student student) {
        if ( student == null ) {
            return null;
        }
        Address address = student.getAddress();
        if ( address == null ) {
            return null;
        }
        String street = address.getStreet();
        if ( street == null ) {
            return null;
        }
        return street;
    }

    private String studentAddressCity(Student student) {
        if ( student == null ) {
            return null;
        }
        Address address = student.getAddress();
        if ( address == null ) {
            return null;
        }
        String city = address.getCity();
        if ( city == null ) {
            return null;
        }
        return city;
    }

    private String studentAddressState(Student student) {
        if ( student == null ) {
            return null;
        }
        Address address = student.getAddress();
        if ( address == null ) {
            return null;
        }
        String state = address.getState();
        if ( state == null ) {
            return null;
        }
        return state;
    }

    private String studentAddressZip(Student student) {
        if ( student == null ) {
            return null;
        }
        Address address = student.getAddress();
        if ( address == null ) {
            return null;
        }
        String zip = address.getZip();
        if ( zip == null ) {
            return null;
        }
        return zip;
    }
}
