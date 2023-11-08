package com.onesoft.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onesoft.emp.entity.Employe;
import com.onesoft.emp.service.EmployeService;

@RestController
@RequestMapping(value = "/admin")
public class EmployeeController {
	@Autowired
	EmployeService es;

	@PostMapping(value = "/setdata")
	public String setData(@RequestBody Employe e) {
		return es.setData(e);
	}

	@PostMapping(value = "/setdat")
	public String setDat(@RequestBody List<Employe> e) {
		return es.setDat(e);
	}

	@PutMapping(value = "/setdate")
	public String setDate(@RequestBody Employe e) {
		return es.setDate(e);
	}

	@GetMapping(value = "/setda/{id}")
	public Employe setDa(@PathVariable int id) {
		return es.setDa(id);
	}

	@GetMapping(value = "/yyyy")
	public List<Employe> setd() {
		return es.setd();
	}

	@GetMapping(value = "/zzz/{id}")
	public Employe set(@PathVariable int id) {
		return es.set(id);
	}

	@GetMapping(value = "/getData/{name}")
	public List<Employe> getData(@PathVariable String name) {
		return es.getData(name);
	}

	@GetMapping(value = "/max")
	public Employe getMax() {
		return es.getMax();
	}

	@GetMapping(value = "/min")
	public Employe getMin() {
		return es.getMin();
	}

	@GetMapping(value = "msg")
	public String getMsg() {
		return "hi";
	}

	@GetMapping(value = "ad")
	public List<Employe> getad() {
		return es.getad();
	}
}
