import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int temp = arr[0];

        for(int i=0; i<N-1; i++){
            arr[i] = arr[i+1];
        }
        arr[N-1] = temp;

        //display output
        for(int i=0; i<N; i++){
            System.out.print(arr[i] + " ");
        }
    }
}