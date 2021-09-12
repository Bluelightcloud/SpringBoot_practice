package com.example.demo.database;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DBRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public Map<String, Object> findById(String id){
		String query = "SELECT * "
			+"FROM t_employee "
			+"WHERE id=?";
			
		Map<String, Object> employee = jdbcTemplate.queryForMap(query, id);
		return employee;
	}
}