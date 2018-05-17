package test.ssm2.mapper;

import java.util.List;

import test.ssm2.beans.Employee;

public interface EmployeeMapper {
	List<Employee> empsList();
	Employee getEmployee(int id);
	void addEmployee(Employee employee);
	void delEmployee(int id);
	void UpdEmployee(Employee employee);
}
