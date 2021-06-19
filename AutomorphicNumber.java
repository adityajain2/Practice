/*A number is called an automorphic number if and only if the square 
of the given number ends with the same number itself.
for eg 76  76*76= 5776 hence automorphic 
*/
public class AutomorphicNumber {

	public static void main(String[] args) {
		int num=25;
		int square=num*num;
		
		while(num>0){
			if(num%10!=square%10){
				System.out.println("Not Automorphic");
			}
			else{
				num=num/10;
				square=square/10;
			}
		
		}
		System.out.println("Auto");
	}

}
