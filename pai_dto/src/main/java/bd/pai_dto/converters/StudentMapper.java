package bd.pai_dto.converters;

import bd.pai_dto.domain.Student;
import bd.pai_dto.dto.StudentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring") // This is necessary to make MapStruct create a Spring bean
public interface StudentMapper {

 @Mapping(target = "addressStreet", source = "address.street")
 @Mapping(target = "addressCity", source = "address.city")
 @Mapping(target = "addressState", source = "address.state")
 @Mapping(target = "addressZip", source = "address.zip")
 StudentDto mapStudentToStudentDto(Student student);
}
