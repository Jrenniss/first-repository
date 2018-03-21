/**
Name:EnhancedFor
Description: implement the sum of the array values
Created by: Jennifer Ryan
Created on: 20/03/18
**/

public class EnhancedFor{
	public static void main(String[] args){

		int[] x = {7, 6, 11, 15, 19};
		int total = 0;


	for (int i: x){
		total += i;
		}
		System.out.println("Sum of the array values is: "+total);

		Index.main(null);
	}
}