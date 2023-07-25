//Iterate digits of a number : 123 -> 1 2 3 

import java.lang.*;
import java.util.*;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       
       //for negative num, convert to positive
       if(N < 0){
           N = -1 * N;
       }
       //if num is 0, print 0
       if(N == 0){
           System.out.print(0);
       }
       
       //run loop till N value became less than 0
       while(N>0){
           //Modulo operator (%) used to find the last digit 
           int reminder = N%10;
           //Print last digit
           System.out.print(reminder + " ");
           //Devided by operatoe (/) used to remove the last digit
           N = N/10;
       }
   }   
}