package bd.pai_dto.controllers;


import bd.pai_dto.domain.Student;
import bd.pai_dto.dto.StudentDto;
import bd.pai_dto.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping(value = "/students")
@RestController
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<StudentDto> getAllStudents() {
        return studentService.getAllStudents();
    }
}