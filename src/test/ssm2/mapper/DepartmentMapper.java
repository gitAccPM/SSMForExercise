package test.ssm2.mapper;

import java.util.List;

import test.ssm2.beans.Department;

public interface DepartmentMapper {
	List<Department> deptsList();
	Department getDepartment(int departmentId);
}
