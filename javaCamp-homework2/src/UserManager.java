
public class UserManager {
	public void getAllUsers() {
		System.out.println("Kullanýcýlar listelendi.");
	}

	public void add(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() + " eklendi.");
	}

	public void update(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() + " güncellendi.");
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() + " silindi!");
	}

}
