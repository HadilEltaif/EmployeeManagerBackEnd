package tech.hadil.Employee.Manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.hadil.Employee.Manager.model.employee;
import tech.hadil.Employee.Manager.service.employeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")

public class employeeController {
    private final employeeService employeeService;

    @Autowired
    public employeeController(employeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<employee>> getAllEmployees(){
        List<employee> employees = employeeService.findAllEmployees();
        return  new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<employee> getEmployeeById(@PathVariable("id") Long id){
        employee employee = employeeService.findEmployeeById(id);
        return  new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<employee> addEmployee(@RequestBody employee employee){
        employee newEmployee = employeeService.addEmployee(employee);
        return  new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<employee> updateEmployee(@RequestBody employee employee){
        employee updateEmployee = employeeService.updataEmployee(employee);
        return  new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
