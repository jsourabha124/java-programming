//ava Program to Find Square Root of a Number
/*
Parameter type:- double
Return type:- double
Return value:- the positive square root of argument.
*/
import java.lang.*;
import java.util.*;

public class Main {
   public static void main(String args[]) {
        
        /*
        square root :  find the square root of a number using the sqrt() method of java.lang.Math class
        */
        
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double ans = Math.sqrt(N);
        System.out.print(ans);
   }   
}