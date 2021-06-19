/*A number is called a tech number if the given number has an even number of digits
and the number can be divided exactly into two parts from the middle. 
After equally dividing the number, sum up the numbers and find the square of the sum.
If we get the number itself as square, the given number is a tech number, 
else, not a tech number. For example, 3025 is a tech number.
*/

public class TechNumber {

	public static void main(String[] args) {
		
		int n=2025;
		int temp=n;
		int count=0;
		int firstHalf, SecondHalf, square;
		//find the no of digits
		while(temp>0){
			count++;
			temp=temp/10;
		}
		System.out.println(count);
		
		firstHalf = n % (int) Math.pow(10, count / 2);
		SecondHalf=n/(int) Math.pow(10, count / 2);
		
		System.out.println(firstHalf+" "+SecondHalf);
		
		square= (firstHalf+SecondHalf)*(firstHalf+SecondHalf);
		System.out.println(n);
		System.out.println(square);
		if(square==n){
			System.out.println("Tech Number");
		}
	}

}
