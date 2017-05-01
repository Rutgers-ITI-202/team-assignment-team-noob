package adventure;

import java.util.Scanner;
import java.util.Vector;


public class TextAdventure {
    static Scanner sc = new Scanner(System.in);
    static Vector v=new Vector();
    static AdventureModel m = new AdventureModel();
   

    public static void main(String[] args) {
    	Adventurer p = new Adventurer();
    	 objects q[]=new objects[20];
    	 q[0]=new blueKey();
    	 q[1]=new redKey();
        // TODO Auto-generated method stub
        
        p.setList(v);
        //inventory list
        int index=14;
        sc = new Scanner(System.in);
        System.out.println("Welcome to the Try to Escape it!" +
            "\n You are the palyer that found yourself in the room" +
            "\n You need to find the clues in the room to get" +
            "\n out of the room so that to reach other levels.");

        String answer = "";
        System.out.println("Would you like to play?");
        answer = sc.next();

        if (answer.equalsIgnoreCase("No")) {
            System.err.println("-Good Bye-");
            return;
        } 
        if (answer.equals("yes"))
        {
            System.out.println("Enter your name: ");

            String player;
            player = sc.next();
            p.setName(player);

            System.out.println(
                "Hi, "+player+", You find yourself in the middle of your bedroom." +
                "\n The room has no windows and there is a bath room in your bedroom." +
                "\n It should be morning already but you do not feel the sunlight." +
                "\n You did not feel like you slept well last night." +
                "\n Your body feels so heavy that you hardly move for seconds."
                );
        }
        else {
        	System.err.println("Bad input. Plz start game again.");
        	return;
        }

        p.setPindex(index);

        while (true) {
        	try {
            System.out.println("You are now in: ");

            for (int i = 0; i < AdventureModel.map.length; i++) {
                if (p.getPindex() == AdventureModel.map[i].getIndex()) {
                    System.out.println(AdventureModel.map[i].getName());
                }
            }

            int c = choice();

            if (c == 1) {
            	if(p.getPindex()==3||p.getPindex()==6||p.getPindex()==11||p.getPindex()==1||p.getPindex()==5||p.getPindex()==9||p.getPindex()==13||p.getPindex()==17||ifOut(p.getPindex())){
            		System.err.println("You hit the wall.");
            	}
            	else{
            	index=index-1;
            	p.setPindex(index);
            	System.out.println();
            	}
            }

            if (c == 2) {
            	if(p.getPindex()==11||p.getPindex()==3||p.getPindex()==4||p.getPindex()==8|p.getPindex()==12||p.getPindex()==16||p.getPindex()==20||ifOut(p.getPindex())){
            		System.err.println("You hit the wall.");
            	}
            	else{
            	index=index+1;
            	p.setPindex(index);
            	System.out.println();
            	}
            }

            if (c == 3) {
            	if(p.getPindex()==13||p.getPindex()==14||p.getPindex()==16||p.getPindex()==6|p.getPindex()==8||ifOut(p.getPindex())){
            		System.out.println("You hit the wall.\n");
            	}
            	else{
            	index=index-4;
            	p.setPindex(index);
            	System.out.println();}
            }

            if (c == 4) {
            	if(p.getPindex()==13||p.getPindex()==14||p.getPindex()==16||p.getPindex()==6|p.getPindex()==8||ifOut(p.getPindex())){
            		System.out.println("You hit the wall.\n");
            	}
            	index=index+4;
            	p.setPindex(index);
            	System.out.println();
            }

            if (c == 5) {
            	for (int i = 0; i < AdventureModel.map.length; i++) {
                    if (p.getPindex() == AdventureModel.map[i].getIndex()) {
                        System.out.print(AdventureModel.map[i].toString());
                    }
                }
            	System.out.println();
            }

            if (c == 6) {
            System.out.println("Enter the item that you want to take a look");
            String itttem=sc.next();
            for (int i = 0; i < AdventureModel.map.length; i++) {
                if (p.getPindex() == AdventureModel.map[i].getIndex()) {
                    System.out.print(lookThing(itttem,AdventureModel.map[i]));
                }
            }
         
            }
            
            if (c == 7) {
            	System.out.println("Enter the item that you want to take");
                String iem=sc.next();
                for (int i = 0; i < AdventureModel.map.length; i++) {
                    if (p.getPindex() == AdventureModel.map[i].getIndex()) {
                    	take(iem,AdventureModel.map[i],p);
                    }
                }
            	
            }
            
            if (c == 8) {
            	System.out.println("Enter the item that you want to drop");
                String qww=sc.next();
                for (int i = 0; i < AdventureModel.map.length; i++) {
                    if (p.getPindex() == AdventureModel.map[i].getIndex()) {
                    	drop(qww,AdventureModel.map[i],p);
                    }
                }
            }
            if (c==9) {
            	
            	 for (int i = 0; i < AdventureModel.map.length; i++) {
            		 String iem="";
                     if (p.getPindex() == AdventureModel.map[i].getIndex()) {
                     	take(iem,AdventureModel.map[i],p);}
                 System.out.println("Enter the item that you want to use");
                 String answer9 = sc.next();
                
                 if (answer9.equalsIgnoreCase("exit")  ){
                     System.out.println("-Go back to main menu-");
                     break;
                     } 
                 if (answer9.equalsIgnoreCase("Brush")  ){
                	 System.out.println("Using brush to clean wedding photo");
                	 System.out.println("Some number comes up, it's your wedding date: 20130807");
                	 break;
                 }
                 if (answer9.equalsIgnoreCase("Scissor")  ){
                	 System.out.println("Killing tidy bear ");
                	 System.out.println("You get a Green Key ");
                	 break;
                 } if (answer9.equalsIgnoreCase("Blue Key")  ){
                	 System.out.println("Using blue key to open the dooe to living room ");
                	 break;
                 } if (answer9.equalsIgnoreCase("Remote controller")  ){
                	 System.out.println("Turning on television ");
                	 System.out.println("Tv shows: The cat can tell you the way to Red world if you satisify it ");
                	 break;
                 } if (answer9.equalsIgnoreCase("Milk")  ){
                	 System.out.println("Microwaving the milk ");
                	 System.out.println("How can I use this milk, is this for me to take to someone or some animal? ");
                	 break;
                 } if (answer9.equalsIgnoreCase("Red Key")  ){
                	 System.out.println("Using red key to open the door to Bedroom Red ");
                	 break;
                 } if (answer9.equalsIgnoreCase("Green Key")  ){
                	 System.out.println("Using green key to open the door to Bedroom green ");
                	 break;
                 } if (answer9.equalsIgnoreCase("Swithch")  ){
                	 System.out.println("What was this for?"+
                 "\n Maybe I should give it a try"+
                 "\n You hear the voice come from 1st stage, its the freedom room!");
                	 break;
                 }
                 else {
                	 System.err.println("I Can't.(If you want to go back to main menu, enter -exit-)");
                 }
                 
      
                 }
            }
        	}
        	catch(Exception e){
            	System.err.println("Can't read your command, try again plz (Can't you just enter the number?)");
            	break;}
        }
    }

    public static boolean ifExist(String a, Adventurer p) {
        boolean flag = false;
        Vector object = p.getList();

        for (int i = 0; i < object.size(); i++) {
            if (((String) object.elementAt(i)).equalsIgnoreCase(a)) {
                flag = true;
            }
        }
        return flag;
    }
    
    public static boolean ifOut(int in) {
    	if(in==1||in==2||in==4||in==5||in==9||in==10||in==12||in==17||in==18||in==20){
		return true;
    	}
    	else{
    		return false;
    	}
    }

    public static int choice() {
        System.out.println("\n What do you want to do next?" + "\n Enter number:" +
            "\n 1.Go west" + "\n 2.Go east" + "\n 3.Go north" +
            "\n 4.Go south" + "\n 5.Look" + "\n 6.Look thing" + "\n 7.take" + "\n 8.drop item"+ "\n 9.use");

        int choice = sc.nextInt();

        return choice;
    }


    public static void look(Room a) {
        System.out.println(a.toString());
    }

    public static String lookThing(String ooo,Room o) {
        String d = "";

        for (int i = 0; i < o.getObj().length; i++) {
            if ( o.getObj()[i].equalsIgnoreCase(ooo)) {
              System.out.println(o.getObjdes()[i]);
            }
        }

        return d;
    }
    
    public static void take(String a ,Room o,Adventurer p){
    	for (int i = 0; i < o.getObj().length; i++) {
            if ( o.getObj()[i].equalsIgnoreCase(a)) {
              p.getList().add(a);
            }
        }
    	p.print();
    }
    
    public static void drop(String a ,Room o,Adventurer p){
    	for (int i = 0; i < o.getObj().length; i++) {
            if ( o.getObj()[i].equalsIgnoreCase(a)) {
              p.getList().remove(i);
            }
        }
    	p.print();
    }
    
    /*public static void use(String a ,Room o,Adventurer p){
    	for (int i = 0; i < o.getObj().length; i++) {
            if ( o.getObj()[i].equalsIgnoreCase(a)) {
              p.getList().remove(i);
            }
        }
    	p.print();
    }*/
}
