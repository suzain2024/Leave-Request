package Service;

import Entity.Department;
import Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
@Autowired
    DepartmentRepository repo;
    public Department createDepartment(Department department) {
        return repo.save(department);
    }

    // get department by id
    public Department getDepartmentById(String id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found: " + id));
    }
}
