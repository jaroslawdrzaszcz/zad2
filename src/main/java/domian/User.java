package domian;

public class User {
	private String username;
	private String password;
	private String email;
	private Right right;
	
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
	public Right getRight() {
		return right;
	}
	public void setRight(Right right) {
		this.right = right;
	}
}
