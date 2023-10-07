/*
 * 
 */
package electro;

import java.awt.Color;

// TODO: Auto-generated Javadoc
/**
 * The Class Calc.
 */
public abstract class Material {
	
	protected String name;
	protected int id;
	protected int price;
	
	public Material(String name,int id,int price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}
	
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public int getId() {
		return id; 
	}

	public int getPrice() {
		return price; 
	}
	
	public void setName(int price) {
		this.price = price; 
	}
}
