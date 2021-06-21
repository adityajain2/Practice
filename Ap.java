import java.util.ArrayList;
import java.util.Collections;

public class Ap {

	public static int solve(ArrayList<Integer> A) {
		 Collections.sort(A);
		 int val=0;
	        int diff= A.get(1)-A.get(0);
	        for(int i=0; i<A.size()-1; i++){
	            if(Math.abs(A.get(i)-A.get(i+1))==diff && i==A.size()) {
	            	val++;
	            	return val;
	            }
	        }
			return val;
	    }

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(1);
		System.out.println(solve(list));
		
	}

}
