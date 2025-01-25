package dsj8.basics.another;

public class CollectDataAndThenCheckUsefulorUseless {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i[]=new int[100];
		
		
		for (int j = 0; j < i.length; j++) {
			i[j]=(int)(Math.random()*100);
		}
		
		

		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
		
		long y = System.currentTimeMillis();
		StringBuilder sb =new StringBuilder();
		for (int j = 0; j < i.length; j++) {
			sb.append(i[j]);
		}
		System.out.println(sb);
		long z = System.currentTimeMillis();
		long result = z-y;
		System.out.println(result);

		
		

	}

}
