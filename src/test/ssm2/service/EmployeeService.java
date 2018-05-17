package test.ssm2.service;

import java.util.List;

import test.ssm2.beans.Employee;

public interface EmployeeService {
	List<Employee> showAllEmps();
	Employee getEmpById(int id);
	void addEmp(Employee employee);
	void delEmpById(int id);
	void updateEmp(Employee employee);
}
