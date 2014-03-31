package com.mjtoolbox.ws;


import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="students")
public class StudentWrapper {

	private List<Student> list;

	public StudentWrapper() {
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}
	
	
	
	
}
