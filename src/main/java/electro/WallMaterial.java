package electro;

import java.awt.Color;

public class WallMaterial extends Material {
	private int lifetime;
	
	public WallMaterial(String name,int id,int price, int lifetime) {
		super(name, id, price);
		this.lifetime = lifetime;
	}
	
	public int getlifetime(){
		return lifetime; 
	}
	
	public void setName(int lifetime){
		this.lifetime = lifetime; 
	}
}
