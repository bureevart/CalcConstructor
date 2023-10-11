package calcConstructor;

import javax.swing.JOptionPane;

public class ExitDialog {
	
	public ExitDialog(String exitHat, String exitLow) {
		int exit = JOptionPane.showConfirmDialog(null,
	            exitHat,
	            exitLow,
	            JOptionPane.YES_NO_OPTION,
	            JOptionPane.WARNING_MESSAGE);
		
		if (JOptionPane.YES_OPTION == exit) 
			System.exit(1);
		
	}

}
