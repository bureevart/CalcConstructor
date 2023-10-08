package electro;

import java.util.ArrayList;
import java.util.List;

public class BaseData {
	final static int wallCount = 3;
	final static int roofCount = 3;
	
	public static RoofMaterial[] RoofMaterials = new RoofMaterial[roofCount];
	public static WallMaterial[] WallMaterials = new WallMaterial[wallCount];
	
	public static void seedData() throws Exception {
		clearData();
		
		WallMaterials[0] = new WallMaterial(1, "Кирпич", 5000, 60);
		WallMaterials[1] = new WallMaterial(1, "Дерево", 3000, 50);
		WallMaterials[2] = new WallMaterial(1, "Бетон", 4000, 100);
		
		RoofMaterials[0] = new RoofMaterial(1, "Кирпич", 5000, 0xA30000);
		RoofMaterials[1] = new RoofMaterial(1, "Дерево", 3000, 0x420000);
		RoofMaterials[2] = new RoofMaterial(1, "Черепица", 6000, 0x820000);
	}
	
	private static void clearData() {
		RoofMaterials = new RoofMaterial[roofCount];
		WallMaterials = new WallMaterial[wallCount];
	}
}
