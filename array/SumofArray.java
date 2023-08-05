//Sum of Array in Java
import java.lang.*;
import java.util.*;
class Main {
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum = 0;
    int[] arr = new int[N];
    //read input from user
    for(int i=0; i<N; i++){
        arr[i] = sc.nextInt();
    }
    
    //sum of the Array
    for(int i=0; i<N; i++){
        sum = sum + arr[i];
    }
    
    //display sum
    System.out.print("Sum of array: " + sum);
   }
}