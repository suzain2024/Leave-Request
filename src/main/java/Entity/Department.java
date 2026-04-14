/**
 * 
 */
package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * 
 */
@Entity
@Data
public class Department {
    private String dept_name;
    @Id
    private String dept_id;
}
