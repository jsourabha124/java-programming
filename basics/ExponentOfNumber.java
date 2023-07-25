//Find the Exponents in Java : e^a

import java.lang.*;
import java.util.*;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       
       int N = sc.nextInt();
       double exp = Math.exp(N);
       //Exponent of number calculated using : Math.exp(num)
       System.out.println(exp);
   }
}