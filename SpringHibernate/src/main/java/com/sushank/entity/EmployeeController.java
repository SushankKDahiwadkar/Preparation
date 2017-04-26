package com.sushank.entity;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployeeController {

	private static final Logger logger = Logger.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;

	public EmployeeController() {
		System.out.println("EmployeeController()");
	}

	/*@RequestMapping("createEmployee")
	public ModelAndView createEmployee(@ModelAttribute Employee employee) {
		logger.info("Creating Employee. Data: " + employee);
		return new ModelAndView("employeeForm");
	}

	@RequestMapping("editEmployee")
	public ModelAndView editEmployee(@RequestParam long id, @ModelAttribute Employee employee) {
		logger.info("Updating the Employee for the Id " + id);
		employee = employeeService.getEmployee(id);
		return new ModelAndView("employeeForm", "employeeObject", employee);
	}

	@RequestMapping("saveEmployee")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		logger.info("Saving the Employee. Data : " + employee);
		if (employee.getId() == 0) { // if employee id is 0 then creating the
										// employee other updating the employee
			employeeService.createEmployee(employee);
		} else {
			employeeService.updateEmployee(employee);
		}
		return new ModelAndView("redirect:getAllEmployees");
	}

	@RequestMapping("deleteEmployee")
	public ModelAndView deleteEmployee(@RequestParam long id) {
		logger.info("Deleting the Employee. Id : " + id);
		employeeService.deleteEmployee(id);
		return new ModelAndView("redirect:getAllEmployees");
	}*/

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody List<Employee> getAllEmployees() {
		logger.info("Getting the all Employees.");
		List<Employee> employeeList = employeeService.getAllEmployees();
		return employeeList;
	}

	/*@RequestMapping("searchEmployee")
	public ModelAndView searchEmployee(@RequestParam("searchName") String searchName) {
		logger.info("Searching the Employee. Employee Names: " + searchName);
		List<Employee> employeeList = employeeService.getAllEmployees(searchName);
		return new ModelAndView("employeeList", "employeeList", employeeList);
	}*/

}
