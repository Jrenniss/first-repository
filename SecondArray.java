/**
Name:SecondArray
Description: implement second Array which prints the values assigned
Created by: Jennifer Ryan
Created on: 20/03/18
**/

public class SecondArray{
	public static void main(String[] args){

		int[] x = {128, 132, 8, 156, 18};

	System.out.println("Index\t Value\n");

		for (int i =0; i <x.length; i++){
			System.out.println(i+"\t"+x[i]);
			}

		//Link to Index
		System.out.println();
		Index.main(null);
	}//end main
}//end class