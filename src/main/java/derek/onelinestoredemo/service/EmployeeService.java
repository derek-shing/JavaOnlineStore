package derek.onelinestoredemo.service;

import java.util.List;

import derek.onelinestoredemo.entity.Employee;



public interface EmployeeService {
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);

}
