package pucrs.esii.Trabalho1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import pucrs.esii.Trabalho1.Entity.Student;


public interface StudentService {
    Student insertStudent(Student student);
    Optional<Student> findStudentByReg(Long registration);
    public ResponseEntity<List<Student>> getStudentByName(@RequestParam String name);
    List<Student> getAllStudents();
}
