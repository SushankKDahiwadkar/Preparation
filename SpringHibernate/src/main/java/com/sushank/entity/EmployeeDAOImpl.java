package com.sushank.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sushank.util.HibernateUtil;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	HibernateUtil hibernateUtil;

	public EmployeeDAOImpl() {
		System.out.println("EmployeeDAOImpl constructor");
	}

	@Override
	public long createEmployee(Employee employee) {
		return (long) hibernateUtil.create(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return hibernateUtil.update(employee);
	}

	@Override
	public void deleteEmployee(long id) {
		Employee employee = new Employee();
		employee.setId(id);
		hibernateUtil.delete(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		    
		return hibernateUtil.fetchAll(Employee.class);
	}

	@Override
	public Employee getEmployee(long id) {
		return hibernateUtil.fetchById(id, Employee.class);
	}

	@Override
	public List<Employee> getAllEmployees(String employeeName) {
		String query = "SELECT e.* FROM Employees e WHERE e.name like '%" + employeeName + "%'";
		List<Object[]> employeeObjects = hibernateUtil.fetchAll(query);
		List<Employee> employees = new ArrayList<Employee>();
		for (Object[] employeeObject : employeeObjects) {
			Employee employee = new Employee();
			long id = ((BigInteger) employeeObject[0]).longValue();
			int age = (int) employeeObject[1];
			String name = (String) employeeObject[2];
			float salary = (float) employeeObject[3];
			employee.setId(id);
			employee.setName(name);
			employee.setAge(age);
			employee.setSalary(salary);
			employees.add(employee);
		}
		System.out.println(employees);
		return employees;
	}

}
