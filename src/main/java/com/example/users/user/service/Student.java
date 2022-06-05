package com.example.users.user.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	String forename;
	String surname;
	int grade;
	 
	@Override
	public String toString() {
		return "Student [forename=" + this.forename + ", surname=" + this.surname + ", grade=" + this.grade + "]";
	}
	
	
}
