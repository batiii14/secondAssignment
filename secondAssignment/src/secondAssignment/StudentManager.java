package secondAssignment;

public class StudentManager extends UserManager {
	public void add() {
		
	}
	
	public void submitAssignment(Student student) {
		System.out.println(student.getFirstName()+ " ödevin baþarý ile sisteme yüklendi!");
	}
	
	public void deleteAssignment(Student student) {
		System.out.println(student.getFirstName()+ " ödevin baþarý ile sistemden silindi!");
	}
}
