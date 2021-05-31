package Entities;

public class Gamer implements Entity {
	private int gamerId;
	private String firstName;
	private String lastName;
	private int timeOfBirth;
	private String nationalIdentity;
	
	public Gamer() {
		super();
	}
	public Gamer(int gamerId, String firstName, String lastName, int timeOfBirth, String nationalIdentity) {
		super();
		this.gamerId = gamerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.timeOfBirth = timeOfBirth;
		this.nationalIdentity = nationalIdentity;
	}
	public int getGamerId() {
		return gamerId;
	}
	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getTimeOfBirth() {
		return timeOfBirth;
	}
	public void setTimeOfBirth(int timeOfBirth) {
		this.timeOfBirth = timeOfBirth;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

}
