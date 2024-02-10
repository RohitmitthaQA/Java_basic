package Test;

import java.util.Scanner;

public class Revnum {

	public static void main(String[] args) {

		Scanner rm = new Scanner(System.in);
		System.out.println("Enter an user number :- ");
		
		
		int num=rm.nextInt();
		
		int reminder ,revnum=0;
		
		while(num!=0)
		{
			
			reminder=num%10;
			revnum=revnum*10+reminder;
			num=num/10;
			
			
		}
		
		System.out.println("Reverse of given number is :" +revnum);
 

		
		
		
	}

}
