package adventure;

public interface objects{
	void openlock();
}

class blueKey implements objects{


	public void openlock(Room a) {
		// TODO Auto-generated method stub
		a.setAccess(true);
	}

	@Override
	public void openlock() {
		// TODO Auto-generated method stub
		System.out.println("The door is open now.");
		
	}
}

class redKey implements objects{

	public void openlock(Room a) {
		// TODO Auto-generated method stub
		a.setAccess(true);
	}

	@Override
	public void openlock() {
		// TODO Auto-generated method stub
		System.out.println("The door is open now.");
		
	}
	
}

class greenKey implements objects{

	public void openlock(Room a) {
		// TODO Auto-generated method stub
		a.setAccess(true);
	}

	@Override
	public void openlock() {
		// TODO Auto-generated method stub
		System.out.println("The door is open now.");
		
	}
}
class safeBox implements objects{

	@Override
	public void openlock() {
		// TODO Auto-generated method stub
		
	}
	
}
