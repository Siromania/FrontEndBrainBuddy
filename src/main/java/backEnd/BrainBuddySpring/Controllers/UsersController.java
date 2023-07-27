package backEnd.BrainBuddySpring.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import backEnd.BrainBuddySpring.Entities.Users;
import backEnd.BrainBuddySpring.Repositories.UsersRepository;

@RestController
public class UsersController {

    @Autowired
    private UsersRepository userRepo;

    @GetMapping("/users")
    public Iterable<Users> getUsers() {
        Iterable<Users> list = this.userRepo.findAll();
        return list;
    }

    @GetMapping("/users/{id}")
    public Users getUser(@PathVariable Integer id) {

        Optional<Users> optionalUser = this.userRepo.findById(id);
        if(!optionalUser.isPresent()) {
            return null;
        }

        Users userToReturn = optionalUser.get();
        return userToReturn;
    }

    @PostMapping("/users")
    public Users createUser(@RequestBody Users user) {
        return this.userRepo.save(user);
    }
}
