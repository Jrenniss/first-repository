/**
Name: Addition
Description: Prompt user to enter number, until termination using ctrl + z,
	     then add all enterd numbers and print the total.
Created By: Jennifer Ryan
Created On: 20/02/2018
*/

import java.util.Scanner;

	public class Addition{
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);

			int total = 0;

		System.out.println("Enter numbers: ");
		System.out.println("(ctrl-z to Exit to Other Options Menu)");
			System.out.println();

			while(input.hasNext()){
				total += input.nextInt();
			}
			System.out.println("Total is: "+total);

		//Link to Other Options Menu
		System.out.println();
		OtherOptionsMenu.main(null);
	}//end main
}//end class