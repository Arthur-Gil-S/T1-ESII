package pucrs.esii.Trabalho1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pucrs.esii.Trabalho1.Entity.Discipline;

@Repository
public interface DisciplineRepository extends JpaRepository<Discipline, Long>{
    List<Discipline> findByName(String name);
}
