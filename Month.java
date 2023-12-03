package Statement;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a month number (1-12).");
		int num = input.nextInt();
		
		if (num == 1)
			System.out.println("This is Janaury");
		
		if(num == 2)
			System.out.println("This is February");

		if(num == 3)
			System.out.println("This is March");
		
		if(num == 4)
			System.out.println("This is April");
		
		if(num == 5)
			System.out.println("This is May");
		
		if(num == 6)
			System.out.println("This is June");
		
		if(num == 7)
			System.out.println("This is Jully");
		
		if(num == 8)
			System.out.println("This is August");
		
		if (num == 9)
			System.out.println("This is september");
		
		if(num == 10)
			System.out.println("This is Octomber");
		
		if(num  == 11)
			System.out.println("This is November");
		
		if(num == 12)
			System.out.println("This is December");
		
		else
		{
			System.out.println("Enter 1 to 12 ...");
		}
		

	}

}
