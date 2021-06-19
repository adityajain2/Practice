/*A positive integer whose sum of digits of its square is equal to the number itself 
is called a neon number.
for eg 9^2= 81  8+1=9
*/public class NeonNumber {

	public static void main(String[] args) {
		int num=9;
		int temp=num;
		int square=num*num;
		int sum=0;
		int rem=0;
		while(square>0){
			rem=square%10;
			square=square/10;
			sum=sum+rem;
		}
		System.out.println(sum+ " "+temp+ " "+square+" "+num);
		if(sum==num){
			System.out.println("neon");
		}
	}

}
