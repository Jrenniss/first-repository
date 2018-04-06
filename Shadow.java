/**
Name: Shadowing
Description: defines a global variable and links to two created methods
Created by: Jennifer Ryan
Created on: 13/03/2018
*/

public class Shadow{
  int x = 1;//global


     public static void main(String[] args){
	   Shadow s = new Shadow();
	   System.out.println("Local x = "+s.localVar());
	   System.out.println("Global x from method is: "+s.globalVar());
	   System.out.println("Global x from attribute is "+s.x);

	   //Link to Index
	   System.out.println();
	   Index.main(null);
	}//end main

	   int globalVar(){
		   return this.x;

	   }

	   int localVar(){
		   int x = 2;
		   return x;
		   }

}//end class