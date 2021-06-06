package eCommerceManagement;

import eCommerceManagement.business.abstracts.UserService;
import eCommerceManagement.business.concretes.UserManager;
import eCommerceManagement.dataAccess.concretes.HibernateUserDao;
import eCommerceManagement.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService= new UserManager(new HibernateUserDao());
		User user= new User("Sümeyye","Kula","kula@gmail.com","123456");
		userService.addUser(user);

	}

}
