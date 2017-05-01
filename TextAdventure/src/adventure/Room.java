package adventure;

import java.util.Arrays;

public class Room {
private boolean access;
private String name;
private String[] obj;
private String[] objdes;
private int index;

public int getIndex() {
	return index;
}

public void setIndex(int index) {
	this.index = index;
}

public Room(){
	
}

public Room(boolean access,String name,String[] obj,String[] objdes){
	this.access=access;
	this.name=name;
	this.obj=obj;
	this.objdes=objdes;
}

public String[] getObjdes() {
	return objdes;
}

public void setObjdes(String[] objdes) {
	this.objdes = objdes;
}

public boolean getAccess() {
	return access;
}

public void setAccess(boolean access) {
	this.access = access;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String[] getObj() {
	return obj;
}

public void setObj(String[] obj) {
	this.obj = obj;
}

@Override
public String toString() {
	return "There are" + Arrays.toString(obj) + "in this room.";
}

}
