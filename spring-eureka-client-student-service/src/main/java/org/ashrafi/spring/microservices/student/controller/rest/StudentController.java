package org.ashrafi.spring.microservices.student.controller.rest;

import java.util.List;

import org.ashrafi.spring.microservices.student.model.Student;
import org.ashrafi.spring.microservices.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/students")
public class StudentController {

	@Autowired StudentRepository studentRepository;
	
	@RequestMapping(value="/{schoolName}", method=RequestMethod.GET)
    public List<Student> list(@PathVariable String schoolName) {
        System.out.println("Getting Student details for " + schoolName);
        return studentRepository.find(schoolName);
    }
	
}
