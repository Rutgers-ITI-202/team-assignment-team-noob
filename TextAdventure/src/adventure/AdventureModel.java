package adventure;

public class AdventureModel {
 static Room[]map= new Room[10];{
	Room BG=new Room();// Bedroom Green
	Room BR=new Room();// Bedroom Red
	Room BB=new Room();// Bedroom Blue1
	Room Bath=new Room();
	Room Liv=new Room();
	Room balcony=new Room();
	Room lobby=new Room();
	Room kitchen=new Room();
	Room outside=new Room();
	Room stair=new Room();
	
	map[0]=BG;
	map[1]=BR;
	map[2]=BB;
	map[3]=Bath;
	map[4]=Liv;
	map[5]=balcony;
	map[6]=lobby;
	map[7]=kitchen;
	map[8]=outside;
	map[9]=stair;
	
	BB.setAccess(true);
	BR.setAccess(false);
	BG.setAccess(false);
	Bath.setAccess(true);
	Liv.setAccess(false);
	balcony.setAccess(false);
	kitchen.setAccess(false);
	outside.setAccess(false);
	stair.setAccess(true);
	lobby.setAccess(true);
	
	String[] bal = {"Scissor","Brush"};
	Bath.setObj(bal);
	String[] de1 = {"A sharp scissor","A brush which can be used to clean something"};
	Bath.setObjdes(de1);
	
	String[] bbl = {"Wedding photo","Safe Box"};
	BB.setObj(bbl);
	String[] de2 = {"A huge wedding photo with dust covered."+"A closed safe box need password to open"};
	BB.setObjdes(de2);
	
	String[] livl = {"Remote controller","TV"};
	Liv.setObj(livl);
	String[] de3={"A TV remote controller","A TV"};
	Liv.setObjdes(de3);
	
	String[] kil = {"Milk","Microwave oven"};
	kitchen.setObj(kil);
	String[] de4={"A bowl of milk","A microwave oven which can be used to heat food."};
	kitchen.setObjdes(de4);
	
	String[] bacl = {"Cat"};
	balcony.setObj(bacl);
	String[] de5={"A thirsty cat"};
	balcony.setObjdes(de5);
	
	String[] brl = {"teddy bear"};
	BR.setObj(brl);
	String[] de6={"A teddy bear seems something is hidden in it."};
	BR.setObjdes(de6);
	
	String[] bgl = {"Switch"};
	BG.setObj(bgl);
	String[] de7={"A switch which can be turned on."};
	BG.setObjdes(de7);
	//initial items can be seen.
	
	BB.setName("Bedroom Blue");
	BR.setName("Bedroom Red");
	BG.setName("Bedroom Green");
	Bath.setName("Bathroom");
	Liv.setName("Living room");
	balcony.setName("Balcony");
	kitchen.setName("Kitchen");
	outside.setName("outside");
	stair.setName("Stairs");
	lobby.setName("Lobby");
	
Bath.setIndex(13);
BB.setIndex(14);
Liv.setIndex(15);
balcony.setIndex(16);
outside.setIndex(19);
stair.setIndex(11);
lobby.setIndex(7);
kitchen.setIndex(6);
BR.setIndex(8);
BG.setIndex(3);
}
//initialize map and objects in the rooms.
 
}