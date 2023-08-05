//Pair count

import java.lang.*;
import java.util.*;
/*
You are given an integer array A and an integer B.
You are required to print count of pairs having sum equal to B.
NOTE: pair (i,j) and (j,i) are same.

A = [1,2,3,2,1]
B = 5
ans = 2
*/

public class Main {
    static int pairCount(int[] arr, int B){
        int size = arr.length;
        int count = 0;
        for(int i=1; i<size; i++){
            for(int j=0; j<i; j++){
                if(arr[i] + arr[j] == B){
                    count++;
                }
            }
        } 
        return count;  
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        int arr[] = new int[N];
        
        //assign user input to arr
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        
        int count = pairCount(arr, B);
        
        System.out.print("Count pair : " + count);
    
    }
}