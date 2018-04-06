/**
Name: Power
Description: includes integerPower(base,exponent) that returns the value of base to the powerof the exponant
Created By: Jennifer Ryan
Created On: 07/03/2018
*/
import java.util.Scanner;

	public class Power{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
				int base;
				int exp;


			System.out.println("Enter base <negative to quit>: ");
				base = input.nextInt();

		while(base > 0){
			System.out.println("Enter Exponent: ");
				exp = input.nextInt();

				int ans = integerPower(base, exp);
				System.out.println(base+" to the "+exp+" power is "+ans);

				System.out.println("Enter base <negative to quit>: ");
					base = input.nextInt();
		}
		//Link to Other Options Menu
		System.out.println();
		OtherOptionsMenu.main(null);
	}//end main

	public static int integerPower(int base, int exp){
		int product = 1;

		for(int i = 1; i <= exp; i++)
			 product *= base;

			return product;
			}
}//end class