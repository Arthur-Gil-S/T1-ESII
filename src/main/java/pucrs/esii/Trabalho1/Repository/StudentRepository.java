package pucrs.esii.Trabalho1.Repository;
import pucrs.esii.Trabalho1.Entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
