package instructor;

import categories.Program;

public class Instructor {
	private String name;
	private String lastName;

	public Instructor(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void add(Instructor baseInstructor) {
		System.out.println(baseInstructor.getName());
		System.out.println(baseInstructor.getLastName());
	}
}
