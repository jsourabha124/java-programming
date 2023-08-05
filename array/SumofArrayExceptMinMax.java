
import java.lang.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        int max = A[0];
        int min = A[0];
        int sum = 0;
        int ind = 1;
        
        for(int i=1; i<N; i++){
            if(A[i] < min){
                min = A[i];
            }
            if(A[i] > max){
                max = A[i];
            }
        }
        for(int i=0; i<N; i++){
            if(A[i] != max && A[i] != min){
                sum += (A[i] * ind);
                ind++;
            }
        }
        System.out.print(sum);
    }
}