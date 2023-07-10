import java.util.*;

public class LasagnaCooktime {
	static void main(String[] args) {
		/*
		Problem Description
		You're going to write some code to help you cook a gorgeous lasagna from your favorite cookbook. According to your cookbook, the Lasagna should be in the oven for 40 minutes. Given the time (in minutes), the lasagna has been in the oven, find how many more minutes the lasagna still needs to bake for.
		
		Problem Constraints
		0 <= N <= 40
		*/
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        if(time >= 0 && time<=40 ){
			System.out.print(40-time);
		}else{
			System.out.print("Please enter value between 0 to 40");
		}
        sc.close();
	}

}
