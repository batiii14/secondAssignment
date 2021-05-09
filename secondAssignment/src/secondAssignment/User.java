package secondAssignment;

public class User {
	int id;
	String email;
	String adress; 
	public User() {
		
		
	}
	
	public User(int id, String email, String adress) {
		this();
		this.id = id;
		this.email = email;
		this.adress = adress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
}
