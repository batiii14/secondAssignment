package secondAssignment;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getId() +" id li kullan�c� ba�ar� ile eklendi");
	}
	
	public void login(User user) {
		System.out.println(user.getEmail()+ " Ba�ar� ile sisteme giri� yapt�n!");
	}
	
	public void signUp(User user) {
		System.out.println(user.getEmail() + " Sisteme kayd�n�z yap�lm��t�r");
	}
}
