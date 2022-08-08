package InterJava;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ColDemo9 {

	public static void main(String[] args) {
		Properties pro=new Properties();
		pro.put("101", "rrrr");
		pro.put("102", "eeee");
		System.out.println(pro);
		System.out.println(pro.get("101"));
	Set s=pro.entrySet();
	Iterator it=s.iterator();
	while(it.hasNext()) {
		Map.Entry me=(Map.Entry)it.next();
		System.out.println(me.getKey()+"..."+me.getValue());
	}
	
	
	}

}
