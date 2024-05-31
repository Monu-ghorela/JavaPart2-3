package encapsualtion;

public class User {

	private int user_id;
	private String user_pass;
	private String user_name;

	public User(int user_id,String user_pass,String user_name) {
		this.user_id=user_id;
		this.user_pass=user_pass;
		this.user_name=user_name;
		
	}
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_nameString) {
		this.user_name = user_nameString;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

}
