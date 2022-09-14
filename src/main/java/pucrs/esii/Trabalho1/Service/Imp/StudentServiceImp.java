package pucrs.esii.Trabalho1.Service.Imp;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

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
    public Student findStudentByName(String name) {

        // for (Student s : studentRepository) {
        //     if(s.getName() == name){
        //         return s;
        //     }
        // }
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    
}
