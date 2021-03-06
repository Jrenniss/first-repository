// for project - menu choice will invoke another class
import java.util.Scanner;

public class Index{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("*******************************");
    System.out.println("        Project Menu");
    System.out.println("Select an option (1-14):");
   	    System.out.println();
    System.out.println("1. Break");
    System.out.println("2. Switch");
    System.out.println("3. Methods");
    System.out.println("4. Shadowing");
    System.out.println("5. Overloading");
    System.out.println("6. First Array");
    System.out.println("7. Second Array");
    System.out.println("8. Try and Catch");
    System.out.println("9. Enhanced For");
    System.out.println("10. Search Multi-Dimensional Array");
    System.out.println("11. Convert - Assignment Exercise 1");
    System.out.println("12. Search - Assignment Exercise 2");
  	System.out.println("*******");
    System.out.println("13.Other Options Menu");
    System.out.println("14. Exit");
		System.out.println();


    System.out.print("Choice: ");
    int choice = input.nextInt();
    System.out.println();

		switch(choice){
		  case 1:
			System.out.println("Break Lab");
			Break_Ex2.main(null);
			break;
		  case 2:
			System.out.println("Switch Lab");
			System.out.println();
			FirstSwitch.main(null);
			break;
		  case 3:
			System.out.println("Methods Lab");
			System.out.println();
			Methods.main(null);
			break;
	      case 4:
			System.out.println("Shadowing Lab");
			System.out.println();
			Shadow.main(null);
			break;
		  case 5:
			System.out.println("Overloading Lab");
			System.out.println();
			Arithematic.main(null);
			break;
		  case 6:
			System.out.println("First Array Lab");
			System.out.println();
			FirstArray.main(null);
			break;
		  case 7:
			System.out.println("Second Array Lab");
			System.out.println();
			SecondArray.main(null);
			break;
		  case 8:
			System.out.println("Try and Catch Lab");
			System.out.println();
			TryCatch.main(null);
			break;
		  case 9:
			System.out.println("Enhanced For Lab");
			System.out.println();
			EnhancedFor.main(null);
			break;
		  case 10:
			System.out.println("Search Multi-Dimensional Array Lab");
			System.out.println();
			TwoD_Array.main(null);
			break;
		  case 11:
			System.out.println("Convert - Assignment Exercise 1");
			System.out.println();
			Convert.main(null);
			break;
		  case 12:
			System.out.println("Search Multi-Dimensional Array Lab");
			System.out.println();
			Search.main(null);
			break;
		  case 13:
			System.out.println();
			OtherOptionsMenu.main(null);
			break;
		  case 14:
			System.out.println("Exiting....");
			break;
		  default:
			System.out.println("Invalid choice");
			break;
		}
    System.out.println();

  }
}