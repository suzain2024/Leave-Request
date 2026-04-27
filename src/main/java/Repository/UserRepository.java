/**
 * 
 */
package Repository;

import Entity.User;
import com.example.leave.request.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 
 */
public interface UserRepository extends JpaRepository<User,Long> {

  List<User>findRole(Role role);//manager,hr,employee
  List<User> findApprover(Long managerId);//manager or hr or admin

}
