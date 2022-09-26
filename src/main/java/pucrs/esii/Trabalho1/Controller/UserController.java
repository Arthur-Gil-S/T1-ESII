package pucrs.esii.Trabalho1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pucrs.esii.Trabalho1.Entity.User;
import pucrs.esii.Trabalho1.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController extends Logp{

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> findAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{registration}")
    public Optional<User> findUserByReg(@PathVariable("registration") Long registration){
        if(logged== false){
            return null;
        }
        return userService.findUserByReg(registration);
    }


    @GetMapping("/login")
    public boolean login(@RequestBody String emailSenha){
        if(userService.findUserByEmail(emailSenha)){
            logged = true;
        } else {
            logged = false;
        }
        return logged;
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        if(logged == false){
            return null;
        }
        return userService.insertUser(user);
    }
}
