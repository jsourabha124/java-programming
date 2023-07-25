//Leap Year Program in Java Using If-Else : 
/*
A year is called a leap year 
if the year is divisible by four, except for the years which are divisible by 100 but not divisible by 400. 
Therefore, the year 2000 was a leap year, but the years 1700, 1800, and 1900 were not.
*/

import java.lang.*;
import java.util.*;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int year = sc.nextInt();
       
       /*
        1. It is evenly divisible by 100
        2. If it is divisible by 100, then it should also be divisible by 400
        3. Except this, all other years evenly divisible by 4 are leap years.
       */
       if((year%4==0) && year%100 != 0 || year%400 ==0 ){
            System.out.println("Leap year");
       }else{
            System.out.println("Not Leap year");   
       }
   }   
}