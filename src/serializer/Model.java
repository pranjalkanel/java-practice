package serializer;

import java.io.Serializable;

public class Model implements Serializable{
	
	String name;
	int id;
	int salary;
	String contact;
	
	Model(String name, int id, int salary, String contact){
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.contact = contact;
	}
}
