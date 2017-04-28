package adventure;

import java.util.Arrays;

public class Adventurer  {
private String[] list;
private String name;
private Room location;

public Adventurer(){
	
}

public Adventurer(String[] list,String name,Room location	){
	this.list=list;
	this.name=name;
	this.location=location;
}

public String[] getList() {
	return list;
}

public void setList(String[] list) {
	this.list = list;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Adventurer's backpack list has" + Arrays.toString(list);
}

public void setLocation(Room room) {
	this.location = room;
}


}
