package pack1;

import pack1.Employee;
import pack1.Address;
import pack1.Project;

public class EmployeeMain {
	
public static void main(String[] args) {
	
		Address a1=new Address(1600, "Pennsylvania Ave", "Washington", "DC", 20500);
		Address a2=new Address(1066, "Barley Mill Ln", "Wilmington", "NC", 19807);
		Address a3=new Address(1100, "S Ocean Blvd", "West Palm", "FL", 33480);
		Address a4=new Address(60615, "S Greenwood Ave", "Chicago", "IL", 60615);
	
		Project pro1=new Project(46, "Unite", "China");
		Project pro2=new Project(1, "MAGA", "Q");
		Project pro3=new Project(420, "Change", "Banks");
		
		Employee p1=new Employee(46, "Joe", 78, "unclejoe@whitehouse.gov", pro1, a1, a2);
		System.out.println(p1);
		
		Employee p2=new Employee(45, "Donald", 74, "maga@gmail.com", pro2, a3, a3);
		System.out.println(p2);
		
		Employee p3=new Employee(44, "Barack", 59, "change2008@yahoo.com", pro3, a4, a4);
		System.out.println(p3);
				
		
	}

}
