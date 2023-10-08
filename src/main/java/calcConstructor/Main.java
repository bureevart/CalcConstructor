package calcConstructor;

public class Main {
	
	protected static  MainView gui;
	public static void main(String[] args) throws Exception {
		
		try {
			BaseData.seedData();
		
			gui = new MainView();
			
			gui.showView();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
