/**
 * 
 */
package Repository;

import Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 */
public interface DepartmentRepository extends JpaRepository<Department,String> {
 Department findByDepartmentId(String deptId);//with help of id
}
