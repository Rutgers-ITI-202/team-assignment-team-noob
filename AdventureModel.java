package adventure;

public class AdventureModel {
 Room[][] map= new Room[5][4];{
	Room BG=new Room();
	Room BR=new Room();
	Room BB=new Room();
	Room Bath=new Room();
	Room Liv=new Room();
	Room balcony=new Room();
	Room lobby=new Room();
	Room kitchen=new Room();
	Room outside=new Room();
	Room stair=new Room();
	
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
	
	String[] bbl = {"Wedding photo","Safe Box"};
	BB.setObj(bbl);
	
	String[] livl = {"Remote controller","TV"};
	Liv.setObj(livl);
	
	String[] kil = {"Refrigerator","Microwave oven"};
	kitchen.setObj(kil);
	
	String[] bacl = {"Cat"};
	balcony.setObj(bacl);
	
	String[] brl = {"teddy bear"};
	BR.setObj(brl);
	
	String[] bgl = {"Switch"};
	BG.setObj(bgl);
	//initial items can be seen.
	
	BB.setName("Bedroom Blue");
	BR.setName("Bedroom Red");
	BG.setName("Bedroom Red");
	Bath.setName("Bathroom");
	Liv.setName("Living room");
	balcony.setName("Balcony");
	kitchen.setName("Kitchen");
	outside.setName("outside");
	stair.setName("Stairs");
	lobby.setName("Lobby");
	
map[0][2]=BG;
map[1][1]=kitchen;
map[1][2]=lobby;
map[1][3]=BR;
map[2][2]=stair;
map[3][0]=Bath;
map[3][1]=BB;
map[3][2]=Liv;
map[3][3]=balcony;
map[4][2]=outside;
}
//initialize map and objects in the rooms.
String[] na = {"Brush","Scissor","Blue Key","Red Key","Green Key","Switch","Milk","Remote","Safe Box","Wedding photo"};
String[] desc={"A brush which can be used to clean something"
		+ "A sharp scissor"
		+ "A blue key"
		+ "A red key"
		+ "A green key"
		+ "A switch"
		+ "A bowl of milk"
		+ "A TV remote controller"
		+ "A closed safe box"
		+ "A huge wedding photo with dust covered."};
Objectlist a = new Objectlist();{
a.setObj(na);
a.setDes(desc);

 }
}