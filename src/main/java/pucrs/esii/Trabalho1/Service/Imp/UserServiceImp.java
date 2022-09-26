package pucrs.esii.Trabalho1.Service.Imp;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import pucrs.esii.Trabalho1.Entity.User;
import pucrs.esii.Trabalho1.Repository.UserRepository;
import pucrs.esii.Trabalho1.Service.UserService;

@Service
public class UserServiceImp implements UserService{

    private final UserRepository userRepository;

    
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User insertUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> findUserByReg(Long registration) {
        return userRepository.findById(registration);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public ResponseEntity<List<User>> getUserByName(@PathVariable("name") String name){
        return new ResponseEntity<List<User>>(userRepository.findByName(name), HttpStatus.OK);
    }
    
}
