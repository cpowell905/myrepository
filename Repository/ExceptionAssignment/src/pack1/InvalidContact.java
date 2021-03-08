package pack1;

public class InvalidContact extends RuntimeException {

	public InvalidContact() {
		super();
	}

	public InvalidContact(final String message) {
		super(message);
	}

}