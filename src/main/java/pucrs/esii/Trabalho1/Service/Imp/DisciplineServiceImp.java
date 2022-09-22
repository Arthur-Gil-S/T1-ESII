package pucrs.esii.Trabalho1.Service.Imp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import pucrs.esii.Trabalho1.Entity.Discipline;
import pucrs.esii.Trabalho1.Entity.Student;
import pucrs.esii.Trabalho1.Repository.DisciplineRepository;
import pucrs.esii.Trabalho1.Repository.StudentRepository;
import pucrs.esii.Trabalho1.Service.DisciplineService;

@Service
public class DisciplineServiceImp implements DisciplineService{

    private final DisciplineRepository disciplineRepository;
    private final StudentRepository studentRepository;

    public DisciplineServiceImp(DisciplineRepository disciplineRepository, StudentRepository studentRepository) {
        this.disciplineRepository = disciplineRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public Discipline disciplineRegister(Discipline disc) {
        return disciplineRepository.save(disc);
    }

    @Override
    public boolean studentRegister(Long reg, String cod, Character grade) { 
        Student s = studentRepository.findById(reg).get();
        List<Discipline> ld = disciplineRepository.findAll();
        for(Discipline dis : ld) {
            if(dis.getCod() == cod && dis.getGrade() == grade){
                disciplineRepository.save(s);
            }
        }
        return false;
    }

    @Override
    public List<Student> consultStudents(String cod, String grade) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Discipline> allDisciplines() {
        return disciplineRepository.findAll();
    }
    
}
