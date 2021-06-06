package eCommerceManagement.dataAccess.abstracts;

import eCommerceManagement.entities.concretes.User;

public interface UserDao {
	
	void addUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
	User getById(int id);
	String getEmail(User user);
	String getPassword(User user);
}
