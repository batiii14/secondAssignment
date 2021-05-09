package secondAssignment;

public class Main {

	public static void main(String[] args) {
		Instructor instructor= new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("abc@gmail.com");
		instructor.setAdress("adana");
		
		
		
		Student student=new Student();
		student.setId(2);
		student.setFirstName("Batun");
		student.setLastName("İDİKURT");
		student.setEmail("123@gmail.com");
		student.setAdress("Mersin");
		
		UserManager userManager=new UserManager();
		userManager.add(student);
		userManager.add(instructor);
		userManager.login(student);
		userManager.signUp(student);
		userManager.login(instructor);
		userManager.signUp(instructor);
		
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addAssignment(instructor);
		instructorManager.checkAttendance(student);
		
		
		StudentManager studentManager=new StudentManager();
		studentManager.submitAssignment(student);
		studentManager.deleteAssignment(student);
				
	}

}
