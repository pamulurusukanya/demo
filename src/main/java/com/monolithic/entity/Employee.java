package com.monolithic.entity;

import java.security.KeyStore.PrivateKeyEntry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name= "employee_Table")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String eName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String eName) {
		super();
		this.id = id;
		this.eName = eName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", eName=" + eName + "]";
	}
	
	
	
	

	

}
