/**
 * 
 */
package Entity;

import com.example.leave.request.enums.LeaveStatus;
import com.example.leave.request.enums.LeaveType;
import com.example.leave.request.enums.UserStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;
import java.util.concurrent.atomic.LongAccumulator;

/**
 * 
 */
@Entity
@Data
public class LeaveRequest {
    private String reason;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate start;
    private LocalDate end;
    private LeaveStatus status;
    @Enumerated(EnumType.STRING)
    private LeaveType type;
    private  int day;
    @ManyToOne
    private User user;
}
