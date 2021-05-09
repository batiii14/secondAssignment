package secondAssignment;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getId() +" id li kullanýcý baþarý ile eklendi");
	}
	
	public void login(User user) {
		System.out.println(user.getEmail()+ " Baþarý ile sisteme giriþ yaptýn!");
	}
	
	public void signUp(User user) {
		System.out.println(user.getEmail() + " Sisteme kaydýnýz yapýlmýþtýr");
	}
}
