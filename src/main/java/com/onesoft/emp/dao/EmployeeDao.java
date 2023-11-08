package com.onesoft.emp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.emp.entity.Employe;
import com.onesoft.emp.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;

	public String setData(Employe e) {
		er.save(e);
		return "save succesfully";
	}

	public String setDat(List<Employe> e) {
		er.saveAll(e);
		return "save successfully";
	}

	public String setDate(Employe e) {
		er.save(e);
		return "update successfully";
	}

	public Employe setDa(int id) {
		return er.findById(id).get();

	}

	public List<Employe> setd() {

		return er.findAll();
	}

	public String set(int id) {
		er.deleteById(id);
		return "deleted successfully";
	}

	public List<Employe> getAllDetails() {
		return er.findAll();
	}
}
