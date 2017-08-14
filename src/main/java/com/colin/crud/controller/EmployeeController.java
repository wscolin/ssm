package com.colin.crud.controller;

import com.colin.crud.bean.Employee;
import com.colin.crud.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by colin on 2017/8/14.
 */
@Controller

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/emps")
    public String  getEmps(@RequestParam(value = "pn",defaultValue = "1") Integer pn,Model model){
        PageHelper.startPage(1,5);
        List<Employee> employees = employeeService.getAll();
        PageInfo pageInfo =  new PageInfo(employees);
        model.addAttribute("pageInfo",pageInfo);
        return "list";
    }
}
