package pucrs.esii.Trabalho1.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "V1__discipline")
public class Discipline {

    @Id
    @Column(name = "cod", unique = true, nullable = false)
    private String cod;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "grade", nullable = false)
    private Character grade;

    @Column(name = "class", nullable = false)
    private int classDisc;

    // @ManyToMany(mappedBy = "disciplines")
    // private List<Student> students;

    public Discipline(){

    }

    public Discipline(String cod, String name, Character grade, int classDisc) {
        this.cod = cod;
        this.name = name;
        this.grade = grade;
        this.classDisc = classDisc;
    }

    public String getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public Character getGrade() {
        return grade;
    }

    public int getClassDisc() {
        return classDisc;
    }

    // public List<Student> getStudents() {
    //     return students;
    // }
    
    

}
