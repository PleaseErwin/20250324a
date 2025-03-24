package edu.fisa.ce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {
	
	@GetMapping("fisa1")
	public String reqRes() {
		System.out.println("***reqRes()***");
		return "요청 응답 성공";
	}
	
	@PostMapping("fisa2")
	public String req() {
		System.out.println("***req()***");
		return "응답함";
	}
}
