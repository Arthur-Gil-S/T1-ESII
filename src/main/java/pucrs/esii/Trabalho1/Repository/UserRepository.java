package pucrs.esii.Trabalho1.Repository;
import pucrs.esii.Trabalho1.Entity.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    List<User> findByName(String name);
}
