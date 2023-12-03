package Statement;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the week number (1-7): ");
		int num =input.nextInt();
		if(num == 1)
			System.out.println("This is Sunday");
		
		if(num == 2)
			System.out.println("This is a Monday");
		
		if (num == 3)
			System.out.println("This is a Tuesday");
		
		if (num == 4)
			System.out.println("This is a Wendesday");

		if(num == 5)
			System.out.println("This is a Thurday");
		
		if (num ==6)
			System.out.println("This is Firday");
		
		if (num == 7)
			System.out.println("This is Saturday");
		
		else
		{
			System.out.println("Enter 1 to 7 ....");
		}
		
	}

}
