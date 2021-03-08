package pack1;

import pack1.InvalidAge;
import pack1.InvalidContact;
import pack1.Logic;

public class ValidatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final int x=100;
//		x=10;

		Logic v = new Logic();
		try {
			if (v.isAgeValid(36)) {
				System.out.println("Age validated");
			}
		} catch (InvalidAge e) {
			System.out.println(e.getMessage());
		}

		try {
		if (v.isValidMobileNumber("+1-12345678909")) {
			System.out.println("Valid number");
		}
		}catch(InvalidContact e) {
			System.out.println(e.getMessage());
		}

	}

}