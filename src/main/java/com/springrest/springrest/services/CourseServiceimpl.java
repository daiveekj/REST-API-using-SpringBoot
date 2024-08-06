package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;
//step17: this is working on our service layer
@Service
public class CourseServiceimpl  implements CourseService{

//Step12:create a list of courses
List<Course> list;

//step13:add the list and put the values we already created the constructor
public CourseServiceimpl() {
	
	list=new ArrayList<>();
	list.add(new Course(143,"java core","this course is for java"));
	list.add(new Course(123,"spring boot","creating spring boot rest api"));

}
	@Override
	public List<Course> getCourse() {
		return list;
	}
	public Course getCourse(long courseId) {

		Course c = null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}
	@Override
	public List<Course> getCourse1() {
		// TODO Auto-generated method stub
		return null;
	}

}
