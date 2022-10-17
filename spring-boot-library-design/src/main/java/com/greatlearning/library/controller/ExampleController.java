package com.greatlearning.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.model.GreatLearning;
import com.greatlearning.library.serviceImpl.ServiceExampleImpl;

@Controller
@RestController
public class ExampleController {
	
	@Autowired
	ServiceExampleImpl serviceExample;

	@GetMapping("/info")
	@ResponseBody
	public GreatLearning get() {
//		GreatLearning greatLearning = new GreatLearning();
//		greatLearning.setCourseName("Learn Controller in Spring Boot");
//		greatLearning.setCourseType("Information Technology");
//		//greatLearning.setInstructorName("Vilas More");
		return serviceExample.get();
	}

	@PostMapping("/customInfo")
	public GreatLearning customInfo(String courseName, String courseType, String instructorName) {
//		GreatLearning greatLearning = new GreatLearning();
//		greatLearning.setCourseName(courseName);
//		greatLearning.setCourseType(courseType);
//		//greatLearning.setInstructorName(instructorName);
		return serviceExample.customInfo(courseName, courseType, instructorName);
	}

}
