package org.learntek.springjdbctemplateexample.dao;

import java.util.List;

import org.learntek.springjdbctemplateexample.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("personDao")
public class PersonDaoImpl  implements IPersonDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		jdbcTemplate.update
		("insert into person(person_id,first_name,last_name,age) values (?,?,?,?)",
				person.getPersonId(),person.getFirstName(),person.getLastName(),person.getAge());
		System.out.println("Person added !!!");
	}

	@Override
	public void editPerson(Person person, int personId) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("update person set first_name = ?,last_name = ?,age = ? WHERE person_id = ?",
				person.getFirstName(),person.getLastName(),person.getAge(),personId	);
		System.out.println("Person updated !!!");
	}

	@Override
	public void deletePerson(int personId) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("delete from person where person_id = ?",personId);
		System.out.println("Person deleted !!!");
	}

	@Override
	public Person find(int personId) {
		// TODO Auto-generated method stub
		Person person =  jdbcTemplate.queryForObject("select * from person where person_id = ?"
				, new Object[] {personId},new BeanPropertyRowMapper<Person>(Person.class));
		return person;
	}

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		List<Person> persons = jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
		return persons;
	}

}
