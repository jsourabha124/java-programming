//LCM of two numbers

import java.lang.*;
import java.util.*;

public class Main {
   public static void main(String args[]) {
        
        /*
        LCM : Least or lowest common multiple (LCM) of two integers a and b is the smallest positive number that is divisible by both a and b.
        Example:- LCM of 12 and 15 is 60 because 60 is divisible by both 12 and 15.
        Java Program to Find LCM of Two Numbers
        */
        Scanner sc = new Scanner(System.in);
        //read num1 and num2
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        //find the max numbers among two
        int max = num1 > num2 ? num1 : num2;
        int ans = 0;
        
        //Run loop from max num to (num1*num2)
        for(int i = max; i<=(num1*num2); i++){
             //if modulo of num1 and num2 is zero, LCM will be i
             if(i%num1 == 0 && i%num2==0){
                  ans = i;
                  break;
             }
        }
        System.out.print("LCM of " + num1 + " & " + num2 + " is: " + ans);
   }   
}