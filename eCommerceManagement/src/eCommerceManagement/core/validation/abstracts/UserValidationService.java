package eCommerceManagement.core.validation.abstracts;

import eCommerceManagement.entities.concretes.User;

public interface UserValidationService {
	boolean isPasswordValid(User user);
	boolean isEmailValid(User user);
	boolean isNameValid(User user);
	boolean isSurnameValid(User user);
}
