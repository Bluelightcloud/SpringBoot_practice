package com.example.demo.fortune;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class WeatherService{
	public String getWeather() {
		String[] weather = {"����", "�܂�", "�J", "��"};
		Random r = new Random();
		return weather[r.nextInt(4)];
	}
}