package comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.MyService;
@Component("mycomp")
public class MyComponent {
	@Autowired
	private MyService mys;

	public MyService getMys() {
		return mys;
	}

	public void setMys(MyService mys) {
		this.mys = mys;
	}

	public void comp() {
		System.out.println("comp method called...");
		mys.service();
	}
}