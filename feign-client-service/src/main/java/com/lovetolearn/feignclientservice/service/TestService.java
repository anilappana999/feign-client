package com.lovetolearn.feignclientservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lovetolearn.feignclientservice.dto.Employee;

@FeignClient(url="http://localhost:8080",value = "employee-service")
public interface TestService {

	@PostMapping("save")
	public Employee saveEmployee(@RequestBody Employee employee) ;

	@DeleteMapping("delBy/{id}")
	public void deleteById(@PathVariable Integer id) ;

	@GetMapping("getBy/{id}")
	public Employee getEmployeeById(@PathVariable Integer id) ;
	@PutMapping("update")
	public Employee updateEmployee(@RequestBody Employee emp) ;

}
