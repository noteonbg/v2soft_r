package freak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("whocares")
@SpringBootApplication
public class TestFreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		SpringApplication.run(TestFreak.class, args);

	}

}
