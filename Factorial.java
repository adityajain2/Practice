import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		if(number==0||number==1){
			System.out.println("1");
}
		else{
			int fact=1;
			for(int i=number; i>1;i--){
			fact=fact*i;

		}
		System.out.println(fact);
	}
	}
}
	
		///using recursion

		/*static int fact(int number){
			  if (number == 0)    
				    return 1;    
				  else    
				    return(number * fact(number-1));    
				 }    
		
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
			System.out.println(fact(number));

		}
}*/
