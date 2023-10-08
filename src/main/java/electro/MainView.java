package electro;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class MainView {
	private JFrame mainFrame;
	private JPanel main_panel;
	private CustomTextfield wallSquareField;
	private CustomTextfield roofCountField;
	private CustomTextfield roofSquareField;
	private CalculateController calculateController;
	private JComboBox<String> wallsComboBox;
	private JButton calculateButton;
	private JButton exitButton;
	private JLabel infoLabel;
	private JLabel inputDataLabel;
	private JLabel wallMaterialLabel;
	private JLabel roofMaterialLabel;
	private JLabel wallSquareLabel;
	private JLabel floorCountLabel;
	private JLabel roofSquareLabel;
	
	JComboBox<String> roofsComboBox;
	
	public MainView() {
		calculateController = new CalculateController();
		
		mainFrame = new JFrame("CalcConstructor");
		mainFrame.setBackground(new Color(255, 255, 224));
		mainFrame.setBounds(500,400,700,400);
		mainFrame.setResizable(false); 
		
		main_panel = new JPanel();
		main_panel.setBackground(new Color(255, 255, 224));
		main_panel.setLayout(null);
		mainFrame.getContentPane().add(main_panel);
		
		wallsComboBox = new JComboBox();
		wallsComboBox.setModel(new DefaultComboBoxModel(BaseData.WallMaterials));
		wallsComboBox.setBounds(184,85,150,30);
		main_panel.add(wallsComboBox);
		
		roofsComboBox = new JComboBox();
		roofsComboBox.setModel(new DefaultComboBoxModel(BaseData.RoofMaterials));
		roofsComboBox.setBounds(529, 85, 150, 30);
		main_panel.add(roofsComboBox);;
		
		calculateButton = new JButton("Расчитать");
		calculateButton.setBackground(new Color(255, 255, 255));
		calculateButton.setBounds(12,311,150,40);
		main_panel.add(calculateButton);
		
		exitButton = new JButton("Выход");
		exitButton.setBackground(new Color(255, 255, 255));
		exitButton.setBounds(588,311,100,40);
		exitButton.addActionListener(new ExitListener()); 
		main_panel.add(exitButton);
		
		infoLabel = new JLabel("Калькулятор расчета стоимости строительства частного дома");
		infoLabel.setBounds(30, 12, 491, 30);
		main_panel.add(infoLabel);
		
		inputDataLabel = new JLabel("Входные данные:");
		inputDataLabel.setBounds(30, 41, 179, 40);
		main_panel.add(inputDataLabel);
		
		wallMaterialLabel = new JLabel("Тип материала стен:");
		wallMaterialLabel.setBounds(30, 93, 165, 15);
		main_panel.add(wallMaterialLabel);
		
		roofMaterialLabel = new JLabel("Тип материала крыши:");
		roofMaterialLabel.setBounds(353, 93, 184, 15);
		main_panel.add(roofMaterialLabel);
		
		wallSquareLabel = new JLabel("Площадь стен:");
		wallSquareLabel.setBounds(30, 148, 114, 15);
		main_panel.add(wallSquareLabel);
		
		floorCountLabel = new JLabel("Количество этажей:");
		floorCountLabel.setBounds(30, 192, 168, 15);
		main_panel.add(floorCountLabel);
		
		roofSquareLabel = new JLabel("Площадь крыши:");
		roofSquareLabel.setBounds(30, 234, 150, 15);
		main_panel.add(roofSquareLabel);
		
		wallSquareField = new CustomTextfield();
		wallSquareField.setBounds(194, 138, 125, 35);
		main_panel.add(wallSquareField);
		wallSquareField.setColumns(10);
		
		roofCountField = new CustomTextfield();
		roofCountField.setColumns(10);
		roofCountField.setBounds(194, 182, 125, 35);
		main_panel.add(roofCountField);
		
		roofSquareField = new CustomTextfield();
		roofSquareField.setColumns(10);
		roofSquareField.setBounds(194, 224, 125, 35);
		main_panel.add(roofSquareField);
		
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		
		mainFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	
	public void showView() {
		mainFrame.setVisible(true);
	}

	private void calculate() {
		int wallSquare = -1;
		 int roofSquare = -1;
		 int floorCount = -1;

		try {
			
			wallSquare = wallSquareField.getValidatedInteger();
			roofSquare = roofSquareField.getValidatedInteger();
			floorCount = roofCountField.getValidatedInteger();

		
			var result = calculateController.calculate(wallSquare, roofSquare, floorCount, (RoofMaterial)roofsComboBox.getSelectedItem(), (WallMaterial)wallsComboBox.getSelectedItem());
		 
		 	if(result != -1)
		 		JOptionPane.showMessageDialog(mainFrame.getContentPane(), "Результат равен: " + result);
		 	else
		 		throw new Exception("Значения вне допустимых пределов!");
		 		
		} catch (Exception ex) {
			 JOptionPane.showMessageDialog(mainFrame.getContentPane(), ex);
			 
			 return;
		}
	}
}
