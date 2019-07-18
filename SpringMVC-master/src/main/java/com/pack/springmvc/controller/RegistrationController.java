package com.pack.springmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pack.springmvc.service.EmployeeService;
import com.pack.springmvc.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

//@Controller
@RestController
@RequestMapping("/employee")
public class RegistrationController {

	/*@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/displayall")
	public String displayAll(Model model) {
		model.addAttribute("emplist", employeeService.listAllEmployee());
		return "displayall";
	}

	@GetMapping("/getbyid/{id}")
	public String getById(@PathVariable("id") int id, Model model) {
		Employee employee = employeeService.findByIdEmployee(id);
		if(employee == null)
			return "noidpresent";
		model.addAttribute("employee", employee);
		return "display";
	}
	

	
	public String loginForm(Model model)
	{
		return "login";
	}

	@GetMapping("/register")
	public String registrationPage(Model model)
	{
		model.addAttribute("employee",new Employee());
		return "register";
	}
	
	@PostMapping("/register")
	public String registerEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult result)
	{
	
		 if (result.hasErrors()) {
	            return "register";
	      } 
		 else
	      {
	            System.out.println("Valid Object");
	      }
		 employeeService.insertEmployee(employee);
		return "success";
	}
	
	@PostMapping("getbyid/delete/{id}")
	public String deleteEmployee(@Valid @ModelAttribute("emp") Employee employee)
	{
		System.out.println("delete done"+employee.getId());
		employeeService.deleteEmployee(employee.getId());
		
		return "success";
	}
	*/
	@GetMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> displayAllEmployees(){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Vinay",21,23000));
        empList.add(new Employee(2, "Harish",22,25000));
        //model.addAttribute("empList", empList);
        return empList;
    }

    @GetMapping(value = "/{id}", produces = {"application/xml"})
    @ResponseStatus(HttpStatus.OK)
    public Employee displayEmployee(@PathVariable("id") int id){

        Employee employee = new Employee(id, "Vinay",21,23000);

        return employee;
    }
    @PostMapping(value = "/", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public void registerEmployee(@Valid @RequestBody Employee employee){
        System.out.println(employee);
        System.out.println("Came inside the post method of register employee ....");
    }

}
