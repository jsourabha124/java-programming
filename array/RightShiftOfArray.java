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
        //store last index
        int temp = arr[N-1];
        
        //iterate from N-1 to 0
        for(int i=N-1; i>0; i--){
            arr[i] = arr[i-1];
            //System.out.println(arr[i] + " " + i);
        }
        arr[0] = temp;
        
        for(int i=0; i<N; i++){
            System.out.print(arr[i] + " ");
        }

    }
}