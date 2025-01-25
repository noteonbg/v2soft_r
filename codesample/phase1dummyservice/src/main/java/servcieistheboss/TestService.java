package servcieistheboss;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestService implements CommandLineRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(TestService.class, args);
	}
	
	@Autowired
	private ServiceLayer sl;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		int[] x = sl.get5Multiples(0);
		if(x[0] ==0)
			System.out.println("hey give decent input");
		else
		{
			StringBuilder sb =new StringBuilder();
			for(int i:x)
			{
				sb.append("\t ");
				sb.append(i);
			}
			
			System.out.println("hey this is output " + sb);
		}
		
	}
	

}
