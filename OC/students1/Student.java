package Students1;

public class Student {

	private String firstName;
	private String lastName;
	private int age;
	private String homeTown;

	public void setAge(int age) {
		this.age = age;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public Student(String firstName, String lastName, int age, String homeTown) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.homeTown = homeTown;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getHomeTown() {
		return this.homeTown;
	}



}
