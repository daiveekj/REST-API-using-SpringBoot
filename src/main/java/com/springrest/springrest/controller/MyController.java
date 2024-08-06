package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

//step1:give  annotation that is RestController meaning of rest "representational state transfer"
@RestController
public class MyController {
	
//step14:we are declaring a variable of parent class of serviceimpl i.e courseservice
	
//step16:now create a CourseService object just give the annotation autowired
	@Autowired // it will create the object of courseimpl which is an interface and it will inject it in courseService 
	private CourseService courseService;
	
//step2:create a method and get the method map it
//step3:open postman and give localhost:8080/home it will give the output there	
	@GetMapping("/home") // we are saying that when we trigger this method then this method should invoke
	public String home()
	{
		return "this is home page";
	}
//step4:we are creating GET method to get all the courses so we need list of course	
	// get the courses
//step5:create a class called Course inside that 
//Step10:we are using GET method first to get all the courses so use getmapping annotation
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
//step15: we are calling courseservice interface getcourse method		
		return this.courseService.getCourse1();
//Step11: now the conroller will not return courses it will request the service layer for access the courses for that we need to create a Service class before that create a Interface 
	}
	@GetMapping("/courses/{courseId}")
	
	public Course getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
}
