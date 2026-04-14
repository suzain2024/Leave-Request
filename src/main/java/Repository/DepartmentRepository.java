/**
 * 
 */
package Repository;

import Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 */
public interface DepartmentRepository extends JpaRepository<Department,Long> {
 Department findDepartmentById(String id);//with help of id
}
