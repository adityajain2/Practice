
public class PallindromeIntegerWithoutSpace {
	 public static int isPalindrome(int A) {
		 int value=-1;
		 if(A>0) {
	        int div=1;
	        while(A/div>=10){
	            div=div*10;
	        }
	        while(A!=0){
	        int first=A/div;
	        int last=A%10;
	        
	        if(first!=last)
	        return 0;
	        A=(A%div)/10;
	        div=div/100;
	        
	        }
	        return 1;
    }
		 else
			 value=0;
			 return value;
	 }
	public static void main(String[] args) {
		int a= -213;
		System.out.println(isPalindrome(a));

	}

}
