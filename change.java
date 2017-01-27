//Justice Lammers
//6-15-16
//Fred George
//West Valley

import java.util.*;

class change{

	public static void main(String[] args){

		//Scanner to take in input
		Scanner in = new Scanner(System.in);

		//Variables
		double amntDue;
		double amntGiven;
		int dollars;
		int quarters;
		int dimes;
		int nickels;
		int pennies;

		//Take input of amntDue
		System.out.print("Please enter the amount due: ");
		amntDue = in.nextDouble();

		//Take input of amntPaid
		System.out.print("Please enter the amount paid: ");
		amntGiven = in.nextDouble();	
		//Math
		pennies = (int)((amntGiven - amntDue + 0.005)*100);
        dollars = pennies/100;
		pennies = pennies%100;
		quarters = pennies/25;
		pennies = pennies%25;
		dimes = pennies/10;
		pennies = pennies%10;
		nickels = pennies/5;
		pennies = pennies%5;
		
		System.out.println("Your change is: " + dollars + " dollars " + quarters + " quarters " + dimes + " dimes " + nickels + " nickels" + " and " + pennies + " pennies.");
		
	}
}