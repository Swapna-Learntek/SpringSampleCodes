package org.learntek.springjdbctemplateexample;

import java.util.Scanner;

import org.learntek.springjdbctemplateexample.bean.Person;

public class AppUtil {
	
	Scanner sc = new Scanner(System.in);
	Person p = new Person();
	public Person readPersonDetails() {
		System.out.println("Enter the details of the person");
		System.out.println("Enter the Person Id");
		int id = sc.nextInt();
		System.out.println("Enter the Person First Name");
		String fname = sc.next();
		System.out.println("Enter the Person Last Name");
		String lname = sc.next();
		System.out.println("Enter the Person age");
		int age = sc.nextInt();
		
		p.setPersonId(id);
		p.setFirstName(fname);
		p.setLastName(lname);
		p.setAge(age);
		
		return p;
	}
	
	public int readPersonId() {
		System.out.println("Enter the Person Id");
		int id = sc.nextInt();
		
		return id;
	}

	
	
	
	
}
