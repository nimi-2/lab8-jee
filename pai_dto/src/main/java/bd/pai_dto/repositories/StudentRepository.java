package bd.pai_dto.repositories;

import bd.pai_dto.domain.Student;
import bd.pai_dto.dto.StudentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("select new bd.pai_dto.dto.StudentDto(s.id, s.name, s.surname, s.age, " +
            "s.address.street, s.address.city, s.address.state, s.address.zip) " +
            "from Student s")
    List<StudentDto> findAllNoAttachment();
}