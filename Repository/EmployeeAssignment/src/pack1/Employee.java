package pack1;

import pack1.Address;
import pack1.Project;

public class Employee {

	private int id;
	private String name;
	private int age;
	private String email;
	private Project project;
	private Address permAddress;
	private Address presAddress;
	
	public Employee(int id, String name,int age, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public Employee(int id, String name,int age, String email, Project project, Address permAddress, Address presAddress) {
		this(id,name,age,email);//Person(id,name) -> constructor chaining
		this.project = project;
		this.permAddress = permAddress;
		this.presAddress = presAddress;
	}
	
	@Override  //annotation
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age +", email= "+ email + ", project= "+ project + 
				", permAddress=" + permAddress + ", presAddress="+ presAddress + "]";
	}	
	
	
}
