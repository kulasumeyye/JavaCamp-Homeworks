package eCommerceManagement.dataAccess.concretes;

import eCommerceManagement.dataAccess.abstracts.UserDao;
import eCommerceManagement.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void addUser(User user) {
		System.out.println("Kullan�c� eklendi"+user.getName());
		
	}

	@Override
	public void updateUser(User user) {
		System.out.println("Kullan�c� g�ncellendi"+user.getName());
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("Kullan�c� silindi "+user.getName());
		
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEmail(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
