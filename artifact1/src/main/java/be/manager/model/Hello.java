package be.manager.model;
/**
 * 
 * TGU
 *
 */


public class Hello {
	private String name;
 
	public void setName(String name) {
		this.name = name;
	}
 
	public void printHello() {
		System.out.println("Hello ! " + name);
	}
}