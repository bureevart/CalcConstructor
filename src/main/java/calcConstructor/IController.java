package calcConstructor;

public interface IController {
	public long calculate(int wallMaterialSquare, int roofMaterialSquare, int floorCount, RoofMaterial roofMaterial, WallMaterial wallMaterial);
	
	public Boolean validate(int wallMaterialSquare, int roofMaterialSquare, int floorCount);
}
