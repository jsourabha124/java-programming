//Student grade system using switch condition
/*
Score	Grade
>=90	A
80-89	B
70-79	C
60-69	D
50-59	E
<50	F
*/

import java.lang.*;
import java.util.*;

public class Main {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       
       int Score = sc.nextInt();
       String grade = null;
       
       switch(Score/10){
           case 10:
           case 9:
                grade = "A";
                break;
           case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            case 5: 
                grade = "E";
                break;
            default:
                grade = "F";
       }
       System.out.println("Score is : " + Score + " and Grade is : " + grade);
       
   }   
}