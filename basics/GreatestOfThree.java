//Find the Greatest of 3 numbers

import java.lang.*;
import java.util.*;

public class Main {
   public static void main(String args[]) {
       //Read input from custom input
       Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       int B = sc.nextInt();
       int C = sc.nextInt();
       
       if(A>B && A>C){
           System.out.print("A=" + A + " is greater");
       }else if(B>C){
           System.out.print("B=" + B + " is greater");
       }else{
           System.out.print("C=" + C + " is greater");
       }
   }
}