package poc;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime r =Runtime.getRuntime();
		Runtime r1 = Runtime.getRuntime();
		String msg = r == r1 ? "same object" :"differnet objects";
		System.out.println(msg);
				

	}

}
