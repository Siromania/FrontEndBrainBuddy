package backEnd.BrainBuddySpring.Repositories;

import org.springframework.data.repository.CrudRepository;

import backEnd.BrainBuddySpring.Entities.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> {
    
}
