package action;

import java.util.Date;

public class HelloAction {

	private String message;
	  
    public  String execute() {
		  message = new Date().toString();
		  return  "success";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
