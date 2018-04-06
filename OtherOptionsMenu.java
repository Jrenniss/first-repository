import java.util.Scanner;

public class OtherOptionsMenu{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("*******************************");
    System.out.println("      Other Options Menu");
    System.out.println("Select an option (1-4):");
   	    System.out.println();
    System.out.println("1. Addition");
    System.out.println("2. Continue");
    System.out.println("3. Continue Test");
    System.out.println("4. Grades");
    System.out.println("5. LogicalOutput");
    System.out.println("6. Power");
    System.out.println("7. Reverse");
    System.out.println("8. Sales");
    System.out.println("9. Search Student");
    System.out.println("10. Square");
    System.out.println("11. Iterations");
    System.out.println("********");
    System.out.println("12. Return to Project Menu");
    System.out.println("13. Exit");

		System.out.print("Choice: ");
		int choice = input.nextInt();
		System.out.println();

			switch(choice){
			  case 1:
				System.out.println("Addition Lab");
				System.out.println();
				Addition.main(null);
				break;
			  case 2:
				System.out.println("Continue Lab");
				System.out.println();
				Continue.main(null);
				break;
			  case 3:
				System.out.println("Continue Test Lab");
				ContinueTest.main(null);
				break;
			  case 4:
				System.out.println("Grades Lab");
				System.out.println();
				Grades.main(null);
				break;
			  case 5:
				System.out.println("Logical Output Lab");
				System.out.println();
				LogicalOutput.main(null);
				break;
			  case 6:
				System.out.println("Power Lab");
				System.out.println();
				Power.main(null);
				break;
			  case 7:
				System.out.println("Reverse Lab");
				System.out.println();
				Reverse.main(null);
				break;
			  case 8:
				System.out.println("Sales Lab");
				System.out.println();
				Sales.main(null);
				break;
			  case 9:
				System.out.println("Search Student Lab");
				System.out.println();
				SearchStudent.main(null);
				break;
			  case 10:
				System.out.println("Square Lab");
				System.out.println();
				Square.main(null);
				break;
			  case 11:
				System.out.println("Iterations");
				System.out.println();
				Iterations.main(null);
				break;
			  case 12:
				System.out.println("Return to Project Menu");
				System.out.println();
				Index.main(null);
				break;
			  case 13:
				System.out.println("Exiting....");
				break;
			  default:
				System.out.println("Invalid choice");
				break;
			}//end switch
    System.out.println();

  }//end main
}//end class