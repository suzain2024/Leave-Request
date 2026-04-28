package com.example.leave.request.Controller;

import Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class Department {
    @Autowired
   private DepartmentService service;

    //create the department
    @PostMapping
    public Department createDepartment(@PathVariable Department department)
    {
       return service.createDepartment(department);
    }

    //get department
    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable String id)
    {
        return service.getDepartmentById(id);
    }
}
