package pucrs.esii.Trabalho1.Controller;

import java.util.List;
import java.util.Optional;

import javax.jws.soap.SOAPBinding.Use;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pucrs.esii.Trabalho1.Entity.Student;
import pucrs.esii.Trabalho1.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController extends Logp{
    
    private final StudentService studentService;    

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> findAllStudents(){
        if(logged == false){
            return null;
        }
        return studentService.getAllStudents();
    }

    @GetMapping("/{registration}")
    public Optional<Student> findStudentByReg(@PathVariable("registration") Long registration){
        if(logged == false){
            return null;
        }
        return studentService.findStudentByReg(registration);
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        if(logged == false){
            return null;
        }
        return studentService.insertStudent(student);
    }
}
