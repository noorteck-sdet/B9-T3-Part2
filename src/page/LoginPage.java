package page;

abstract public class LoginPage implements RegisterPage {

	private String user = RegisterPage.userName;
	private String password = RegisterPage.createAPassword;

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}
