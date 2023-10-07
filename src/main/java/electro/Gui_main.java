package electro;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class Gui_main {
	//tmp
	//valentine commit
	private JComboBox<String> wallsComboBox;
	private JLabel labelTarif1 = new JLabel("111:");
	private JLabel labelTarif2d = new JLabel("222:");
	private JLabel labelTarif2n = new JLabel("333:");
	private JLabel TextOutput = new JLabel("");
	private JTextField ElectroData = new JTextField(10);
	private JTextField ElectroData1 = new JTextField(10);
	private JTextField ElectroData2 = new JTextField(10);
	private String[] transfer = {"444", "555", "666"};
	private JLabel[] arrayLabel= {labelTarif1,labelTarif2d,labelTarif2n};
	private JTextField[] arrayTextField = {ElectroData,ElectroData1,ElectroData2};
	private JFrame main_GUI;
	private JPanel main_panel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public Gui_main(String name, String label) {
		main_GUI = new JFrame("Electro");
		main_GUI.setBackground(new Color(255, 255, 224));
		main_GUI.setTitle ("");
		main_GUI.setBounds(500,400,704,388);
		main_GUI.setResizable(false); 
		
		main_panel = new JPanel();
		main_panel.setBackground(new Color(255, 255, 224));
		main_panel.setLayout(null);
		main_GUI.getContentPane().add(main_panel);
		
		
		wallsComboBox = new JComboBox<String>(transfer);
		wallsComboBox.setModel(new DefaultComboBoxModel(new String[] {"Кирпич", "Брус", "Шлакоблок"}));
		wallsComboBox.setBounds(184,85,150,30);
		main_panel.add(wallsComboBox);
		
		JComboBox<String> roofsComboBox = new JComboBox();
		roofsComboBox.setModel(new DefaultComboBoxModel(new String[] {"Кирпич", "Брус", "Шлакоблок"}));
		roofsComboBox.setBounds(529, 85, 150, 30);
		main_panel.add(roofsComboBox);;
		
		JButton button_create = new JButton("Расчитать");
		button_create.setBackground(new Color(255, 255, 255));
		button_create.setBounds(30,288,150,40);
		main_panel.add(button_create);
		
		JButton button_exit = new JButton("Выход");
		button_exit.setBackground(new Color(255, 255, 255));
		button_exit.setBounds(568,288,100,40);
		ActionListener actionListener = new ListenerButton();
		button_exit.addActionListener(actionListener); 
		main_panel.add(button_exit);
		
		JLabel lblNewLabel = new JLabel("Калькулятор расчета стоимости строительства частного дома");
		lblNewLabel.setBounds(30, 12, 491, 30);
		main_panel.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("Входные данные:");
		label_1.setBounds(30, 41, 179, 40);
		main_panel.add(label_1);
		
		JLabel label_2 = new JLabel("Тип материала стен:");
		label_2.setBounds(30, 93, 165, 15);
		main_panel.add(label_2);
		
		JLabel lblNewLabel_1 = new JLabel("Тип материала крыши:");
		lblNewLabel_1.setBounds(353, 93, 184, 15);
		main_panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Площадь стен:");
		lblNewLabel_2.setBounds(30, 148, 114, 15);
		main_panel.add(lblNewLabel_2);
		
		JLabel label_3 = new JLabel("Количество этажей:");
		label_3.setBounds(30, 192, 168, 15);
		main_panel.add(label_3);
		
		JLabel label_4 = new JLabel("Площадь крыши:");
		label_4.setBounds(30, 234, 150, 15);
		main_panel.add(label_4);
		
		textField = new JTextField();
		textField.setBounds(194, 138, 125, 35);
		main_panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(194, 182, 125, 35);
		main_panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(194, 224, 125, 35);
		main_panel.add(textField_2);
		
		main_GUI.setVisible(true);
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public JPanel getPanel() {
		return main_panel;
	}
	
	public JLabel[] getLabel() {
		return arrayLabel;
	}
	public JTextField[] getTextField() {
		return arrayTextField;
	}
	
	public String[] getTransfer() {
		return transfer;
	}
	
	public JLabel getLabelOutput() {
		return TextOutput;
	}
	
	public JComboBox<String> getComboTarif() {
		return wallsComboBox;
	}
}
