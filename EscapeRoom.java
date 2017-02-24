import java.util.Scanner;

public class EscapeRoom {
	
	private static Scanner sc;
	
	public static void main (String[] args) {
		sc = new Scanner(System.in); 
		System.out.println("Welcome to the Escape Room"
				+ "\n You are the palyer that found yourself in the room"
				+ "\n You need to find the clues in the room to get"
				+ "\n out of the room so that to reach other levels.");
		String answer="";
		System.out.println("Would you like to play? \n");
		answer = sc.next();
		
		if (answer.equalsIgnoreCase("No")) {
			System.out.println("Ok then. Press Control + W");
			return; 
		}
		else  {
			System.out.println("You find yourself in the middle of the dark room."
					+ "\n The room is entirly closed and has no windows."
					+ "\n It should be morning already but you do not feel the sunlight."
					+ "\n You did not feel like you slept well last night."
					+ "\n Your body feels so heavy that you hardly move for seconds."
					+ "\n You found their there is a door and wanted to open it or not.");
			String input = sc.next();
			if (input.equalsIgnoreCase("Yes")){
				System.out.println("You walk toward the door and pull hard on the handle."
						+ "\n Unfortunately you cannot open it. You are now intrigued by "
						+ "\n the latern on the floor that is illumiated."
						+ "\n Now what you do?");
			}
			String action2 = sc.nextLine();
			
			switch (action2) {
			
			case "ENTER" :
				System.out.println("The door is locked which key is needed to open it");
				break;
			
			case "EXIT" :
				System.out.println("That is not possible right now. Try somthing else?");
				break; 
			
			case "LOOK" :
				System.out.println("That is not possible right now. Try somthing else?");
				break;
				
			case "DROP" :
				System.out.println("That is not possible right now. Try somthing else?");
				break;
				
			case "TAKE" :
				System.out.println("That is not possible right now. Try somthing else?");
				break;
			}
			
			String action3 = sc.next();
			switch (action3){
			case "ENTER" :
				System.out.println("That is not possible right now. Try somthing else?");
				break;
				
			case "EXIT" :
				System.out.println("That is not possible right now. Try somthing else?");
				break;
			}
		}
	}

}
