/* An amrstrong numbers is one whose sum of the cubes of its digits is equal to the
 * Number itself
 * for eg 153= 1^3 + 5^3 + 3^3   1+125+27=153
 * 153 is an amrstong number
 * 
 */
import java.util.Scanner;
public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		int sum=0;
		int temp=number;
		while(number>0){
			int rem = number%10;
			sum=sum+rem*rem*rem;
			number=number/10;
		}
		if(sum==temp){
			System.out.println("Armstrong");
		}
	}

}
