package pack1;

public class Logic {
	
	public boolean isAgeValid (int age) throws InvalidAge {
		
		if(age<= 0) {
			throw new InvalidAge("Age cannot be 0 or negative.");
		}
		
		if(age<21 || age > 65) {
			throw new InvalidAge("Users with age between 21 and 65 are only allowed.");
		}
		
		return true;
		
	}
	
	public boolean isValidMobileNumber (String contact) {
		
		if(!contact.matches("\\+1-[0-9]{10}")) {
			throw new InvalidContact("Entered contact: "+ contact + " is invalid.");
		}
		
		return true;
	}

}