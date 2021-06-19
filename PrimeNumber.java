// Number divisible by 1 or itself

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numbers= sc.nextInt();
		
		if(numbers==0||numbers==1){
			System.out.println("Not prime");
		}
		else{
		//Can also 
			//use i*i<n for less computation
		for(int i=2; i<numbers-1; i++){
			if(numbers%i==0){
				System.out.println("Not prime");
			}
		}
		System.out.println("prime");
	}}

}
