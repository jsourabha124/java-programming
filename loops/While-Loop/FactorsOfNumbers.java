//Find Factors of a Number in Java
/*A number which divides completely the number “N” is called the factor of the number “N”.
For example:- the numbers 1, 2, 3, 4, 6 and 12 are complete divides the number 12
so they are called the factor of 12. 
Completly divisible means when we divide the number then it gives result zero.*/

import java.lang.*;
import java.util.*;

public class Main {
   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        if(N>0){
             while(i<=N){
             if(N%i == 0){
                  System.out.print(i + " ");
             }
             i++;
          }
        }else{
             System.out.print("Enter Positive number");
        }
        
   }   
}