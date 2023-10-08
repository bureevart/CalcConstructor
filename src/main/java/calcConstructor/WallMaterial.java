package calcConstructor;

import java.awt.Color;

public class WallMaterial extends Material {
	private int lifetime;

	public WallMaterial(int id, String name, int price, int lifetime) throws Exception {
		super(name, id, price);
		this.lifetime = lifetime;
	}

	public int getlifetime() {
		return lifetime;
	}

	public void setName(int lifetime) {
		this.lifetime = lifetime;
	}
}
