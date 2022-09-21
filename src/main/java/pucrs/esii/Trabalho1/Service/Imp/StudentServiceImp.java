package pucrs.esii.Trabalho1.Service.Imp;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import pucrs.esii.Trabalho1.Entity.Student;
import pucrs.esii.Trabalho1.Repository.StudentRepository;
import pucrs.esii.Trabalho1.Service.StudentService;

@Service
public class StudentServiceImp implements StudentService{

    private final StudentRepository studentRepository;

    
    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student insertStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> findStudentByReg(Long registration) {
        return studentRepository.findById(registration);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public ResponseEntity<List<Student>> getStudentByName(@PathVariable("name") String name){
        return new ResponseEntity<List<Student>>(studentRepository.findByName(name), HttpStatus.OK);
    }
    
}
