
public class subArrayWithSum {

    public static int[] solve(int[] A, int B) {
		int curr_Sum=A[0];
		int start=0;
		int end=1;
		int k=0;
		int c [] = new int[A.length];
		while(start<=end) {
			if(curr_Sum==B) {
				System.out.println("Range is " +start+ "," +(end-1));
				break;
				
			}
			if(curr_Sum>B && start<end) {
			  curr_Sum= curr_Sum-A[start++];
			}
			else {
				if(curr_Sum<B && end<A.length) {
					curr_Sum=curr_Sum+A[end++];
				}
			}
		}
    	for(int i=start; i<=end; i++) {
    		c[k]=A[i];
    		k++;
    		}
		return c;
    }
	
	public static void main(String[] args) {
		int [] A = {1, 2, 3, 4, 5};
		int []b=solve(A,5);
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
