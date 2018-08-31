package org.ashrafi.spring.microservices.student.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ashrafi.spring.microservices.student.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	private static Map<String, List<Student>> schoolDB = new HashMap<String, List<Student>>();


	public void add(Student student) {
		find(student.getSchoolName()).add(student);
	}

	public List<Student> find(String schoolName) {
		List<Student> list = schoolDB.get(schoolName);
		if(list == null) {
			list = new ArrayList<>();
			schoolDB.put(schoolName, list);
		}
		return list;
	}


}
