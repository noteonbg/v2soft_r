package secretplaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PhotoFrame {
	
	private Photo p;
	
	public PhotoFrame()
	{
		System.out.println("photoframe created");
	}


	@Autowired
	public void setP(Photo p) {
		System.out.println("wired photo into photoframe");
		this.p = p;
	}
	
	
	//yoiur logic
	
	public void show()
	{
		System.out.println("showing thick border");
		System.out.println(p.getPicture());
		System.out.println("ending thick border");
		
	}
	
	

}
