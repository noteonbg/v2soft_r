package taskscenario.model;

public class TaskStatus {
	
	private int statusCode;
	private String statusMessage;
	private Task task;
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	
	public TaskStatus(int statusCode, String statusMessage, Task task) {
		super();
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
		this.task = task;
	}
	
	
	public TaskStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
