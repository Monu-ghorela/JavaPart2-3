package userDefinedExceptions;

public class InvalidPassword extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return " password is not correct";
	}

}
