package pucrs.esii.Trabalho1.Service;

import java.util.List;
import java.util.Optional;

import pucrs.esii.Trabalho1.Entity.Student;


public interface StudentService {
    Student insertStudent(Student student);
    Optional<Student> findStudentByReg(Long registration);
    Student findStudentByName(String name);
    List<Student> getAllStudents();
}
