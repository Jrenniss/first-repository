// for project - menu choice will invoke another class
import java.util.Scanner;

public class Index{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Select an option (1-4):");
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
    System.out.println("4. Exit");

    	System.out.println();

    System.out.print("Choice: ");
    int choice = input.nextInt();
    System.out.println();

		switch(choice){
		  case 1:
			System.out.println("Break Lab");
			Break_Ex2.main(null); //static method call, no instance required.
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
			Methods.main(null);
			break;
		  case 5:
			System.out.println("Overloading Lab");
			System.out.println();
			Methods.main(null);
			break;
		  case 6:
			System.out.println("First Array Lab");
			System.out.println();
			Methods.main(null);
			break;
		  case 7:
			System.out.println("Second Array Lab");
			System.out.println();
			Methods.main(null);
			break;
		  case 8:
			System.out.println("Try and Catch Lab");
			System.out.println();
			Methods.main(null);
			break;
		  case 9:
			System.out.println("Enhanced For Lab");
			System.out.println();
			Methods.main(null);
			break;
		  case 10:
			System.out.println("Search Multi-Dimensional Array Lab");
			System.out.println();
			Methods.main(null);
			break;
		  case 11:
			System.out.println("Exiting....");
			break;
		  default:
			System.out.println("Invalid choice");
			break;
		}
    System.out.println();

  }
}