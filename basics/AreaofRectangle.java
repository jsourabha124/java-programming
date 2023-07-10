import java.util.*;

public class AreaofRectangle {
    public static void main(String[] args) {
        /*
		Problem Description
		Given Value of Length (L) and Breadth (B) of a Rectangle. Calculate Area Of Rectangle and Print the Result.
		Formula for Area of rectangle is Area : Length * Breadth
		
		Problem Constraints
		1. 0 <= L, B <= 10000
		2. L and B are Integer Number.
		*/
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		
		if(length >= 0 && breadth <= 10000){
			int area = length*breadth;
			System.out.println("Area of rectangle : " + area);
		}else{
			if(length < 0) System.out.println("Please enter length greater than or equal to 0");
			if(breadth > 10000)  System.out.println("Please enter breadth less than or equal to  10000");
		}
		
		sc.close();
        
    }
}