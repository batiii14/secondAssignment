package secondAssignment;

public class StudentManager extends UserManager {
	public void add() {
		
	}
	
	public void submitAssignment(Student student) {
		System.out.println(student.getFirstName()+ " �devin ba�ar� ile sisteme y�klendi!");
	}
	
	public void deleteAssignment(Student student) {
		System.out.println(student.getFirstName()+ " �devin ba�ar� ile sistemden silindi!");
	}
}
