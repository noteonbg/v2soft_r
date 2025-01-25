package freak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import searchhere.A;

@Component
public class B {

	private A obj;

	public B() {
		System.out.println("B object created");
	}

	@Autowired
	public void whocares(A obj) {
		System.out.println("A object is given by spring");
		this.obj = obj;

	}
}
