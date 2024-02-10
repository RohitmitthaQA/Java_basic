package Library;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) 
	{
   
		Scanner rm = new Scanner(System.in);
		System.out.println("Enter an year :-");
		int year=rm.nextInt();
		System.out.println("Enter an last year :");
		int lastval= rm.nextInt();
		for(int i=year; i<=lastval;i++)
		{
		if(((i%4==0)&&(i%100!=0))||(i%400==0))
				{
			System.out.println("Entered year is leap year " +i);
				}else {
					System.out.println("Entered year is not leap year " +i);
				}
		
		}
	}

}
