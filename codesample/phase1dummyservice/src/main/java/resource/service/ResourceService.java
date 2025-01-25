package resource.service;

import org.springframework.stereotype.Service;

import resource.model.Resource;

@Service
public class ResourceService implements ResourceServiceInterface {

	@Override
	public Resource getResourceDetails(int resourceId) {
		// TODO Auto-generated method stub
		System.out.println("inside getResource Details" + resourceId);
		Resource r =new Resource(12,"A",false);
		return r;
	}

	@Override
	public boolean addResource(Resource r) {
		// TODO Auto-generated method stub
		System.out.println("inside add resource" + r.getResourceName());
		return false;
	}
	
	

}
