package J_basics;

import java.util.Scanner;

public class Arraysort {

	public static void main(String[] args) {

		Scanner rm = new Scanner(System.in);
		
		System.out.println("Enter an array size :-");
		
		int size= rm.nextInt();
		
		
		int[]arr= new int [size];
		
		System.out.println("Enter an array element: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=rm.nextInt();
			
		}
		
		
		
		//int arr[]= {99,1,88,55,23};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				
				if(arr[j]<arr[j+1])
				{
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				
				
			}
			
			
			
			
			
		}
		System.out.println("Array after sorting :-");
		
		
		for(int x:arr)
		{
			System.out.println(x);
		}
		System.out.println("Enter an nth array element yopu want :-  ");
		int val =rm.nextInt();
		
		System.out.println("Here is the nth array element : "+val +"  "+arr[val]);
		
		
	}

}
