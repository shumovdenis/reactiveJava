package service;

import entity.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import repository.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Flux<User> list() {
        return userRepository.findAll();
    }

    public Mono<User> addUser(User user){
        return userRepository.save(user);
    }
}
