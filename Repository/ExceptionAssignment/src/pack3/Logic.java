package pack3;

import pack3.InvalidDLNumber;

public class Logic {
	
	public boolean isDLNumberValid (String n) throws InvalidDLNumber {
		
		if(n.matches("[0-9]{10}")) {
			throw new InvalidDLNumber("Invalid Drivers License Number");
		}
		
		
		return true;
		
	}

}