package Statement;

import java.util.Scanner;

public class Profit_Loss {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Ente the Cost Price");
		int cp = input.nextInt();
		System.out.println("Enter the Selling Price");
		int sp = input.nextInt();
		
		int p,i;
		if(sp>cp)
		{
			p = sp-cp;
			System.out.println("Profit : "+p);
		}
		
		else if(sp<cp)
		{
			i = cp-sp;
			System.out.println("Loss : "+i);
			
		}
		else {
			System.out.println("No Profit Or No Loss");
		}
}
}
	

	


