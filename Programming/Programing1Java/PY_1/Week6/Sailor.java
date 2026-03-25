package Week6;

public class Sailor {
	private String name;
	private String email;
	
	public Sailor(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
