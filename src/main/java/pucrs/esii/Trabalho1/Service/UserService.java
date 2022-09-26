package pucrs.esii.Trabalho1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import pucrs.esii.Trabalho1.Entity.User;


public interface UserService {
    User insertUser(User user);
    Optional<User> findUserByReg(Long registration);
    public ResponseEntity<List<User>> getUserByName(@RequestParam String name);
    List<User> getAllUsers();
    boolean findUserByEmail(String emailSenha);
}
