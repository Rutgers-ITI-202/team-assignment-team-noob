package adventure;

public class Objectlist {
	private String[] obj;
	private String[] des;
	

	public Objectlist(){
		
	}

	public Objectlist(String[] obj,String[] des){
		this.obj=obj;
		this.des=des;
	}

	public String[] getDes() {
		return des;
	}

	public void setDes(String[] des) {
		this.des = des;
	}

	public String[] getObj() {
		return obj;
	}

	public void setObj(String[] obj) {
		this.obj = obj;
	}
	
	
	
}
