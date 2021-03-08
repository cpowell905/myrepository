package pack3;

import pack3.InvalidDLNumber;
import pack3.Logic;

public class Main {
	
	
		public static void main(String[] args) {

			Logic b = new Logic();
			try {

				if (!b.isDLNumberValid("1234567891")) {
					System.out.println("DL Number validated.");
				}
			} catch (InvalidDLNumber e) {
				System.out.println(e.getMessage());
			}

			
		}

	

}
