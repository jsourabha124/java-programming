//Simple calculator program in Java using switch case

import java.lang.*;
import java.util.*;

public class Main {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String ope = sc.next(); //Read opertaors + - * / % ^
        
        //Based on operator case will execute
        switch(ope){
            case "+":
               System.out.println("Addition " + (A+B));
               break;
            case "-":
               System.out.println("Subtraction " + (A-B));
               break;
            case "*":
               System.out.println("Multiplication " + (A*B));
               break;
            case "/":
               System.out.println("Devided " + (A/B));
               break;
            case "%":
               System.out.println("Modulo " + (A%B));
               break;
            case "^":
               System.out.println("Power of " + (int)Math.pow(A, B));
               break;
        }
   }   
}