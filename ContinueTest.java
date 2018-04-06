/**
Name: ContinueTest
Description: Rewrite code as seen
Created By: Jennifer Ryan
Created On: 27/02/2018
*/

public class ContinueTest{
	public static void main(String[] args){

		for(int count = 1; count <= 10; count++){
			if(count == 5)
				continue;

				System.out.println(count);
				}
				System.out.println("\nUsed to continue to skip printing 5");

		//Link to Other Options Menu
		OtherOptionsMenu.main(null);
	}//end main
}//end class