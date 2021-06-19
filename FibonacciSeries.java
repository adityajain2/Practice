import java.util.Scanner;

public class FibonacciSeries {

	/*Without recursion*/
/*	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numbers= sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a);
		System.out.print(b);
		for(int i=2; i<numbers;i++){
			int c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		}

	}
*/
	//with recursion
	public static int Fibo(int n){
		if(n == 0){
			return 0;
		}
		if(n == 1 || n == 2){
				return 1;
			}
		return Fibo(n-2) + Fibo(n-1);
		}
	    public static void main(String args[]) {
	    	Scanner sc = new Scanner(System.in);
			int numbers= sc.nextInt();
		
		for(int i = 0; i < numbers; i++){
				System.out.print(Fibo(i) +" ");
			}
		}
}