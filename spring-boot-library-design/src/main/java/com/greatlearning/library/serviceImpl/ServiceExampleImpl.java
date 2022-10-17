package com.greatlearning.library.serviceImpl;

import com.greatlearning.library.model.GreatLearning;

public interface ServiceExampleImpl {

	GreatLearning get();

	GreatLearning customInfo(String courseName, String courseType, String instructorName);

}