package eCommerceManagement.core.validation.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceManagement.core.validation.abstracts.UserValidationService;
import eCommerceManagement.entities.concretes.User;

public class UserValidationManager implements UserValidationService {

	@Override
	public boolean isPasswordValid(User user) {
		if(user.getPassword().length()>5) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmailValid(User user) {
		Pattern regexPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
		Matcher matcher = regexPattern.matcher(user.getEmail());
		if (!matcher.find()) {
			System.out.println("Hatalı Email");
			return false;
		}
		return true;
	}

	@Override
	public boolean isNameValid(User user) {
		if(user.getName().length()>1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isSurnameValid(User user) {
		if(user.getSurname().length()>1) {
			return true;
		}
		return false;
	}

}
