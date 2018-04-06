/**
Name: Square
Description: includs method to display solid square of asterisks
Created By: Jennifer Ryan
Created On: 07/03/2018
*/

import java.util.Scanner;

	public class Square{
		public static void main(String[] args){

			Scanner input = new Scanner(System.in);

			System.out.println("Enter Square Size: ");
			int size = input.nextInt();

			squareOfAsterisks(size);

		//Link to Index
		System.out.println();
		OtherOptionsMenu.main(null);
	}//end main

		public static void squareOfAsterisks(int size){
		 for(int row = 1; row <= size; row++){
		 	for(int col = 1; col <= size; col++)
		 		System.out.print("*");
		 			System.out.println();
		 			}
				}
}//end class