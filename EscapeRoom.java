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
			System.out.println( "It’s already morning..."
					+ "\n \"I feel like I didn’t sleep well last night.\""
					+ "\n Your body feels so heavy."
					+ "\n \"Are you up now?\” said your lovers."
					+ "\n \"Yes, What time did we go to bed last night?\""
					+ "\n \"We tried to sleep early, but we stayed up late because of you.\""
					+ "\n \"Because of me?\""
					+ "\n \"You don’t know why? Come on, babe.\""
					+ "\n \"Ah, Sorry.\""
					+ "\n \"I feel very happy these days. I wish I could stop the time and stay in these moment forever.\""
					+ "\n \"Don’t worry. I will always stay with you.\""
					+ "\n \"Let’s Go out and enjoy this lovely weekend.\""
					+ "\n \"Wait, when is our wedding anniversary?\"You feel confused."
				 	+ "\n \"Please don’t kid me. The date is marked on our wedding photo.\""
					+ "\n Oh, she goes out. Should I goes out and catch up with her?");
			String input = sc.next();
			if (input.equalsIgnoreCase("Yes")){
				System.out.println("You get up."
						+ "\n She’s waiting for me outside. "
						+ "\n Wait, why is the door locked."
						+ "\n what should I do now?"
						+ "\n Please type in Look, Take, Going Forward, Going Backward or Use." );
			}
			String action2 = sc.next();
			
			switch (action2) {
			
			case "Going Forward" :
				System.out.println("The door for going out is locked is locked, I need to find out the key first.");
				break;
			
			case "Going Backward" :
				System.out.println("Oh, come on, it's not the time for sleeping. I have something to do.");
				break; 
			
			case "LOOK" :
				System.out.println("You are in your bedroom."
						  + "\n There aren’t any particular objects here."
						  + "\n Just a giant photo of mountain on the wall."
						  + "\n Beside the photo is a large photo of your lover."
						  + "\n Also a globe on your desk.");
				break;
				
			case "Use" :
				System.out.println("There is nothing you can use for now.");
				break;
				
			case "TAKE" :
				System.out.println("You cannot take anything at that moment");
				break;
			}
			
		}
	}

}
