package adventure;
import java.io.*;
import java.util.Scanner;

public class TextAdventure {
	static Scanner sc = new Scanner(System.in);
	static Adventurer p=new Adventurer();
	static AdventureModel m = new AdventureModel();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] l1={" "," "," "," "," "," "," "," "," "," "," "," "," "};
		p.setList(l1);
		sc = new Scanner(System.in); 
		System.out.println("Welcome to the Escape Room"
				+ "\n You are the palyer that found yourself in the room"
				+ "\n You need to find the clues in the room to get"
				+ "\n out of the room so that to reach other levels.");
		String answer="";
		System.out.println("Would you like to play?");
		answer = sc.next();
		
		if (answer.equalsIgnoreCase("No")) {
			System.err.println("-Good Bye-");
			return; 
		}
		else  {
			
			System.out.println("What's your name?");
			String player;
			player = IO.readString();
//			player=sc.nextLine();
			p.setName(player);
			System.out.println("Welcome, "+player);
			System.out.println("You find yourself in the middle of your bedroom."
					+ "\n The room has no windows and there is a bath room in your bedroom."
					+ "\n It should be morning already but you do not feel the sunlight."
					+ "\n You did not feel like you slept well last night."
					+ "\n Your body feels so heavy that you hardly move for seconds."
					+ "\n You found that the wall is painted in blue color.");	
			while(true){
				int c = choice();
				try{
				if(c==1){
					p.setLocation(m.map[3][1]);
					break;
				}
				if(c==2){
					if(m.map[3][2].getAccess()==true){
						p.setLocation(m.map[3][2]);
						break;
					}
					else{
						System.out.println("The door is locked.");
					}
				}
				if(c==3){System.out.println("You hit the wall.");}
				if(c==4){System.out.println("You hit the wall.");}
				if(c==5){look(m.map[3][1]);}
				if(c==6){		
					System.out.println("Enter the name of object in the room");
					String ooo=sc.next();
					System.out.println(lookThing(ooo));}

			}

				catch (Exception e){
					System.err.println("Can't read your cammand, try again");
					break;}
		}	}
	}
	
	
	public static boolean ifExist(String a,Adventurer p){
		boolean flag=false;
		String[] object = p.getList();
		for(int i = 0 ;i<object.length; i++){
			if (object[i].equalsIgnoreCase(a)){
				flag=true;
			}
		}
		return flag;		
	}
	
	public static int choice(){
		System.out.println("\n What do you want to do next?"
				+ "\n Enter:"
				+ "\n 1.Go west"
				+ "\n 2.Go east"
				+ "\n 3.Go north"
				+ "\n 4.Go south"
				+ "\n 5.Look"
				+ "\n 6.Look thing"
				+ "\n 7.take");	
		int choice=sc.nextInt();
		return choice;
	}
	
	public static void look(Room a){
		System.out.println(a.toString());
	}
	
	
	public static String lookThing(String ooo){
		String d="";
		for(int i = 0;i<m.a.getObj().length;i++){
			if(m.a.getObj()[i].equalsIgnoreCase(ooo)){
				d=m.a.getDes()[i];
			}
		}
		return d;
	}
	
}
