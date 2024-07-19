import java.util.Scanner;

public class Conversation {
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		String purpose;
		int days;
		double price = 0;
		System.out.println("Hello and welcome to Rent-A-Thingy");
		char answer = 'n';
		while (answer != 'y')
		{
			System.out.print("Please tell me the purpose of the object you want to rent: ");
			purpose = scnr.nextLine();
			Rentable object = RentableFactory.create(purpose);
			if (object != null)
			{
				System.out.print("Here is a brand new ");
				System.out.print(object.toString());
				System.out.println(" costing " + object.getRentalPrice() + "$ a day");
				System.out.print("Would you like to rent it? (y/n) ");
				answer = scnr.next().charAt(0);
				price = object.getRentalPrice();
				scnr.nextLine();
				System.out.println();
			}
			else
			{
				System.out.println("That is not a valid purpose!\n");
			}
		}
		
		System.out.print("\nHow many days? ");
		days = scnr.nextInt();
		System.out.print("That will be " + days*price + "$. Thank you!");
	}
}
