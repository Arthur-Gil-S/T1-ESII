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
public class UserController {
    
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
        return userService.findUserByReg(registration);
    }

    @GetMapping("/login")
    public User login(@RequestBody User user){
        
        return user;
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.insertUser(user);
    }

    // @GetMapping("/{name}")
    // public ResponseEntity<List<User>> getUserByName(@PathVariable("name") String name){
    //     return userService.getUserByName(name);
    // }

}
