package Service;

import Entity.User;
import Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
   private UserRepository repo;
    //create the Employee
    public createUser(User user)
    {

        return repo.save(user);
    }
   //create manager
    public createManager(String id)
    {

        User user=repo.findUserById(id);
        if("manager".equals(user.getRole()))
            return repo.save(user);
        return  null;
    }
    //get user by id;
    public getUserById(String id)
    {
       return repo.findById(id);

    }
    //get manager by id
    public getManagerById(String id)
    {
        User user=repo.findUserById(id);
        if("manager".equals(user.getRole()))
            return user;
        return null;
    }
}
