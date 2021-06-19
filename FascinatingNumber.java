/*Multiplying a number by two and three separately, the number obtained by 
writing the results obtained with the given number will be called a 
fascinating number. If the result obtained after concatenation contains all digits 
from 1 to 9, exactly once.
In other words, we can also say that a number (n) may be a fascinating number 
if it satisfies the following two conditions:

If the given number is a 3 or more than three-digit
If the value getting after concatenation contains all digits from 1 to 9, 
exactly once. eg 192, 1920
eg 327=327"+"654"+ "981"= 327654981
*/
public class FascinatingNumber {

	public static void main(String[] args) {
		int num=192;
		boolean found=true;
		
		int twoMultiple= num*2;
		int threeMultiple=num*3;
		System.out.println(twoMultiple);
		System.out.println(threeMultiple);
		
		String newNum= num+""+twoMultiple+threeMultiple;
		System.out.println(newNum);
		
		for(char c = '1'; c <= '9'; c++)  
		{  
		int count = 0;  
		for(int i = 0; i < newNum.length(); i++)  
		{  
		char ch = newNum.charAt(i);  
		if(ch == c)  
		count++;  
		}  
		
		if(count > 1 || count == 0)  
		{  
		found = false;  
		break;  
		}  
		}  
		if(found)  
		System.out.println(num + " is a fascinating number.");  
		else  
		System.out.println(num + " is not a fascinating number.");  
		}  
		}  
		
		
	