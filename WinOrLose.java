import java.util.Random;

public class WinOrLose {

	public static String solve(int []A) {
		String result = "LOSE";
		int max= Integer.MAX_VALUE;
		int TomCount=0;
		int HarryCount=0;
		int aaa = A[randomNo(A)];
		
		for(int i=0; i<A.length; i++) {
			if(A[i]==aaa) {
				A[i]=max;
			}
		}
			
		
		
		return result;
	}
	
	public static  int randomNo(int []A) {
		Random generator = new Random();
		int randomIndex = generator.nextInt(A.length);
		return randomIndex;
		}
	
	public static void main(String[] args) {
	 int A[] = {1,1,2,2,3};
	 System.out.println(solve(A));
	}

}
