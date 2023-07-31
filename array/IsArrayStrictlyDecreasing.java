//Check If Array Is Strictly Decreasing

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int ans = 1;

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<N-1; i++){
            if(arr[i] <= arr[i+1]){
                ans = 0;
            }
        }
        
        System.out.print((ans == 1) ? "Strictly Decresasing" : "Not Strictly Decreasing");
    }
}