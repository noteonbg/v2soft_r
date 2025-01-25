package pocisimportant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import secretplaces.Photo;

@ComponentScan("secretplaces")
public class WCS {
	
	//in case you are creating beans create it here..
	
	
	//Hey spring take this object
	@Bean
	public Photo get()
	{
		Photo y =new Photo();
		return y;
		
	}
	

}
