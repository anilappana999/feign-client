package com.lovetolearn.feignclientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lovetolearn.feignclientservice.dto.Employee;
import com.lovetolearn.feignclientservice.service.TestService;


@RestController
public class TestController {

	@Autowired
	TestService testService;

	@PostMapping("save")
	public Employee saveEmployee(@RequestBody Employee employee) {

		return testService.saveEmployee(employee);
	}

	@DeleteMapping("delBy/{id}")
	public void deleteById(@PathVariable Integer id) {

		testService.deleteById(id);
	}

	@GetMapping("getBy/{id}")
	public Employee getEmployeeById(@PathVariable Integer id) {

		return testService.getEmployeeById(id);

	}

	@PutMapping("update")
	public Employee updateEmployee(@RequestBody Employee emp) {

		return testService.updateEmployee(emp);
	}

}
