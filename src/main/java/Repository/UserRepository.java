/**
 * 
 */
package Repository;

import Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 */
public interface UserRepository extends JpaRepository<User,String> {
  User findUserById(String id);//with help of id
  List<User>findRole(String role);//manager,hr,employee
  List<User>findApprover(String id);//manager or hr or admin

}
