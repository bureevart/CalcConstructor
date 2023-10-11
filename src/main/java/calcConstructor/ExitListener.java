package calcConstructor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String exitHat = "Вы уверены что хотите выйти?";
		String exitLow = "Выход из программы";
		
		new ExitDialog(exitHat, exitLow);
	}

}
