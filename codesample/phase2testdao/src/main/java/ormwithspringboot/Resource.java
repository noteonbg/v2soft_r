package ormwithspringboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="resource")
public class Resource {
	
	@Id
	@Column(name="resourceId")
	private int resourceId;
	
	
	private String resourceName;
	
	private boolean avaialability;
	
	@Override
	public String toString() {
		return "Resource [resourceId=" + resourceId + ", resourceName=" + resourceName + ", avaialability="
				+ avaialability + "]";
	}
	public int getResourceId() {
		return resourceId;
	}
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public boolean isAvaialability() {
		return avaialability;
	}
	public void setAvaialability(boolean avaialability) {
		this.avaialability = avaialability;
	}
	public Resource(int resourceId, String resourceName, boolean avaialability) {
		
		this.resourceId = resourceId;
		this.resourceName = resourceName;
		this.avaialability = avaialability;
	}
	public Resource() {
		// TODO Auto-generated constructor stub
	}
	
	

}
