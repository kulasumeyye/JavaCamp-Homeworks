package eCommerceManagement.business.abstracts;

import eCommerceManagement.entities.concretes.User;

public interface UserService {
	void addUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
	User getById(int id);
	void login(User user);
	void signIn(User user);

}
