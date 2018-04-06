/**
Name: Continue
Description: Rewrite code as seen
			- Excludes number from list
Created By: Jennifer Ryan
Created On: 27/02/2018
*/

import java.util.Scanner;

public class Continue{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number;
		int counter = 0;

		System.out.print("Enter a number from 1 to 10: ");
		number = input.nextInt();

		while(counter <= 10){
			++counter;
			if (number == counter){
				continue;
				}
				System.out.println(counter);
				}


		//Link to Other Options Menu
		OtherOptionsMenu.main(null);
	}//end main
}//end class