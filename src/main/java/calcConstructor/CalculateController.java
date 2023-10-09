package calcConstructor;

public class CalculateController implements IController {

	@Override
	public long calculate(int wallMaterialSquare, int roofMaterialSquare, int floorCount, RoofMaterial roofMaterial, WallMaterial wallMaterial) {
		Boolean isValid = validate(wallMaterialSquare, roofMaterialSquare, floorCount);
		
		if(!isValid)
			return -1;
		
		int result = wallMaterialSquare * wallMaterial.getPrice() * floorCount + roofMaterialSquare * roofMaterial.getPrice();
		
		if(result < 0)
			return -1;
		
		return result;
	}
	
	public Boolean validate(int wallMaterialSquare, int roofMaterialSquare, int floorCount) {
		return !(wallMaterialSquare <= 0 || roofMaterialSquare <= 0 || floorCount <= 0) ;
	}
}
