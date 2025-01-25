package ormwithspringboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class X {
	
	public X()
	{
		System.out.println("X object created");
	}
	
	@Autowired
	private ResourceDAO r;

	public void isItWorking() {
		// TODO Auto-generated method stub
		String msg = r!= null ? "ok we can go ahead " :"r is null";
		System.out.println(msg); //this message is useless but hten for our ..
		
		
	}

	public void insert() {
		// TODO Auto-generated method stub
		Resource res =new Resource(23,"A",false);
		r.save(res); //insert command done
		
	}

	public void singleSelect() {
		// TODO Auto-generated method stub
		int resourceId=23;
		Optional<Resource> o = r.findById(resourceId);
		if(o.isPresent())
		{
			Resource r = o.get();
			System.out.println(r.getResourceName() +  " " + r.isAvaialability());
		}
		else 
			System.out.println("resource id not found");
		
		
		
		
	}

	public void update() {
		// TODO Auto-generated method stub
		Resource updateobject = new Resource(923, "A", true);
		if (r.existsById(updateobject.getResourceId()))
			r.save(updateobject);
		else
			System.out.println("object not updated");

	}

	public void getAll() {
		// TODO Auto-generated method stub
		List<Resource> l = r.findAll();
		System.out.println(l);
		
	}
	
	

}
