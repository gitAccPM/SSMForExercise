package test.ssm2.handler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.ssm2.beans.Department;
import test.ssm2.beans.Employee;
import test.ssm2.service.DepartmentService;
import test.ssm2.service.EmployeeService;

@Controller
public class MajorHandler {
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private DepartmentService departmentService;
	@RequestMapping(value="/emps",method=RequestMethod.GET)
	public String ResponseEmps(Map<String,Object> map) {
		List<Employee> emps = employeeService.showAllEmps();
		map.put("emps", emps);
		return "list";
	}
	@RequestMapping(value="/emp",method=RequestMethod.GET)
	public String ResponseAddEmpGET(Map<String,Object> map) {
		map.put("employee", new Employee());
		
		Map<String,String> genders = new HashMap<>();
		genders.put("男", "男");
		genders.put("女", "女");
		map.put("genders", genders);
		
		List<Department> depts = departmentService.showAllDept();
		map.put("depts", depts);
		
		return "input";
	}
	@RequestMapping(value="/emp",method=RequestMethod.POST)
	public String ReponseAddEmpPOST(Employee employee) {
		employeeService.addEmp(employee);
		return "redirect:/emps";
	}
	@RequestMapping(value="/emp/{id}",method=RequestMethod.DELETE)
	public String ResponseDeleteEmp(@PathVariable("id")int id) {
		employeeService.delEmpById(id);
		return "redirect:/emps";
	}
	@RequestMapping(value="/emp/{id}",method=RequestMethod.GET)
	public String ResponseUpdateEmpGET(@PathVariable("id")int id,Map<String,Object> map) {
		Employee employee = employeeService.getEmpById(id);
		map.put("employee", employee);
		
		Map<String,String> genders = new HashMap<>();
		genders.put("男", "男");
		genders.put("女", "女");
		map.put("genders", genders);
		
		List<Department> depts = departmentService.showAllDept();
		map.put("depts", depts);
		return "input";
	}
	@RequestMapping(value="/emp",method=RequestMethod.PUT)
	public String ResponseUpdataEmpPUT(Employee employee) {
		employeeService.updateEmp(employee);
		return "redirect:/emps";
	}
}
