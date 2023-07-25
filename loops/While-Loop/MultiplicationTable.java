//Multiple of Table : 2 x 1 = 2 format

import java.lang.*;
import java.util.*;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int i = 1;
       while(i <= 10){
            System.out.println(N + " x " + i + " = " + + (N*i));
            i++;
       }
   }   
}