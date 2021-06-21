
public class TrailingZeros {

	 public static int trailingZeroes(int A) {
		 for(int i=A-1;i>=1;i--) {
			 A=A*i;
		 }
	 int zeroCount=0;
	 String str = Integer.toString(A);
	 for(int i=str.length()-1; i>=0;i--) {
		 if(str.charAt(i)=='0') {
			 zeroCount++;
		 }
	 }
	 return zeroCount;
	 }
	
	public static void main(String[] args) {
		int a = 9247;
		System.out.println(trailingZeroes(a));
	}

}
