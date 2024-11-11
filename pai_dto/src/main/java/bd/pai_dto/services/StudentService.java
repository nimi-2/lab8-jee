package bd.pai_dto.services;

import bd.pai_dto.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();

    List<StudentDto> getAllStudentsNoAttachment();
}