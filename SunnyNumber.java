/*A number is called a sunny number if the number next to the given number is a 
perfect square. In other words, a number N will be a sunny number
if N+1 is a perfect square.
perfect square is when the suare root of a number is an integer
*/public class SunnyNumber {

	public static void main(String[] args) {
		
		int num=49;
		 int i = 1;
		    // While the square root is not found
		    boolean found = false;
		    while (!found)
		    {
		        // If n is a perfect square
		        if (i * i == num+1)
		        {
		            System.out.println("Sunny");
		            found = true;
		        }	
		        i++;
		
		    }
	}
}
