//Calculate BMI (Body Mass Index)
//BMI = (Weight in Kg) / (Height in Meters * Height in Meters)

import java.lang.*;
import java.util.*;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       
       double height = sc.nextDouble();
       double weight = sc.nextDouble();
       
       double BMI = (weight)/(height * height);
       String category = "";
       //System.out.println(BMI);
       
       if(BMI < 18.5){
          category = "Thinness";
       }else if(BMI >= 18.5 && BMI < 25){
          category = "Normal";
       }else if(BMI >= 25 && BMI < 30){
          category = "Overweight";
       }else{
          category = "Obese";
       }
       System.out.println("BMI is : " + BMI + " & category is: " + category);
   }   
}