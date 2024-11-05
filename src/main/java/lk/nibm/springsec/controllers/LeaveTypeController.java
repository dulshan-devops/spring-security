package lk.nibm.springsec.controllers;

import jakarta.servlet.http.HttpServletRequest;
import lk.nibm.springsec.entities.LeaveTypes;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LeaveTypeController {

    private List<LeaveTypes> leaveTypes = new ArrayList<>(List.of(
            new LeaveTypes(1,"Annual Leave","Annual Leave Type",10,false,true,25,true),
            new LeaveTypes(2,"Sick Leave","Sick Leave Type",15,false,true,25,true),
            new LeaveTypes(3,"Maternity Leave","Maternity Leave Type",20,false,true,25,true)
    ));

    @GetMapping("/leave-types")
    public List<LeaveTypes> getLeaveTypes()
    {
        return leaveTypes;
    }

    @PostMapping("/leave-types")
    public List<LeaveTypes> addLeaveType(LeaveTypes type)
    {
        leaveTypes.add(type);
        return leaveTypes;
    }
}
