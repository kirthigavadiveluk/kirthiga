
public class StringDemo1 {

	static public  void main(String[] args) {
		String name="kirthiga  vadivelu   ";
		String fname="jahnavi";
		
		System.out.println(name);
		 
		System.out.println(name.concat(fname));//concat
		
		System.out.println(name.length());//length
		
		System.out.println(name.endsWith("a"));
		
		System.out.println(fname.startsWith("j"));
		
		System.out.println(name.equals(fname));
		
		System.out.println(name.equalsIgnoreCase(fname));
		
		System.out.println(name.indexOf("t"));
		
		System.out.println(name.lastIndexOf("i"));
		
		System.out.println(name.substring(3));
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.charAt(5));
		
		System.out.println(name.trim());
		
	}

}
