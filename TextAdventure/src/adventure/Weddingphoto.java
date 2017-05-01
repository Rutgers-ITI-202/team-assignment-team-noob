package adventure;

public class Weddingphoto implements objects{
	private boolean see;
	public Weddingphoto(String name,String des,boolean see){
		super();
		this.see=see;
	}
	
	public static void showCode(boolean see){
		if(see==true){
			System.out.println("Date of marriage: 20130807");
		}
	}

	public boolean isSee() {
		return see;
	}

	public void setSee(boolean see) {
		this.see = see;
	}

	@Override
	public void openlock() {
		// TODO Auto-generated method stub
		
	}
	
	
}
