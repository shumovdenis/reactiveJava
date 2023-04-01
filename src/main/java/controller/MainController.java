package controller;

import entity.User;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import service.UserService;

@RestController
@RequestMapping("/main")
public class MainController {
    private UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public Flux<User> list(){
        return userService.list();
    }

    @PostMapping
    public Mono<User> addUser(@RequestBody User user){
        return userService.addUser(user);
    }

}
