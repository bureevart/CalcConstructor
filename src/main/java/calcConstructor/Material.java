package calcConstructor;

import java.awt.Color;

public abstract class Material {
	public int maxPrice = 100000;
	public int minPrice = 0;
	
	protected String name;
	protected int id;
	protected int price;
	
	public Material(String name,int id,int price) throws Exception {
		this.name = name;
		this.id = id;
		
		setPrice(price);
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
	
	public void setPrice(int price) throws Exception {
		if(price < minPrice)
			throw new Exception("Цена должна быть больше " + minPrice);
		if(price > maxPrice)
			throw new Exception("Цена должна быть меньше " + maxPrice);
		
		this.price = price;
	}
	
	public void setName(int price) {
		this.price = price; 
	}
	
	/*
	 * To show name in combobox
	 */
	@Override
    public String toString() {
        return this.name;
    }
}
