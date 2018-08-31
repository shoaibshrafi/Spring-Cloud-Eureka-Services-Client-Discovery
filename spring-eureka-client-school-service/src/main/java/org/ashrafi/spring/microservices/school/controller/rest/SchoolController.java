package org.ashrafi.spring.microservices.school.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/schools")
public class SchoolController {

	private final static String GET_STUDENTS_BY_SCHOOL_SERVICE_URL = "http://eureka-client-student-service/students/{schoolName}";
	@Autowired RestTemplate restTemplate;
	
	@RequestMapping(value="/{schoolName}/students", method=RequestMethod.GET)
	public String getStudents(@PathVariable String schoolName) {
		System.out.println("Going to retrieve student list for school");
		return restTemplate.exchange(GET_STUDENTS_BY_SCHOOL_SERVICE_URL, HttpMethod.GET, null, new ParameterizedTypeReference<String>() {}, schoolName).getBody();		
	}

	@Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
