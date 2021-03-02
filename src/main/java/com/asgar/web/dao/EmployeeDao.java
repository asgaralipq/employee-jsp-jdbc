package com.asgar.web.dao;

import com.asgar.web.model.Employee;

public class EmployeeDao {
	
	public Employee getEmployee(int e_id) {
		Employee e=new Employee();
		e.setE_id(101);
		e.setE_name("AsgarAli");
		e.setSub("JavaScript");
		
		return e;
	}
}
