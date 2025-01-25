package databasepoc;

public class CUser {
	
	
	
	
	
	 
	public CUser(String username, String password, String email, int pincode) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.pincode = pincode;
	}
	public CUser() {
	// TODO Auto-generated constructor stub
	}
	private String username,password,email;
	private int pincode;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "CUser{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				", pincode=" + pincode +
				'}';
	}
}
