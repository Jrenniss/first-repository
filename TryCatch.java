/**
Name: TryCatch
Description: run program as seen then amend to try and catch block to handle this exception
Created by: Jennifer Ryan
Created on: 20/03/18
**/

public class TryCatch{
	public static void main(String[] args){

		int[] x = {7, 6, 11, 15, 19};

	try{
		System.out.println("Value is stored in index 5 is: "+x[5]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("There was an ArrayIndexxOutOfBoundsException");
			}catch(Exception e){
			System.out.println("Warning: Some other exceptions");
			}
			System.out.println("End of Program");

		//Link to Index
		System.out.println();
		Index.main(null);
	}//end main
}//end class