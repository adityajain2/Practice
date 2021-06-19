import java.util.Scanner;

public class PallindromeNumber {

	//corner case of a 1 digit number is not covered
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		int sum=0;
		while(number>0){
			int rem = number%10;
			sum=sum*10+rem;
			number=number/10;
		}
		if(sum==number)
			System.out.println(sum);
	}
}