
package GUI_Calculator_Project;

//import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeometricCalculatorUI extends JFrame {
    private JComboBox<String> shapeComboBox;
    private JTextField widthField;
    private JTextField heightField;
    private JTextField radiusField;
    private JLabel resultLabel;
    private JCheckBox AcheckBox;
    private JCheckBox PcheckBox;
    
    public GeometricCalculatorUI() {
        
        setTitle("Geometric Calculator");
        setSize(400, 150);     
        setLocation(600, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        AcheckBox=new JCheckBox("Area",true);
        PcheckBox=new JCheckBox("Perimeter",true);
        shapeComboBox = new JComboBox<>(new String[]{"Select Field","Circle", "Rectangle", "Square"});
        widthField = new JTextField();
        heightField = new JTextField();
        radiusField = new JTextField();
        resultLabel = new JLabel();
        
        JButton calculateButton = new JButton("Calculate and Display");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("");
                calculateAndDisplay();
            }
        });
   
        
        //Layout
        BoxLayout boxLayout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
        setLayout(boxLayout);
        
        JLabel[] arr=new JLabel[5];
        
        //shapeBox.actions
         shapeComboBox.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e ){
              
        shapeComboBox.setBackground(Color.BLACK);
        shapeComboBox.setForeground(Color.WHITE);
        show(true);
        
if(((String)(shapeComboBox.getSelectedItem())).equals("Rectangle") ){
    
if(heightField.isValid()){remove(heightField);remove(widthField);remove(arr[2]);remove(arr[1]);}
else if(widthField.isValid()){remove(widthField);remove(arr[1]);}
if(radiusField.isValid()){remove(radiusField);remove(arr[3]);}
   
    resultLabel.setText("");
    add(arr[1]=new JLabel("Width:"),2);
    add(widthField,3);
    add(arr[2]=new JLabel("Height:"),4);
    add(heightField,5);
    heightField.setText("");
    widthField.setText("");
    setSize(400, 250);
    show(true); 
}

else if(((String)(shapeComboBox.getSelectedItem())).equals("Square") ){
   if(heightField.isValid()){remove(heightField);remove(widthField);remove(arr[2]);remove(arr[1]);}
   else if(widthField.isValid()){remove(widthField);remove(arr[1]);}
   if(radiusField.isValid()){remove(radiusField);remove(arr[3]);}
   
    resultLabel.setText("");
    add(arr[1]=new JLabel("Side:"),2);
    add(widthField,3);
    widthField.setText("");
    setSize(400, 205);
    show(true);    
}

else if(((String)(shapeComboBox.getSelectedItem())).equals("Circle") ){
   if(heightField.isValid()){remove(heightField);remove(widthField);remove(arr[2]);remove(arr[1]);}
   else if(widthField.isValid()){remove(widthField);remove(arr[1]);}
   if(radiusField.isValid()){remove(radiusField);remove(arr[3]);}
    
    resultLabel.setText("");
    add(arr[3]=new JLabel("Radius:"),2);
    add(radiusField,3);
    radiusField.setText("");
    setSize(400, 205);
    show(true);
      }
    
   else {
      if(heightField.isValid()){remove(heightField);remove(widthField);remove(arr[2]);remove(arr[1]);}
      else if(widthField.isValid()){remove(widthField);remove(arr[1]);}
      if(radiusField.isValid()){remove(radiusField);remove(arr[3]);}
      setSize(400, 150);
        }
   show(true);
    }
    });
         
        
        add(arr[0]=new JLabel("Select Shape:"));
        add(shapeComboBox);
        add(AcheckBox);
        add(PcheckBox);
        calculateButton.setBackground(Color.CYAN);
        calculateButton.setForeground(Color.BLACK);
        add(calculateButton);
        add(resultLabel);
        //pack();
        setVisible(true);
        
    }

    private void calculateAndDisplay() {
             String selectedShape = (String) shapeComboBox.getSelectedItem();
try {
     if (selectedShape.equals("Circle")) {
                if(radiusField.getText().contains("-")){radiusField.setText("");}
                double radius = Double.parseDouble(radiusField.getText());
                Circle circle = new Circle(Math.abs(radius),"RED",true);
                displayResults(circle);
            } 
    else if (selectedShape.equals("Rectangle")) {
                if(widthField.getText().contains("-")){widthField.setText("");}
                if(heightField.getText().contains("-")){heightField.setText("");}
                double width = Double.parseDouble(widthField.getText());
                double height = Double.parseDouble(heightField.getText());
                Rectangle rectangle = new Rectangle(Math.abs(width), Math.abs(height));
                displayResults(rectangle);
            } 
    else if (selectedShape.equals("Square")) {
                if(widthField.getText().contains("-")){widthField.setText("");}
                double side = Double.parseDouble(widthField.getText()); // Using width for square
                Square square = new Square(Math.abs(side),"Red",true);
                displayResults(square);
            }
        } catch (NumberFormatException e ) {
            if(widthField.isValid()){widthField.setText("");}
            if(heightField.isValid()){heightField.setText("");}
            if(radiusField.isValid()){radiusField.setText("");}
            resultLabel.setText("Invalid input. Please enter valid numeric values.");
        }
        
    }
    
    private void displayResults(GeometricObject geometricObject) {
        double area = geometricObject.getArea();
        double perimeter = geometricObject.getPerimeter();
        if(AcheckBox.isSelected()&&PcheckBox.isSelected()){resultLabel.setText("Area: " + area+", Perimeter: " + perimeter );}
        else if(AcheckBox.isSelected()){resultLabel.setText("Area: " + area );}
        else if(PcheckBox.isSelected()){resultLabel.setText("Perimeter: " + perimeter);} 
        show(true);
    }
    
     
}