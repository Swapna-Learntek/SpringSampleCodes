package org.learntek.springbeaninitanddestroyexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements InitializingBean,DisposableBean{
	
	private List<User> listOfUsers = new ArrayList<>();

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		User user = new User(1,"User");
		User user2 = new User(2,"Admin");
		User user3 = new User(3,"SuperAdmin");
		
		listOfUsers.add(user);
		listOfUsers.add(user3);
		listOfUsers.add(user2);
		System.out.println("List of users added in init() method .............");
		for(Iterator<User> itr = listOfUsers.iterator();itr.hasNext();) {
			User user4 = itr.next();
			System.out.println(user4.toString());
		}
		//database code
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		listOfUsers.clear();
		System.out.println("List of users added in destroy() method .............");
		for(Iterator<User> itr = listOfUsers.iterator();itr.hasNext();) {
			User user4 = itr.next();
			System.out.println(user4.toString());
		}
		System.out.println("List is cleaned up.....");
		//database code goes here
	}

	public void customUtilMethod(){
		System.out.println("In util method");
	}


}
