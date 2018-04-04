/**
Name: Convert
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
				double temp;
				double convert;
				double converts;


				do{
					// print to screen
					System.out.println( "*********************************" );
					System.out.println( "Menu" );
					System.out.println( "Enter 1 for Fahrenheit to Celsius" );
					System.out.println( "Enter 2 for Celsius to Fahrenheit" );
					System.out.println( "Enter 3 to Exit\n" );
					System.out.print( "Choice: " );//prompt user for choice
						choice = input.nextInt();


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

						public static double fahrenheit(double celsius){
							double fahrenheit;
							fahrenheit =  Math.round (9.0 / 5.0 * (celsius + 32));
							return fahrenheit;
							}

						public static double celsius(double fahrenheit){
							double celsius;
							celsius = Math.round (5.0 / 9.0 * (fahrenheit - 32));
							return celsius;
							}

 			}//end class
