package tech.hadil.Employee.Manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.hadil.Employee.Manager.exception.userNotFoundException;
import tech.hadil.Employee.Manager.model.employee;
import tech.hadil.Employee.Manager.repo.employeeRepo;

import java.util.List;
import java.util.UUID;

@Service
public class employeeService {
    private final employeeRepo employeeRepo;
    @Autowired
    public employeeService(employeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public employee addEmployee (employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        employee.setEmail(employee.getEmail());
        employee.setName(employee.getName());
        employee.setPhone(employee.getPhone());
        employee.setJobTitle(employee.getJobTitle());
        employee.setImageUrl(employee.getImageUrl());
        return this.employeeRepo.save(employee);
    }

    public List<employee> findAllEmployees(){
        return  this.employeeRepo.findAll();

    }

    public employee updataEmployee(employee employee){
        return this.employeeRepo.save(employee);

    }

    public void deleteEmployee(Long id){
        this.employeeRepo.deleteById(id);
    }

    public employee findEmployeeById(Long id){
        return this.employeeRepo.findEmployeeById(id).orElseThrow(() -> new userNotFoundException ("User with Id:"+id+"was not found"));
    }

}
