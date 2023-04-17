package page;

public class LoginPage extends RegisterPage {

	private String password = createAPassword;

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

}
