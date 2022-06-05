package com.example.users.user.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	String forename;
	String surname;
	String company;
	 
	@Override
	public String toString() {
		return "Employee [forename=" + this.forename + ", surname=" + this.surname + ", company=" + this.company + "]";
	}
	
	
}
