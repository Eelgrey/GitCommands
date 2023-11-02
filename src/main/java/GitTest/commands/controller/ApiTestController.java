package GitTest.commands.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import GitTest.commands.model.Student;

@RestController
public class ApiTestController {
	
	@GetMapping("/getStudentDetails")
	public String getStudentDetails(@RequestParam("id") Integer id) {
		Student stu = new Student(101, "Apurva", "Mumbai", 99.0);
		
		return  stu.toString() + MediaType.APPLICATION_JSON_VALUE;
	}
	

}
