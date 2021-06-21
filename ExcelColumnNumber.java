
public class ExcelColumnNumber {

	 public static int titleToNumber(String A) {
		 int number=0;
		 for(int i=0; i<A.length(); i++) {
			 char ch= A.charAt(i);
			 int value= ch-'A'+1;
			 number=number*26;
			 number=number+value;
		 }
		 return number;
	    }
	
	public static void main(String[] args) {
		String columnName="AAA";
		System.out.println(titleToNumber(columnName));
	}

}
