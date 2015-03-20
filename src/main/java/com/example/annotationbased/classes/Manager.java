package com.example.annotationbased.classes;

import org.springframework.beans.factory.annotation.Autowired;

public class Manager {

	private String mfirstName;
	private String mmiddleName;
	private String mlastName;
	
	@Autowired //this can be done at field level
	private Employee emp;

	public String getMfirstName() {
		return mfirstName;
	}

	public void setMfirstName(String mfirstName) {
		this.mfirstName = mfirstName;
	}

	public String getMmiddleName() {
		return mmiddleName;
	}

	public void setMmiddleName(String mmiddleName) {
		this.mmiddleName = mmiddleName;
	}

	public String getMlastName() {
		return mlastName;
	}

	public void setMlastName(String mlastName) {
		this.mlastName = mlastName;
	}

	public Employee getEmp() {
		return emp;
	}

	//@Autowired this can be done at setter level
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
}
