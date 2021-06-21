import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class COLORFUL {

	/*
	 * public static int colorful(int A) { HashSet<Integer> check = new
	 * HashSet<Integer>(); int product=1; List<Integer> list = new
	 * ArrayList<Integer>(); while(A!=0){ int num = A % 10; list.add(num); A /= 10;
	 * //check.add(num); }
	 * 
	 * for(int i=0; i<list.size(); i++) { for(int j=i; j<list.size(); j++) { int
	 * prod=1; int newNum= prod*list.get(i); if(check.contains(newNum){ return 0; }
	 * } } }
	 */
	
	
	
	public static int colorful(int A) {
	 HashSet<Integer> check = new HashSet<Integer>();
     String str = Integer.toString(A);
     for(int i=0;i<str.length();i++){
         int product = 1;
         for(int j=i; j<str.length();j++){
             int num = str.charAt(j) - '0';
             product *= num;
             if(check.contains(product)) return 0;
             check.add(product);
         }
     }
     return 1;
	}
	
	public static void main(String[] args) {
		int number = 23;
		System.out.println(colorful(number));
		
	}

}
