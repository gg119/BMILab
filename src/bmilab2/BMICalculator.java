/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmilab2;
import java.io.PrintStream;
import java.math.*;
/**
 *
 * @author gg119
 */
public class BMICalculator {
    double feet;
    double inches;
    double pounds;
    
    public BMICalculator(double feet, double inches, double pounds){
        this.feet = feet;
        this.inches = inches;
        this.pounds = pounds;
    }
    
    public double calculateBMI(){
        double fInches = (feet * 12) + inches;
        double weight = (pounds*703);
        
        double bmi = (weight / (fInches*fInches));
        PrintStream bmi1 = System.out.printf("%.2f", bmi);

        return bmi;
        
    }
    
    
}
