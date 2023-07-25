//HCF of two numbers

import java.lang.*;
import java.util.*;

public class Main {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        /*
        GCD : The highest common factor (HCF) of two or more numbers is the greatest number which divides each of them exactly.
        Greatest Common Measure(GCM) and Greatest Common Divisor(GCD) are the other terms used to refer to HCF.
        
        24 : 1 2 3 4 6 8 12 24
        36 : 1 2 3 4 6 9 12 18 36 -> GCD : 12
        */
        
        int min = num1 > num2 ? num2 : num1;
        int ans = 0;
        for(int i=1; i<=min; i++){
             if(num1%i==0 && num2%i==0){
                  ans = i;
                  //break;
             }
        }
        System.out.print("GCD of " + num1 + " & " + num2 + " = " + ans);
   }   
}