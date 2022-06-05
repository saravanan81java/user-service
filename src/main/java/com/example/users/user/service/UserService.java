package com.example.users.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;


@Component
public class UserService {

	List<Student> listOfStudent;  
	List<Employee> listOfEmployee;  
	public UserService() {
		System.out.println("User Service constractor");
		if(this.listOfStudent == null) {
			listOfStudent = new ArrayList<>();
		}
		if(this.listOfEmployee == null) {
			listOfEmployee = new ArrayList<>();
		}
	}

 
	public void createStudent(Student s) {
		this.listOfStudent.add(s);
	}

	public void createEmployee(Employee e){
		this.listOfEmployee.add(e);
	}
	 
   
	public void  convertStudenToEmployee() {
		this.listOfEmployee =  this.listOfStudent.stream().filter(stu -> stu.getGrade() > 3)
				.map(st -> {
					Employee e = new Employee(st.getForename(), st.getSurname(), st.getGrade() == 4 ? "HCL" : "WIPRO");
					return e;
				}).collect(Collectors.toList());
	}
	
	public List<Employee> getListOfEmployee() {
		return this.listOfEmployee;
	}
	
	public List<Student> getListOfStudent() {
		if(this.listOfStudent == null){
			this.listOfStudent = new ArrayList<>();
		}
		return this.listOfStudent;
	}
	 
	
}
