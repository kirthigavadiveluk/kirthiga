package Work;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class HeadWork {
	public HeadWork() {
	}

	public abstract String working(HttpServletResponse response, HttpServletRequest request) ;

}
