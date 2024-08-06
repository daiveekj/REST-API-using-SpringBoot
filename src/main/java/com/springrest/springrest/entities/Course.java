package com.springrest.springrest.entities;

public class Course {

	 private long id;
	 private String tital;
	 private String description;
//Step6: go to source > generate constructor 
	public Course(long id, String tital, String description) {
		super();
		this.id = id;
		this.tital = tital;
		this.description = description;
	}
//Step7: generate default constructor 
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
//Step8:generate getter and setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTital() {
		return tital;
	}
	public void setTital(String tital) {
		this.tital = tital;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
//Step9:generate toString method
	@Override
	public String toString() {
		return "Course [id=" + id + ", tital=" + tital + ", description=" + description + "]";
	}
	

	
}
