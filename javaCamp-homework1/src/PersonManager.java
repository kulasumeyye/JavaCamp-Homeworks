
public class PersonManager {
	public void register(Person person) {
		System.out.println(person.firstName+" "+"kullanıcısı eklendi.");
	}
	public void personList(Person[] persons) {
		for(Person person:persons) {
			System.out.println(person.firstName+" "+person.lastName+" "+person.age);
		}
		
	}

}
