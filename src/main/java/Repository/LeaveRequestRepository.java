/**
 * 
 */
package Repository;

import Entity.LeaveRequest;
import Entity.User;
import com.example.leave.request.enums.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * 
 */
public interface LeaveRequestRepository extends JpaRepository<LeaveRequest,Long> {
   List<LeaveRequest> findByUser(User user);//by user

   List<LeaveRequest> findByStatus(UserStatus status);//pending ,approved,reject,cancel

   List<LeaveRequest> findByUserAndStartLessThanEqualAndEndGreaterThanEqual(User user, LocalDate end, LocalDate start);

}