package secondAssignment;

public class InstructorManager extends UserManager {
	public void add() {
		
	}
	
	public void addAssignment(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " verdi�in �dev ��renciler i�in sisteme y�klendi!");
	}
	
	public void checkAttendance(Student student) {
		System.out.println(student.getFirstName()+" " + student.getLastName() + " Bug�n dersine kat�ld�!");
	}
}
