import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// logical operators = used to connect two or more expressions
		
		// && = ( AND ) both conditions must be true
		// || = ( OR  ) either condition must be true 
		// !  = ( NOT ) reverses boolean value of condition

		
		Scanner  scanner = new Scanner(System.in);
		
		//TEMPERATURE CHECK
		System.out.println("What is the temp. outside: ");
		int temp = scanner.nextInt();
		
		if(temp > 30 ) {
			System.out.println("It is hot outside!");
		}
		else if(temp >= 20 && temp <= 30)
		{
			System.out.println("It is ok outside!");
		}
		else {
			System.out.println("It is cold outside!");
		}
		
		
		//OR LOGICAL OPERATOR 
		System.out.println("You are playing a game press q or Q to quit ");
		String response = scanner.next();
		
		if(response.equals("q") || response.equals("Q"))
		{
			System.out.println("You quit the game ");
		}
		else {
			System.out.println("You are still playing the game *pew pew*");
		}
		
		//Going to Mcdonalds
		
		System.out.println("Are you going with me to Mcdonalds? press N or n for no");
		response = scanner.next();
		
		
		//NOT LOGICAL OPERATOR
		if(!response.equals("N") && !response.equals("n")) {
			System.out.println("You want to go with me!  : )");
			
		}
		else {
			System.out.println("You don't want to go with me! :(");
		}
		
		
		scanner.close();
		
	}

}
