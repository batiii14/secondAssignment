package secondAssignment;

public class InstructorManager extends UserManager {
	public void add() {
		
	}
	
	public void addAssignment(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " verdiðin ödev öðrenciler için sisteme yüklendi!");
	}
	
	public void checkAttendance(Student student) {
		System.out.println(student.getFirstName()+" " + student.getLastName() + " Bugün dersine katýldý!");
	}
}
