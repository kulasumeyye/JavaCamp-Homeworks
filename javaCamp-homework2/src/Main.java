
public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor(1,1,new int[]{3,2,5},"Engin","Demiroğ","xxxxx@gmail.com","123456");
		Student student = new Student();
		student.setId(122);
		student.setFirstName("Sümeyye");
		student.setLastName("Kula");
		student.setEmail("sumeyye@gmail.com");
		student.setPassword("54896");
		student.setStudentId(2);
		
	
		UserManager userManager = new UserManager();
		userManager.add(instructor);
		userManager.add(student);

	
	
	}

}
