package com.example.demo.fortune;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController{
	@Autowired
	private FortuneService fservice;
	@Autowired
	private WeatherService wservice;
	
	@GetMapping("/IncludeServlet")
	private String getMenu() {
		return "menu";
	}
	
	@PostMapping("/Fortune")
	public String postFortuneReq(Model model) {
		model.addAttribute("fortune", fservice.getFortune());
		return "menu";
	}
	
	@PostMapping("/Weather")
	public String postWeatherReq(Model model) {
		model.addAttribute("weather", wservice.getWeather());
		return "menu";
	}
}
