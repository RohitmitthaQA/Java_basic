package Library;

import java.util.Iterator;
import java.util.Scanner;

public class Primenum {

	public static void main(String[] args)
	{
		
	Scanner rm = new Scanner(System.in);
	System.out.println("Enter an user number :- ");
		int num= rm.nextInt();
		
		int flag=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=0;
				break;
			}
			else {
				flag=1;
			}
			
			
		}
		if (flag==1) {
			System.out.println("Given number is prime :" +num);
		}
		else {
			System.out.println("Given number is NOT prime :" +num);
		}
		
		
		
		}
	

}
