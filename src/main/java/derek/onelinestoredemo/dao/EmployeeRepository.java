package derek.onelinestoredemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import derek.onelinestoredemo.entity.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
