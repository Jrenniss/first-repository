/**
Name:TwoD_Array
Description: implement a two dementinal array using a nested for loop
Created by: Jennifer Ryan
Created on: 21/03/18
**/

public class TwoD_Array{
	public static void main(String[] args){

		int[][] x = {{1,2},{3,4}};

		System.out.println("Using Standard For Loop to print values");
			for(int[] i: x){
				for(int j: i)
				System.out.println(j);
				}

			System.out.println();

		System.out.println("Using Enhanced For Loop to print values");
			for(int i = 0; i < x.length;i++){
				for(int j = 0; j< x[i].length; j++)
				System.out.println(x[i][j]);
				}

		//Link to Index
		Index.main(null);
	}//end main
}//end class