package com.example.demo.database;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService{
	@Autowired
	private DBRepository repository;
	
	public Employee getEmployee(String id) {
		Map<String, Object> map = repository.findById(id);
		
		int eid = (Integer) map.get("id");
		String employee_no = (String) map.get("employee_no");
		String last_name = (String) map.get("last_name");
		
		Employee employee = new Employee();
		employee.setId(eid);
		employee.setEmployee_no(employee_no);
		employee.setLast_name(last_name);
		
		return employee;
	}
}