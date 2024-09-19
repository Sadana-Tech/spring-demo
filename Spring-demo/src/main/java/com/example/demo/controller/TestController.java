package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping
	public ResponseEntity<List<Employee>> get() {

		List<Employee> empList = Arrays.asList(new Employee("dd", 10), new Employee("dcdscfdsd", 12));

		return new ResponseEntity<>(empList, HttpStatusCode.valueOf(200));

	}

}
