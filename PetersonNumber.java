//A number is said to be Peterson if the sum of factorials of each digit is equal 
//to the sum of the number itself.
//for eg 145= 1!+4!+5!  1+24+120
public class PetersonNumber {

	public static void main(String[] args) {
		int num=145;
		int temp=num;
		int sum=0;
		while(num>0){
			int rem=num%10;
			int fact=1;
			for(int i=rem; i>1;i--){
				fact=fact*i;
		
	}
			sum=sum+fact;
			num=num/10;
			
		}
		if(temp==sum){
			System.out.println("peterson");
		}
		
}
}