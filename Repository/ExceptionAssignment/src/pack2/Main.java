package pack2;

import pack2.InvalidPassportNumber;

public class Main {
	public static void main(String[] args) {

		Logic b = new Logic();
		try {
			b.isPassportNumberValid(null);
			
		} catch (InvalidPassportNumber e) {
			System.out.println(e.getMessage());
		}

		
	}

}