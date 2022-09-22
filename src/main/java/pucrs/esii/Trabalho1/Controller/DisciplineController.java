package pucrs.esii.Trabalho1.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pucrs.esii.Trabalho1.Entity.Discipline;
import pucrs.esii.Trabalho1.Entity.Student;
import pucrs.esii.Trabalho1.Service.DisciplineService;

@RestController
@RequestMapping("/discipline")
public class DisciplineController {

    private final DisciplineService disciplineService;

    public DisciplineController(DisciplineService disciplineService) {
        this.disciplineService = disciplineService;
    }

    @PostMapping
    public Discipline addDiscipline(@RequestBody Discipline disc){
        return disciplineService.disciplineRegister(disc);
    }

    @GetMapping()
    public List<Discipline> findAllDisciplines(){
        return disciplineService.allDisciplines();
    }

    // nao funciona
    @PostMapping("/addStudent")
    public boolean addStudentIntoDisc(@RequestBody Long reg, String cod, Character grade){
        return disciplineService.studentRegister(reg, cod, grade);
    }
    
}
