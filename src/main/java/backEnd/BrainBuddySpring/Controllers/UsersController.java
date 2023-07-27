package backEnd.BrainBuddySpring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
