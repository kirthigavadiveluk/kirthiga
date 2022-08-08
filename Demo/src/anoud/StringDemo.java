package anoud;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class StringDemo {
	static Logger logger = Logger.getLogger(StringDemo.class);

	public static void main(String[] args) {
		String str = "HelloWorld";
		String str2 = new String("HelloWorld");
		
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		
		char c = str.charAt(0);
		logger.info(c);
		String substr=str.substring(3);
		logger.info("The sub str is...:"+substr);
		
		String substr2=str.substring(3, 7);
		logger.info("The value is..:"+substr2);
		
		int ind=str.indexOf('w');
		logger.info("The va...:"+ind);
		
		logger.info(str==str2);
		
		logger.info(str.equals(str2));
		
		String one="A";
		String two="C";
		logger.info((int)one.charAt(0));
		logger.info((int)two.charAt(0));
		logger.info(one.compareTo(two));
		logger.info(two.compareTo(one));
		
		

	}

}
