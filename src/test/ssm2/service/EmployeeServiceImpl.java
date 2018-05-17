package test.ssm2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.ssm2.beans.Employee;
import test.ssm2.mapper.EmployeeMapper;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeMapper employeeMapper;
	@Override
	public List<Employee> showAllEmps() {
		return employeeMapper.empsList();
	}

	@Override
	public Employee getEmpById(int id) {
		return employeeMapper.getEmployee(id);
	}

	@Override
	public void addEmp(Employee employee) {
		employeeMapper.addEmployee(employee);
	}

	@Override
	public void delEmpById(int id) {
		employeeMapper.delEmployee(id);
	}

	@Override
	public void updateEmp(Employee employee) {
		employeeMapper.UpdEmployee(employee);
	}

}
