package com.example.users.user.service;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class UserServiceApplicationTests {

	@Autowired
	UserService userService;
	
	@BeforeEach
	void beforeAll(){
		this.userService.createStudent(new Student("Saravanan", "Sagadevan" , 4));
		this.userService.createStudent(new Student("SeenuA", "SeenuF" , 1));
		this.userService.createStudent(new Student("Ramu", "Ramu1" , 5));		
		this.userService.createStudent(new Student("John", "JohnF" , 4));
		this.userService.createStudent(new Student("Tom", "TomF" , 4));
		this.userService.createStudent(new Student("Haresh", "HareshF" ,5));
	}
	
	@Test
	void load() {
		this.userService.convertStudenToEmployee();
		this.userService.getListOfEmployee().forEach(System.out::println);
		this.userService.getListOfEmployee().stream().collect(Collectors.groupingBy(Employee::getCompany))
				.entrySet().forEach(entry -> { System.out.println( entry.getKey() +"," + (entry.getValue().size()));});
	}	
	 
	@Test
	 void equalsConvertStudentToEmployee() {
		long companyCount = this.userService.getListOfEmployee().stream().filter(s->!s.company.isEmpty()).count();
		assertEquals(5, companyCount );
	}

	
	@Test
	 void notEqualsConvertStudentToEmployee() {
		long companyCount = this.userService.getListOfEmployee().stream().filter(s->!s.company.isEmpty()).count();
		assertNotEquals(3, companyCount);
	}
	
	
	 
	
	 
}
