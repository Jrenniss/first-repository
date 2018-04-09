/**
Name: Convert - Easter Assignment 1
Description: -interger method named Celsisu, which returns the celsius equivalent of a fahrenheit temperture.
	     -interger method named fahernheit that returns the fahrenheit equivalent of a celisius tempeture.
	     -with the two created methods an application is written that enables the user to enter a fahrenheit
	      temp and display the celsius equilivent or to enter celsius tempand display the fahrenheit equilivent.
Created by: Jennifer Ryan
Created on: 03/04/18
**/

import java.util.Scanner;//Scanner import

	public class Convert{
		public static void main (String[] args){

			Scanner input = new Scanner( System.in );
				int choice;
				int temp;
				int convert;
				int converts;


				do{
					// print to screen
					System.out.println( "*********************************" );
					System.out.println( "Menu" );
					System.out.println( "Enter 1 for Fahrenheit to Celsius" );
					System.out.println( "Enter 2 for Celsius to Fahrenheit" );
					System.out.println( "Enter 3 to Exit to Project Menu\n" );
					System.out.print( "Choice: " );//prompt user for choice
						choice = input.nextInt();

							//Menu choice
							switch ( choice )
							{
								case 1:// converts celsius to fahrenheit
									System.out.println("Enter Fahrenheit temperature: " );
										temp = input.nextInt();
										convert = celsius( temp );
									System.out.print(temp+" degrees Fahrenheit = "+convert+" degrees Celsius\n" );
									System.out.println();
								break;

								case 2:// converts fahrenheit to celsius
									System.out.println("Enter Celsius temperature: " );
										temp = input.nextInt();
										converts = fahrenheit( temp );
									System.out.printf(temp+" degrees Celsius = "+converts+" degrees Fahrenheit \n" );
									System.out.println();
								break;

								case 3:
								break;

								default:
								System.out.println( "Invalid Choice" );
							} // end of switch
					} while( choice != 3);

				//Link to Index
				System.out.println();
				Index.main(null);
		} // end main
						//Celsius to Fahrenheit conversion
						public static int fahrenheit(int celsius){
							int fahrenheit;
							fahrenheit =  (int) (9.0 / 5.0 * (celsius + 32));
							return fahrenheit;
							}
						//Fahrenheit to Celsius conversion
						public static int celsius(int fahrenheit){
							int celsius;
							celsius = (int) (5.0 / 9.0 * (fahrenheit - 32));
							return celsius;
							}

 }//end class
