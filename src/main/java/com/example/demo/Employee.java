package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeesTableMastercard")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;


	@Column(name="Name")
	private String name;

	@Column(name="Roll")
	private int rollno;

	@Column(name="Address")
	private String address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, int rollno, String name, String address) {
		super();
		this.id = id;
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void studying() {
		System.out.println("Employee is working");
	}
}
