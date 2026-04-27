package Service;

import Entity.LeaveRequest;
import Entity.User;
import Repository.LeaveRequestRepository;
import com.example.leave.request.enums.LeaveStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  java.util.List;
@Service
public class LeaveRequestService {
    @Autowired
    LeaveRequestRepository repo;
    public LeaveRequest applyLeave(Long id)
    {
       LeaveRequest leave=repo.findById(id).orElseThrow(()-> new RuntimeException("Request not found"+id));
       leave.setStatus(LeaveStatus.PENDING);
      return  repo.save(leave);
    }
    public LeaveRequest approveLeave(Long id)
    {
        LeaveRequest leave=repo.findById(id).orElseThrow(()->new RuntimeException("Request not found"+id));
        leave.setStatus(LeaveStatus.APPROVED);
       return repo.save(leave);
    }
    public LeaveRequest cancelRequest(Long id)
    {
        LeaveRequest leave=repo.findById(id).orElseThrow(()->new RuntimeException("Request not found"+id));
        leave.setStatus(LeaveStatus.CANCELLED);
        return repo.save(leave);
    }
    public List<LeaveRequest> leaveHistory(User user)
    {
        return repo.findByUser(user);
    }
}
