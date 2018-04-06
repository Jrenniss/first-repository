/**
Name: Arithematic
Description:
Created by: Jennifer Ryan
Created on: 13/03/18
**/

public class Arithematic{

	public static void main(String [] args){
		Arithematic a = new Arithematic();
		System.out.println("2 + 3 = "+a.addNumbers(2,3));
		System.out.println("2 + 3 + 5 ="+a.addNumbers(2,3,5));

		//Link to Index
		System.out.println();
		Index.main(null);
	}//end main

			   public int addNumbers(int x, int y){
				   return x + y;
				   }

			   public int addNumbers(int x, int y, int z){
				   return x + y + z;
				   }
}//end class
