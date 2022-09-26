package pucrs.esii.Trabalho1.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "V1__user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "registration")
    private Long registration;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "pass")
    private String pass;

    // @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    // @JoinTable(name = "V1__student_discipline", 
    //         joinColumns = @JoinColumn(name = "student_reg", referencedColumnName = "registration"),
    //         inverseJoinColumns = @JoinColumn(name = "disc_cod", referencedColumnName = "cod"))
    // private List<Discipline> disciplines;

    public User(){
        
    }
    
    public User(String name, String email, Long registration, String pass) {
        this.name = name;
        this.email = email;
        this.registration = registration;
        this.pass = pass;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPass(){
        return pass;
    }

    public Long getRegistration(){
        return registration;
    }

    public void setRegistration(Long registration) {
        this.registration = registration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoc(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    // public List<Discipline> getDisciplines() {
    //     return disciplines;
    // }

    

}
