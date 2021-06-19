//Reverse the number 
public class ReverseNumber {

	public static void main(String[] args) {
		int num= 3241;
		int temp=num;
		int sum=0;
		while(temp>0){
			int rem = temp%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
		System.out.println(num);
		System.out.println(sum);
			
	}

}
