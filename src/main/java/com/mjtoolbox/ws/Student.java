package com.mjtoolbox.ws;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="student")
public class Student implements Serializable{


	private static final long serialVersionUID = 6718071273578435756L;
	
	private int id;
	private String name;
	private int age;
	
	public Student() {
	}
	
	

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	@XmlElement
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	
	
	
}
