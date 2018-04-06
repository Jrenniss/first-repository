/**
Name: Break_Ex2
Description: Prompt users to enter any amount of numbers from 1 to 10.
	     Check if each number entered matches 8 when match is found end program.
Created By: Jennifer Ryan
Created On: 20/02/2018
*/

import java.util.Scanner;

	public class Break_Ex2{
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int counter = 0;

		System.out.println("See if you can guess the correct number.");
		System.out.println("Guess a number from 1 to 10.");
		System.out.println("You have 10 attempts.");
		System.out.println("Enter Numbers <1 to 10 only>:");


		while(input.hasNext()){
		    if(input.nextInt() == 8){
		    	System.out.println("Match Found, it is 8");
		    	break;
		    	}

		    	counter++;
		    	if(counter == 10){
		    	System.out.println("No Match Found");
		    	break;
		   		}
	    }//end while

	    //Link to Index
	    System.out.println();
	    Index.main(null);
	 }//end main
  }//end class