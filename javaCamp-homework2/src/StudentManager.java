
public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		super.add(user);
		System.out.println("Student eklendi.");
	}

}
