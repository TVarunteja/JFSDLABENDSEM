package com.klef.jfsd.exam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course_table")
public class Course 
{
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "cid")
	  private int id;
	  @Column(name = "cname",nullable = false,length = 50)
	  private String name;
	  @Column(name = "cdescription",nullable = false,length = 500)
	  private String description;
	  @Column(name = "ccredits",nullable = false)
	  private int credits;
	  @Column(name = "cdepartment",nullable = false,length = 30)
	  private String department;
	  @Column(name = "ciname",nullable = false,length = 50,unique = true)
	  private String iname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
}
