package org.ashrafi.spring.microservices.student;

import org.ashrafi.spring.microservices.student.model.Student;
import org.ashrafi.spring.microservices.student.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.event.EventListener;
  
@SpringBootApplication
@EnableEurekaClient
public class SpringEurekaClientStudentServiceApplication {
  
	
	
    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaClientStudentServiceApplication.class, args);
    }
    
    @EventListener(value=ApplicationReadyEvent.class)
    public void readyEvent() {
    	StudentRepository studentRepository = new StudentRepository();
    	System.out.println("Application started... going to add sample data...");
    	studentRepository.add(new Student("ABC", "Najib", "Class Prep"));
    	studentRepository.add(new Student("XYZ", "Rayyan", "Class III"));
    	studentRepository.add(new Student("ABC", "Raheema", "Class Nursery"));
    	studentRepository.add(new Student("XYZ", "Alishba", "Class I"));
    	studentRepository.add(new Student("EFG", "Abdullah", "Class II"));
    	studentRepository.add(new Student("EFG", "Ayman", "Class V"));
    	studentRepository.add(new Student("ABC", "Abdul Rehman", "Class IV"));
    	System.out.println("Sample data has been added ...");
    }
}
