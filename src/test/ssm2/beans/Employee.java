package test.ssm2.beans;

public class Employee {
	private int id;
	private String name;
	private String gender;
	private String email;
	private String departmentId;
	private Department department;
	public Employee() {
	}
	public static void main(String[] args){
		System.out.println("123");
	}
	public Employee(int id, String name, String gender, String email, String departmentId) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.departmentId = departmentId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", department="
				+ department + "]";
	}
	
}
