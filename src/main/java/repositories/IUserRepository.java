package repositories;

import java.util.List;

import domian.Right;
import domian.User;

public interface IUserRepository {
	void add (User user);
	List<User> getAllUsers();
	String getUserRights(User user);
	void setPremium (User user);
	void removePremium (User user);
	String getUserEmail(User user);
	boolean logged (User user);
}
