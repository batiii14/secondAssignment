package secondAssignment;

public class Student extends User{
	String firstName;
	String lastName;
	
	public Student() {
		
		
	}
	
	public Student(String firstName, String lastName) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
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

}
