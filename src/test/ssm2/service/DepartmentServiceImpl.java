package test.ssm2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.ssm2.beans.Department;
import test.ssm2.mapper.DepartmentMapper;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentMapper departmentMapper;
	@Override
	public List<Department> showAllDept() {
		return departmentMapper.deptsList();
	}

	@Override
	public Department getDeptById(int departmentId) {
		return departmentMapper.getDepartment(departmentId);
	}

}
