/**
Name: FirstArray
Description: implement first Array whit aid of a loop
Created by: Jennifer Ryan
Created on: 14/03/18
**/

import java.util.Scanner;

	public class FirstArray{
		public static void main(String[] args){

			Scanner input = new Scanner(System.in);
				int[] x = new int[4];


			System.out.println("index\t Value\n");

			for (int i =0; i <x.length; i++)
				System.out.println(i+"\t"+x[i]);

		//Link to Index
		System.out.println();
		Index.main(null);
	}//end main
}//end class