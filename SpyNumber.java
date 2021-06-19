/*A positive integer is called a spy number if the sum and product of its digits
are equal. In other words, a number whose sum and product of all digits are equal
is called a spy number.
for eg 1124 
sum 1+1+2+4 = 8   1*1*2*4=8
*/

public class SpyNumber {

	public static void main(String[] args) {
		int num=217;
		int rem,sum=0;
		int product=1;
		while(num>0){
			rem=num%10;
			sum=sum+rem;
			product=product*rem;
			num=num/10;
		}
		if(sum==product){
			System.out.println("Spy");
		}
		else{
			System.out.println("Not Spy");
		}
		
	}

}
