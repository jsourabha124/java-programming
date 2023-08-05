/*
Display pattern 
1 2 3 2 1
1 2 3 2 1
1 2 3 2 1
1 2 3 2 1
1 2 3 2 1
*/

import java.lang.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //System.out.print(5/2);
        int temp = 1;
        
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(j <= N/2+1){
                    temp =j;
                    System.out.print(temp + " ");
                }else{
                    temp--;
                    System.out.print(temp + " ");
                }
            }
            System.out.println();
        }
    }
}