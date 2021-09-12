package com.example.demo.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DBController{
	@Autowired
	private DBService service;
	
	@GetMapping("/RegistEmployee")
	private String getDB() {
		return "db/db_search";
	}
	
	@PostMapping("/RegistEmployee/result")
    public String postDbRequest(@RequestParam("text1")String id, Model model) {
    	Employee employee = service.getEmployee(id);
    	model.addAttribute("employee", employee);
    	return "db/db_result";
    }
}