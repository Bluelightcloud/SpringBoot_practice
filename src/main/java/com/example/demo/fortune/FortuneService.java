package com.example.demo.fortune;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class FortuneService{
	public String getFortune() {
		String[] fortune = {"‘å‹g", "’†‹g", "¬‹g", "‹¥"};
		Random r = new Random();
		return fortune[r.nextInt(4)];
	}
}