package org.learntek.springjdbctemplateexample.services;

import java.util.List;

import org.learntek.springjdbctemplateexample.bean.Person;
import org.learntek.springjdbctemplateexample.dao.IPersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personService")
public class PersonServiceImpl implements IPersonService{
	
	@Autowired
	IPersonDao pdao;

	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		pdao.addPerson(person);
	}

	@Override
	public void editPerson(Person person, int personId) {
		// TODO Auto-generated method stub
		pdao.editPerson(person, personId);
	}

	@Override
	public void deletePerson(int personId) {
		// TODO Auto-generated method stub
		pdao.deletePerson(personId);
	}

	@Override
	public Person find(int personId) {
		// TODO Auto-generated method stub
		return pdao.find(personId);
	}

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return pdao.findAll();
	}
	
	

}
