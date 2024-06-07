package com.univ.Hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "emp_mtm")
public class Employe {
	
	@Id
	private int eid;
	private String ename;
	private String eaddress;
	@ManyToMany
	private List<Department> dept;
	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employe(int eid, String ename, String eaddress, List<Department> dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.dept = dept;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public List<Department> getDept() {
		return dept;
	}
	public void setDept(List<Department> dept) {
		this.dept = dept;
	}

}
