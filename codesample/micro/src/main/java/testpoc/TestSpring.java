package testpoc;

public class TestSpring {
	
	public static void main(String[] args) {
		
		Mobile m =new Mobile();
		Sim y =new Sim();
		y.setSimno(44);
		m.putSim(y);
		m.makeCall();
		
		
		
	}

}
