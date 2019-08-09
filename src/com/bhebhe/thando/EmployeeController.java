package com.bhebhe.thando;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@RequestMapping("/employeeHomePageMethod")
	public String showEmployeeHomePage() {
		return "employeeHomePage";
	}
	
	@RequestMapping("/showEmployeeFormMethod")
	public String showEmployeeForm(Model myModel) {
		//creating employee object
		Employee employee = new Employee();
		
		//adding object to model
		myModel.addAttribute("employee", employee);
		return "employeeForm";
	}
	
	@RequestMapping("/employeeConfirmationPageMethod")
	public String employeeConfirmationPage(@ModelAttribute("employee") Employee sexyemployee){
		
		//trying to access employee methods and print values...
		System.out.println("Name: "+sexyemployee.getName());
		System.out.println("ID: "+sexyemployee.getEmpId());
		System.out.println("Surname: "+sexyemployee.getSurname());
		return "employeeConfirmationPage";
	}
	
	

}
