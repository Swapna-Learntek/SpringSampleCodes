package org.learntek.springjdbctemplateexample.dao;

import java.util.List;

import org.learntek.springjdbctemplateexample.bean.Person;

public interface IPersonDao {
	
	public void addPerson(Person person);
	public void editPerson(Person person,int personId);
	public void deletePerson(int personId);
	public Person find(int personId);
	public List<Person> findAll();

}
