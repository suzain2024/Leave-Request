package Service;

import Entity.User;
import Repository.UserRepository;
import com.example.leave.request.enums.Role;
import com.example.leave.request.enums.UserStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
   private UserRepository repo;
    //create the Employee
    public User createUser(String id)
    {
      User user=repo.findById(id);
      user.setStatus(UserStatus.ACTIVE);
      user.setRole(Role.Employee);
        return repo.save(user);
    }
   //create manager
    public User createManager(Long id)
    {

        User user=repo.findById(id);
        user.setStatus(UserStatus.ACTIVE);
        user.setRole(Role.Manager);
        return  repo.save(user);
    }
    //get user by id;
    public User getUserById(Long id)
    {
        User user=repo.findById(id);
       return repo.find(user).orElseThrow(()-> new RuntimeException("user not found by"+id));

    }
    //get manager by id
    public User getManagerById(Long id)
    {
        User user=repo.findById(id);
        if(user.getRole()==Role.Manager)
            return user;
        throw new RuntimeException("User is not manager");
    }
    //delete the user
    public void removeUser(Long id)
    {
        User user=repo.findUserById(id).orElseThrow(() -> new RuntimeException("User not found"+id));
        user.setStatus(UserStatus.INACTIVE);
        repo.save(user);
    }
}
