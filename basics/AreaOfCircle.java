//Find the Area of circle : area = Pi * r^2

import java.lang.*;
import java.util.*;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       
       int R = sc.nextInt();
       
       //area of circle
       //Math.PI used to get PI value and Math.pow() used for r^2
       double area = Math.PI * Math.pow(R, 2);
       
       System.out.println(area);       
   }
       
}