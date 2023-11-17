package tech.hadil.Employee.Manager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.hadil.Employee.Manager.model.employee;

import java.util.Optional;

public interface employeeRepo extends JpaRepository<employee,Long> {

    Optional<employee> findEmployeeById(Long id);
}
