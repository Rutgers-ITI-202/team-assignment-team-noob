package adventure;

import java.util.Vector;

public class Adventurer  {
private Vector list;
private String name;
private int pindex;



public Adventurer(){
	
}

public Adventurer(Vector list,String name,int pindex	){
	this.list=list;
	this.name=name;
	this.pindex=pindex;
}


public int getPindex() {
	return pindex;
}

public void setPindex(int pindex) {
	this.pindex = pindex;
}

public Vector getList() {
	return list;
}

public void setList(Vector list) {
	this.list = list;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


public void print() {
	System.out.println("Adventurer's backpack list has");
	for(int i=0;i<list.size();i++){
		   String s = (String)list.get(i);
		   System.out.println(s);
		}

}


}
