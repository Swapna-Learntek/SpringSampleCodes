package org.learntek.springjdbctemplateexample;

import java.util.List;
import java.util.Scanner;

import org.learntek.springjdbctemplateexample.bean.Person;
import org.learntek.springjdbctemplateexample.configuration.ApplicationConfig;
import org.learntek.springjdbctemplateexample.services.IPersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        IPersonService personService = (IPersonService) ctx.getBean("personService");
		/*
		 * Person rama = new Person(1,"Rama","Krishna",45); Person ram = new
		 * Person(2,"Ram","Krishna",35); Person ramji = new
		 * Person(3,"Ramji","Krishna",40);
		 * 
		 * personService.addPerson(ram); personService.addPerson(ramji);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * ram.setFirstName("Ramana"); ram.setLastName("R"); ram.setAge(48);
		 */
        
   
        
     
        
        System.out.println("Again Find All");
        List<Person> updatedPersons = personService.findAll();
        for(Person person1:updatedPersons) {
        	System.out.println(person1);
        }
        
        AppUtil au = new AppUtil();
        Scanner sc = new Scanner(System.in);
        char ch = 'y';
        while(ch == 'y') {
        	System.out.println("Enter choice of transaction");
        	System.out.println("add:add person");
        	System.out.println("edit:edit person");
        	System.out.println("delete:delte person");
        	System.out.println("find:find person");
        	System.out.println("findall:findall person");
        	String choice = sc.next();
        	switch (choice) {
			case "add":
				Person p = au.readPersonDetails();
			     personService.addPerson(p);
				break;
			case "edit":
			     System.out.println("Update PersonId ");
			        int updateMe = au.readPersonId();
			        Person updatePerson = au.readPersonDetails();
			        personService.editPerson(updatePerson, updateMe);
				break;
			case "delete":
		        System.out.println("Delete PersonId");
		        int deleteMe = au.readPersonId();
		        personService.deletePerson(deleteMe);
				break;
			case "find":
				   System.out.println("Find PersonId");
			        int findMe = au.readPersonId();
			        Person person = personService.find(findMe);
			        System.out.println(person);
				break;
			case "findall":
			     System.out.println("Find All");
			        List<Person> persons = personService.findAll();
			        for(Person person1:persons) {
			        	System.out.println(person1);
			        }
				break;

			default:
				System.out.println("Not a right choice");
				break;
			}
        	
        	System.out.println("do you want to continue");
        	ch = sc.next().trim().charAt(0);
        }
        
        sc.close();
        ctx.close();
    }
}
