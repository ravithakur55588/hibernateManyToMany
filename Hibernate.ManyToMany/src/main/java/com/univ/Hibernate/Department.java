package com.univ.Hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dept_mtm")
public class Department {
	
	@Id
	private int did;
	private String dname;
	@ManyToMany
	private List<Employe> emp;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Department(int did, String dname, List<Employe> emp) {
		super();
		this.did = did;
		this.dname = dname;
		this.emp = emp;
	}
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<Employe> getEmp() {
		return emp;
	}
	public void setEmp(List<Employe> emp) {
		this.emp = emp;
	}
	
}
