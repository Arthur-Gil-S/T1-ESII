package pucrs.esii.Trabalho1.Repository;
import pucrs.esii.Trabalho1.Entity.Student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    List<Student> findByName(String name);
}
