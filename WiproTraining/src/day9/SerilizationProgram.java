package day9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable{
	private String name;
	private int age ;
	public A(String name , int age ) {
		super();
		this.age=age;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public A() {
		super();
	}
	
}
public class SerilizationProgram {
	public static void main(String[] args) throws IOException {
		A obj= new A();
		obj.setAge(89);
		obj.setName("Bhagyashri");
		
		FileOutputStream out = new FileOutputStream("C:\\Users\\Bhagyashri Chame\\Documents\\File1.txt");
		ObjectOutputStream output = new ObjectOutputStream(out);
		
		output.writeObject(obj);
		out.close();
		output.close();
	    System.out.println("Object has been serialized to File.txt");
	}

}