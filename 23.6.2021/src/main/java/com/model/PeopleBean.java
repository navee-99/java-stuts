package com.model;



import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.control.*;

@ManagedBean(name="pbean")
@RequestScoped
public class PeopleBean {
	
private int sno;
private String name;
private String city;

public int getSno() {
	return sno;
}

public void setSno(int sno) {
	this.sno = sno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

private List<Person> people;

public List<Person> getPeople() {
    this.people = PersonDAO.getPeople();
	return people;
}

public void setPeople(List<Person> people) {
	this.people = people;
}

 
public String store() {
	   Person person=new Person(sno,name,city);
	   PersonDAO.insert(person);
	   return "people";
  }
}