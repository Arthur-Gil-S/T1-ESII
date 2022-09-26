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
import java.util.regex.*;

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

    @Override
    public boolean findUserByEmail(String emailSenha) {
        List<User> users = userRepository.findAll();
        String email = "";
        String pass = "";

        Pattern regexMail = Pattern.compile("(?<=\"email\": \")(.+)(?=\",)");
        Matcher matcherMail = regexMail.matcher(emailSenha);
    
        while (matcherMail.find()) {
            email = matcherMail.group(1);
        }
        Pattern regexPass = Pattern.compile("(?<=\"pass\": \")(.+)(?=\")");
        Matcher matcherPass = regexPass.matcher(emailSenha);
    
        while (matcherPass.find()) {
            pass = matcherPass.group(1);
        }


        System.out.println(email);
        String email1 = email;
        String pass1 = pass;
        
        for (User a : users) {
            String aMail = a.getEmail();
            String aPass = a.getPass();

            if(email1.equals(aMail) && pass1.equals(aPass)){
                return true;
            }
        }
        return false;
    }
    
}
