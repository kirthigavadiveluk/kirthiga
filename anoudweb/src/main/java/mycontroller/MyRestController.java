package mycontroller;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@XmlRootElement
class Employee{
	private int empid;
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
}
@Repository
class EmployeeRepo{
	public Employee retrieve(int eid) {
		Employee emp=new Employee();
		emp.setEmpid(eid);
		emp.setEmpname("kkk");
		return emp;
	}
	
	public List<Employee> getAll(){
		Employee emp=new Employee();
		emp.setEmpid(100);
		emp.setEmpname("rrr");
		
		Employee emp2=new Employee();
		emp2.setEmpid(200);
		emp2.setEmpname("zzz");
		
		List<Employee> list=new ArrayList<>();
		list.add(emp2);
		list.add(emp);
		
		return list;
	}
	public void store(Employee e) {
		System.out.println("employee stored...");
	}
	public Employee search(String name) {
		Employee emp=new Employee();
		emp.setEmpid(100);
		emp.setEmpname("kkk");
		return emp;
	}
	public Employee delete(int eid) {
		System.out.println("deleted...");
		return new Employee();
	}
}
@RestController
public class MyRestController {
	@Autowired
	EmployeeRepo repositary;
	@GetMapping("/rest/employee/get/{id}")
	public Employee getEmployeeByID(@PathVariable("id") int id) {
		return repositary.retrieve(id);
	}
	
	@GetMapping("/rest/employee/getAll")
	//Returning is List is supported with JSON response only
	//If you want XML, then add a wrapper class as Root XML element, for example EmployeeList
	public List<Employee> getAllEmployees() {
		return repositary.getAll();
	}
	@PostMapping("/rest/employee/create")
	public Employee createEmployee(@RequestBody Employee emp) {
		repositary.store(emp);
		return emp;
	}
	
	@GetMapping("/rest/employee/search/{name}")
	public Employee getEmployeeByName(@PathVariable("name") String name) {
		return repositary.search(name);
	}
	
	@DeleteMapping("/rest/employee/delete/{id}")
	public Employee deleteEmployeeByID(@PathVariable("id") int id) {
		return repositary.delete(id);
	}
}
