//Check If Array Is Strictly Decreasing

import java.lang.*;
import java.util.*;
/*
You are given an integer array A. Now your task is to find the inverse of A.
Now, the inverse of the array is A will be an array in which we change the
positions of the values as their indices and indices as values.

So, array A = [2, 0, 1]
- Now 2 is at index 0. So, place 0 at index 2.
- 0 is at index 1. So, place 1 at index 0.
- 1 is at index 2. So, place 2 at index 1.

So, the inverse of A will be [1, 2, 0]
*/



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int newarr[] = new int[N];
        //assign user input to arr
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        
        //logic
        for(int i=0; i<N; i++){
            newarr[arr[i]] = i;
        }
        //Display new array value
        for(int i=0; i<N; i++){
            System.out.print(newarr[i] + " ");
        }
    
    }
}