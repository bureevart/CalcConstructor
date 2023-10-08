package electro;

public class Main {
	
	protected static  Gui_main gui;
	public static void main(String[] args) {
		BaseData.seedData();
		
		gui = new Gui_main();
	}

}
