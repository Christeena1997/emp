package com.onesoft.emp.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.emp.dao.EmployeeDao;
import com.onesoft.emp.entity.Employe;

@Service
public class EmployeService {
	@Autowired
	EmployeeDao ed;

	public String setData(Employe e) {

		return ed.setData(e);
	}

	public String setDat(List<Employe> e) {
		return ed.setDat(e);
	}

	public String setDate(Employe e) {
		return ed.setDate(e);
	}

	public Employe setDa(int id) {

		return ed.setDa(id);
	}

	public List<Employe> setd() {

		return ed.setd();
	}

	public Employe set(int id) {

		return ed.setDa(id);
	}

	public List<Employe> getData(String name) {
		List<Employe> a = ed.getAllDetails();
		List<Employe> d = a.stream().filter(x -> x.getName().equals(name)).collect(Collectors.toList());
		return d;
	}

	public Employe getMax() {
		List<Employe> l = ed.getAllDetails();
		Employe h = l.stream().max(Comparator.comparing(Employe::getSalary)).get();
		return h;
	}

	public Employe getMin() {
		List<Employe> t = ed.getAllDetails();
		Employe s = t.stream().min(Comparator.comparing(Employe::getAge)).get();
		return s;
	}

	public List<Employe> getad() {
		List<Employe> h = ed.getAllDetails();
		List<Employe> i = h.stream().map(x -> {
			if (x.getGender().equalsIgnoreCase("male")) {
				x.setSalary(x.getSalary() + x.getSalary() * 10 / 100);
			} else {
				x.setSalary(x.getSalary() + x.getSalary() * 15 / 100);
			}
			return x;
		}).toList();
		return i;
	}
}
