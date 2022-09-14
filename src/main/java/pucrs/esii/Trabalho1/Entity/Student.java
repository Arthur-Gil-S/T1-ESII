package pucrs.esii.Trabalho1.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "V1__student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "registration")
    private Long registration;

    @Column(name = "name")
    private String name;

    @Column(name = "doc")
    private String doc;

    @Column(name = "adress")
    private String adress;

    public Student(){
        
    }
    
    public Student(String name, String doc, Long registration, String adress) {
        this.name = name;
        this.doc = doc;
        this.registration = registration;
        this.adress = adress;
    }

    public String getName(){
        return name;
    }

    public String getDoc(){
        return doc;
    }

    public String getEndr(){
        return adress;
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

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    

}
