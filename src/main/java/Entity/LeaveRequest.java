/**
 * 
 */
package Entity;

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
    private String status;
    private String type;
    private  int day;
    @ManyToOne
    private User user;
}
