package org.ashrafi.spring.microservices.student.model;

public class Student{
	
    private String name;
    private String className;
    private String schoolName;
    
    public Student(String schoolName, String name, String className) {
        super();
        this.schoolName = schoolName;
        this.name = name;
        this.className = className;
    }

    
    public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getClassName() {
        return className;
    }
 
    public void setClassName(String className) {
        this.className = className;
    }
}