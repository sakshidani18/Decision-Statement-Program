package Statement;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = input.nextInt();
		boolean flag = false;
		
		if(year % 400 == 0)
			flag = true;
		
		else if (year % 100 == 0)
			flag = true;
		
		else if (year % 4 == 0)
			flag  = true;
		
		else
			flag = false;
		
		if(flag)
		{
			System.out.println("Year"+year+"is a Leap Year");
		}
		else
		{
			System.out.println("Year"+year+"is not Leap Year");
		}
		
		
		
		
			
		 
	}

}
