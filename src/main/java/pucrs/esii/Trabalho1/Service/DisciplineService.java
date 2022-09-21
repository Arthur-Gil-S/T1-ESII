package pucrs.esii.Trabalho1.Service;

import java.util.List;

import pucrs.esii.Trabalho1.Entity.Discipline;
import pucrs.esii.Trabalho1.Entity.Student;

public interface DisciplineService {
    Discipline disciplineRegister(Discipline disc);
    List<Discipline> allDisciplines();
    boolean studentRegister(Long reg, String cod, String grade);
    List<Student> consultStudents(String cod, String grade);
}
