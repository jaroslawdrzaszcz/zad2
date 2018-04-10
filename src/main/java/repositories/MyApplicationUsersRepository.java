package repositories;

import java.util.ArrayList;
import java.util.List;

import domian.Right;
import domian.User;

public class MyApplicationUsersRepository implements IUserRepository{

	private static List<User> db = new ArrayList<User>();
	
	public MyApplicationUsersRepository() {
		if (db.isEmpty()) {
			User user1 = new User();
			user1.setUsername("Jaro");
			user1.setPassword("111");
			user1.setEmail("jaroslaw.drzaszcz@wp.pl");
			user1.setRight(Right.administrator);
			
			User user2 = new User();
			user2.setUsername("Ola");
			user2.setPassword("222");
			user2.setEmail("olaola.drzaszcz@wp.pl");
			user2.setRight(Right.premium);
			
			User user3 = new User();
			user3.setUsername("Mario");
			user3.setPassword("333");
			user3.setEmail("mario.mario123@gmail.com");
			user3.setRight(Right.regular);
			
			db.add(user1);
			db.add(user2);
			db.add(user3);
		}
	}

	@Override
	public void add(User user) {
		db.add(user);
		
	}

	@Override
	public List<User> getAllUsers() {
		return db;
	}

	@Override
	public String getUserRights(User user) {
		for(User u:db){
			if(u.getUsername().equals(user.getUsername())){
				return u.getRight().toString();
			}		
		}
		return "There is no such a user.";
	}

	@Override
	public String getUserEmail(User user) {
		for(User u:db){
			if(u.getUsername().equals(user.getUsername())){
				return u.getEmail();
			}
					
		}
		return "There is no such a user.";
	}

	@Override
	public boolean logged(User user) {
		for(User u:db){
			if(u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())){
				return true;
			}
					
		}
		return false;
	}

	@Override
	public void setPremium(User user) {
		for (User u : db) {
			if (u.getUsername().equals(user.getUsername())) {
				u.setRight(Right.premium);
			}
		}
	}

	@Override
	public void removePremium(User user) {
		for (User u : db) {
			if (u.getUsername().equals(user.getUsername())) {
				u.setRight(Right.regular);
			}
		}
	}
}

