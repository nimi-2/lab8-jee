package bd.pai_dto.services;

import bd.pai_dto.converters.StudentConverter;
import bd.pai_dto.converters.StudentMapper;
import bd.pai_dto.dto.StudentDto;
import bd.pai_dto.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final StudentConverter studentConverter; // Consider if you still need this if only using studentMapper
    private final StudentMapper studentMapper; // Ensure this is properly configured as a Mapper

    @Override
    public List<StudentDto> getAllStudentsNoAttachment() {
        // Fetch students without attachments from the repository
        return studentRepository.findAllNoAttachment();
    }

    @Override
    public List<StudentDto> getAllStudents() {
        // Use mapStudentToStudentDto to map each Student to StudentDto
        return studentRepository.findAll().stream()
                .map(studentMapper::mapStudentToStudentDto)
                .collect(Collectors.toList());
    }

}