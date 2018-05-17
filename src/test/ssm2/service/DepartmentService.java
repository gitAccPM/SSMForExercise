package test.ssm2.service;

import java.util.List;

import test.ssm2.beans.Department;

public interface DepartmentService {
	List<Department> showAllDept();
	Department getDeptById(int departmentId);
}
