// Programmer: Josh McAllister 12110614
// File Week5.java
// Date: April 14 2019
// Purpose COIT11222 Assignment One Question Five T119
// Use scanner class to print a receipt

import javax.swing.JOptionPane;
	//imports the classes required
public class Week5
	//creates a public class called Week5
{
	public static void main (String[] args)
		//creates the main method
	{
		JOptionPane.showMessageDialog(null, "Welcome to the Rocky Dry Cleaners System");
			//Brings up popup box to explain what the system is

		String name;
		int numgarm;
		double total;
		int n = 0;
		double p = 0;
			//declares all needed variables

		for (int i = 0; i < 6; i++)
		//creates for loop for 6 attempts (as 6 is my highest number in my student id
		{
			name = JOptionPane.showInputDialog(null, "Please enter the customer name");
				//Declares the user's input as their name
			numgarm = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of plain garments for " + name));
				//Declares the user's next input as the number of garments

			total = calculateTotal(numgarm);
				//calls the Method called calculateTotal to determine the total cost

			//String.format("%s\n%d\n$%.2f", name, numgarm, total);
			JOptionPane.showMessageDialog(null, "\n ---Receipt--- \n" + "Customer name: " + name + "\n" + "Number of garments: " + numgarm + "\n" + String.format("Total charge: $%.2f", total));
				//brings up a prompt to tell the user the information they have given and the total

			n = numgarm + n;
			p = total + p;
				//two variables to determine total cost and total number of garments
		}
		int avggarm = n/6;
			//variable that declares the average number of garments

		JOptionPane.showMessageDialog(null, "The average number of garments per customer is " + avggarm + "\n" + String.format("The total charges collected is $%.2f", p));
			//A dialogue box to show the user the average number of garments and total charges
	}
		//ends main method

	public static double calculateTotal (double numgarm)
		//creating a method for calculating the total
	{
		double discount = 20.00;
		double price = 8.50;
		double total;
			//necessary variables created for use

		if (numgarm >= 3)
			//an if statement to determine whether or not the number of garments is above 3
		{
			price = 6.50;
				//adjusts the price accordingly
			numgarm = numgarm - 3;
				//takes away 3 of the garments as those first 3 = $20
			total = (price * numgarm) + discount;
				//Calculates the total by multiplying standard price by number of garments
			return total;
				//returns the newly found total value
		}
			//ends if

		else
		{
			price = 8.50;
				//resets the price to the original value
			total = (price * numgarm);
				//Calculates the total by multiplying standard price by number of garments
			return total;
				//returns the newly found total value
		}
			//ends else
	}
		//ends calculateTotal method
}
	//ends Week5 class