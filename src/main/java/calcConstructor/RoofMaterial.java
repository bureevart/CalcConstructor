package calcConstructor;

import java.awt.Color;

public class RoofMaterial extends Material {
	private Color extendedColor;
	
	public RoofMaterial(int id, String name, int price, int color) throws Exception {
		super(name, id, price);
		extendedColor = new Color(color);
	}
	
	public Color getExtendedColor() {
		return extendedColor; 
	}
	
	public void setExtendedColor(Color extendedColor) {
		this.extendedColor = extendedColor; 
	}
}
