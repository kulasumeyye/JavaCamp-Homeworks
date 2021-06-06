package eCommerceManagement.business.concretes;

import eCommerceManagement.business.abstracts.UserService;
import eCommerceManagement.core.validation.concretes.UserValidationManager;
import eCommerceManagement.dataAccess.abstracts.UserDao;
import eCommerceManagement.entities.concretes.User;

public class UserManager implements UserService {
   private UserDao userDao;
   private UserValidationManager validationManager;
   
	public UserManager(UserDao userDao) {
	super();
	this.userDao = userDao;
}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
		
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
		
	}

	@Override
	public void deleteUser(User user) {
		userDao.deleteUser(user);
		
	}

	@Override
	public User getById(int id) {
		return this.userDao.getById(id);
		
	}


	@Override
	public void login(User user) {
        if(validationManager.isEmailValid(user) && validationManager.isPasswordValid(user)) {
			
			if(this.userDao.getEmail(user) == user.getEmail() && this.userDao.getPassword(user) == user.getPassword()) {
				System.out.println("Welcome "+ user.getName() +" "+ user.getSurname());
				
			}else if(this.userDao.getEmail(user) != user.getEmail() || this.userDao.getPassword(user) != user.getPassword()) {
				System.out.println("Invalid username or password. Please try again.");
				
			}
		}
		
	}

	@Override
	public void signIn(User user) {

		if(validationManager.isNameValid(user) && validationManager.isSurnameValid(user)
				&& validationManager.isEmailValid(user) && validationManager.isPasswordValid(user)) 
		{
			if(this.userDao.getEmail(user) != user.getEmail()) {
				sendEmail(user.getEmail());
				if(verificationEmail())
					this.userDao.addUser(user);
				else
					System.out.println("Lütfen e-posta adresinizi doðrulayýn.");
				
		}else
				System.out.println("Bu e-posta zaten kullanýlmýþ.");
		}
		
	}

	private boolean verificationEmail() {
		// TODO Auto-generated method stub
		return false;
	}

	private void sendEmail(String email) {
		// TODO Auto-generated method stub
		
	}

}
