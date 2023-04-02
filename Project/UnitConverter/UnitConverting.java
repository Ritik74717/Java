package unitconvert;
import javax.swing.*;
import java.awt.event.*;

public class UnitConverting {
    private JFrame frame;
    private JLabel inputLabel;
    private JTextField inputText;
    private JComboBox<String> fromUnit;
    private JLabel outputLabel;
    private JTextField outputText;
    private JComboBox<String> toUnit;
    private JButton convertButton;


    public void initComponenets(){

        frame=new JFrame("Unit-Converter");
        inputLabel=new JLabel("Input :");
        inputText=new JTextField();
        fromUnit=new JComboBox<String>(new String[]{"Meters","Feet","Inches","Centimeters"});
        outputLabel=new JLabel("Output :");
        outputText=new JTextField();
        outputText.setEditable(false);
        toUnit=new JComboBox<String>(new String[]{"Meters","Feet","Inches","Centimeters"});
        convertButton=new JButton("Convert");
        frame.setVisible(true);
        frame.setSize(400,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        inputLabel.setBounds(20,20,100,20);
        inputText.setBounds(150,20,100,20);
        fromUnit.setBounds(270,20,100,20);
        outputLabel.setBounds(20,50,100,20);
        outputText.setBounds(150,50,100,20);
        toUnit.setBounds(270,50,100,20);
        convertButton.setBounds(150,80,100,20);
        frame.add(inputLabel);
        frame.add(inputText);
        frame.add(fromUnit);
        frame.add(outputLabel);
        frame.add(outputText);
        frame.add(toUnit);
        frame.add(convertButton);
        convertButton.addActionListener(new ButtonListener());


    }
    public UnitConverting(){
        initComponenets();
    }
    public class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double inputType=Double.parseDouble(inputText.getText());
            String fromUnitType=fromUnit.getSelectedItem().toString();
            double outputType=0.0;
            String toUnitType=toUnit.getSelectedItem().toString();
            if(fromUnitType.equals("Meters")){
                 if(toUnitType.equals("Meters")){
                     outputType=UnitConverting.meterToMeters(inputType);
                 }
                 else if(toUnitType.equals("Centimeters")){
                     outputType=UnitConverting.meterToCentimeters(inputType);
                 }
                 else if(toUnitType.equals("Feet")){
                     outputType=UnitConverting.meterToFeets(inputType);
                 }
                 else if(toUnitType.equals("Inches")){
                     outputType=UnitConverting.meterToInches(inputType);
                 }

            }
            else if(fromUnitType.equals("Feet")){
                if(toUnitType.equals("Meters")){
                    outputType=UnitConverting.feetToMeters(inputType);
                }
                else if(toUnitType.equals("Centimeters")){
                    outputType=UnitConverting.feetToCentimeters(inputType);
                }
                else if(toUnitType.equals("Feet")){
                    outputType=UnitConverting.feetToFeet(inputType);
                }
                else if(toUnitType.equals("Inches")){
                    outputType=UnitConverting.feetToInches(inputType);
                }

            }
            else if(fromUnitType.equals("Inches")){
                if(toUnitType.equals("Meters")){
                    outputType=UnitConverting.inchesToMeters(inputType);
                }
                else if(toUnitType.equals("Centimeters")){
                    outputType=UnitConverting.inchesToCentimeters(inputType);
                }
                else if(toUnitType.equals("Feet")){
                    outputType=UnitConverting.inchesToFeet(inputType);
                }
                else if(toUnitType.equals("Inches")){
                    outputType=UnitConverting.inchesToInches(inputType);
                }

            }
            else if(fromUnitType.equals("Centimeters")){
                if(toUnitType.equals("Meters")){
                    outputType=UnitConverting.centimetersToMeters(inputType);
                }
                else if(toUnitType.equals("Centimeters")){
                    outputType=UnitConverting.centimetersToCentimeters(inputType);
                }
                else if(toUnitType.equals("Feet")){
                    outputType=UnitConverting.centimetersToFeet(inputType);
                }
                else if(toUnitType.equals("Inches")){
                    outputType=UnitConverting.centimetersToInches(inputType);
                }
            }
            outputText.setText(""+outputType);
        }
    }

    public static double meterToMeters(double inputValue){
        double outputValue;
        outputValue=inputValue;
        return outputValue;
    }
    public static double meterToFeets(double inputValue){
        double outputValue;
        outputValue=inputValue*3.28084;
        return outputValue;
    }
    public static double meterToInches(double inputValue){
        double outputValue;
        outputValue=inputValue*3.28084*12;
        return outputValue;
    }
    public static double meterToCentimeters(double inputValue){
        double outputValue;
        outputValue=inputValue*100;
        return outputValue;
    }
    public static double feetToMeters(double inputValue){
        double outputValue;
        outputValue=inputValue/3.28084;
        return outputValue;
    }
    public static double feetToCentimeters(double inputValue){
        double outputValue;
        outputValue=inputValue/3.28084*100;
        return outputValue;
    }
    public static double feetToFeet(double inputValue){
        double outputValue;
        outputValue=inputValue;
        return outputValue;
    }
    public static double feetToInches(double inputValue){
        double outputValue;
        outputValue=inputValue*12;
        return outputValue;
    }
    public static double inchesToMeters(double inputValue){
        double outputValue;
        outputValue=inputValue/12/3.28084;
        return outputValue;
    }
    public static double inchesToCentimeters(double inputValue){
        double outputValue;
        outputValue=inputValue/12/3.28084*100;
        return outputValue;
    }
    public static double inchesToFeet(double inputValue){
        double outputValue;
        outputValue=inputValue/12;
        return outputValue;
    }
    public static double inchesToInches(double inputValue){
        double outputValue;
        outputValue=inputValue;
        return outputValue;
    }
    public static double centimetersToMeters(double inputValue){
        double outputValue;
        outputValue=inputValue/100;
        return outputValue;
    }
    public static double centimetersToCentimeters(double inputValue){
        double outputValue;
        outputValue=inputValue;
        return outputValue;
    }
    public static double centimetersToFeet(double inputValue){
        double outputValue;
        outputValue=inputValue/100*3.28084;
        return outputValue;
    }
    public static double centimetersToInches(double inputValue){
        double outputValue;
        outputValue=inputValue/100*3.28084*12;
        return outputValue;
    }

}
