
public class Main {

	public static void main(String[] args) {
		Person person1=new Person(1,"Sümeyye","Kula",23);
		Person person2=new Person(2,"Esmanur","Çakýr",23);
		
		Person[] persons= {person1,person2};
		
		for(Person person:persons) {
			System.out.println(person.firstName+" "+person.lastName);
		}
		
		PersonManager personManager=new PersonManager();
		personManager.register(person1);
		personManager.register(person2);
		System.out.println("---Person List---");
		personManager.personList(persons);

	}

}
