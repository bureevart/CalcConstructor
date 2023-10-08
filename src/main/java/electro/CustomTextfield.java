package electro;

import javax.swing.JTextField;

public class CustomTextfield extends JTextField {
	
	public int getValidatedInteger() throws Exception {
		var text = this.getText();
		int intVal = -1;
		try {
			intVal = Integer.parseInt(text);
		} catch (Exception ex) {
			throw new Exception("Ошибка валидации!");
		}
		
		return intVal;
	}
}
