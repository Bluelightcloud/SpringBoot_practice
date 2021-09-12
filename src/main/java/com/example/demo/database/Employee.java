package com.example.demo.database;

import lombok.Data;

@Data
public class Employee{
	private int id;
	private String employee_no;
	private String last_name;
	private String first_name;
	private String birthday;
	private int gender;
	private String tel;
	private String email;
	private String post_no;
	private String prefecture;
	private String address1;
	private String address2;
}
