//Find the Power of number in Java : a^b

import java.lang.*;
import java.util.*;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       
       //Math.pow(n1, n2) :-> method take two arguments of double type
       
       //Display in int form
       int pow = (int)Math.pow(num1, num2);
       
       //Display in double form
       //double pow = Math.pow(num1, num2);
       System.out.println(pow);
   }
}