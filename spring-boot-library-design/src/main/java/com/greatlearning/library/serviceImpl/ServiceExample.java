package com.greatlearning.library.serviceImpl;

import org.springframework.stereotype.Service;

import com.greatlearning.library.model.GreatLearning;

@Service
public class ServiceExample implements ServiceExampleImpl {

	@Override
	public GreatLearning get() {
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName("Learn Controller in Spring Boot");
		greatLearning.setCourseType("Information Technology");
		greatLearning.setInstructorName("Vilas More");
		return greatLearning;
	}

	@Override
	public GreatLearning customInfo(String courseName, String courseType, String instructorName) {
		GreatLearning greatLearning = new GreatLearning();
		greatLearning.setCourseName(courseName);
		greatLearning.setCourseType(courseType);
		greatLearning.setInstructorName(instructorName);
		return greatLearning;

	}
}