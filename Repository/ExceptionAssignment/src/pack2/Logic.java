package pack2;

import pack2.InvalidPassportNumber;

public class Logic {
	
	public boolean isPassportNumberValid (String n) throws InvalidPassportNumber {
		
		if(n.matches("[0-9]{9}")) {
			throw new InvalidPassportNumber("Invalid Passport Number");
		}
		
		
		return true;
		
	}

}