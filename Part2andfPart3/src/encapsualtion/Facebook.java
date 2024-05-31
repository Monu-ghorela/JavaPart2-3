package encapsualtion;

public class Facebook {

	User user;

	public Facebook(User user) {
		this.user = user;

	}

	public static void main(String[] args) {

		Facebook facebook = new Facebook(new User(1, "username", "user_pass"));
		System.out.println("the inforamtion of user ");
		System.out.println(facebook.user.getUser_id());
		System.out.println(facebook.user.getUser_name());
		facebook.user.setUser_name("akhil");
		facebook.user.setUser_pass("Akhil@2024");
		System.out.println("the updated inforamtion of user is ");
		System.out.println(facebook.user.getUser_id());
		System.out.println(facebook.user.getUser_name());

	}

}
