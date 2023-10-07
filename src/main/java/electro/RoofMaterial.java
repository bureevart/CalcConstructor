package electro;

import java.awt.Color;

public class RoofMaterial extends Material {
	private Color extendedColor;
	
	public RoofMaterial(String name,int id,int price, int color) {
		super(name, id, price);
		extendedColor = new Color(color);
	}
	
	public Color getExtendedColor(){
		return extendedColor; 
	}
	
	public void setExtendedColor(Color extendedColor){
		this.extendedColor = extendedColor; 
	}
}
