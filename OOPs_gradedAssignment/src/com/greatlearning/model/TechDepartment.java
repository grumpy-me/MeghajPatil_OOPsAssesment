package com.greatlearning.model;

public class TechDepartment extends SuperDepartment {
	
	public String welcomeMessage() {
		return "Welcome to Tech Department";
	}
	
	public String departmentName() {
		return "Tech Department" ;
	}
	
	public String getTodaysWork() {
		return "Complete coding of module 1" ;
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD" ;
	}
	
	public String getTechStackInformation() {
		return "core Java" ;
	}
	
}