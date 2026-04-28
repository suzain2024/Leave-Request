package com.example.leave.request.Controller;

import Entity.LeaveRequest;
import Entity.User;
import Service.LeaveRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("leaverequest")
public class LeaveRequestController {
    @Autowired
    private LeaveRequestService service;

    //create leave request
    @PostMapping("/create")
    public LeaveRequest createRequest(@PathVariable Long id)
    {
        return  service.applyLeave(id);
    }

    //approve request
    @PutMapping("/approve")
    public LeaveRequest approveRequest(@PathVariable Long id)
    {
        return service.approveLeave(id);
    }

    //delete request
    @DeleteMapping("/delete")
    public  LeaveRequest deleteRequest(@PathVariable Long id)
    {
        return service.cancelRequest(id);
    }

    //get all request details
    @PostMapping("/history")
    public List<LeaveRequest> getRequest(@RequestBody User user)
    {
        return service.leaveHistory(user);
    }
}
