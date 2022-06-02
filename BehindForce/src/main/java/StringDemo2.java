
public class StringDemo2 {

	public static void main(String[] args) {
		String str = new String("World");
		String str2 = "  Hi, Welcome to chennai    ";
		
		System.out.println(str);
		
		System.out.println("String Length-->"+str2.length());
		
		System.out.println("String Character-->"+str.charAt(0));
		
		System.out.println("String LowerCase-->"+str2.toLowerCase());
		
		System.out.println("String UpperCase-->"+str2.toUpperCase());
		
		System.out.println("String Substring-->"+str2.substring(3, 5));
		
		System.out.println("String Concat-->"+str2.concat(str));
		
		System.out.println("String Startswith"+str2.startsWith("H"));
		System.out.println("String Startswith-->"+str2.startsWith("h"));
		
		System.out.println("String endWith-->"+str2.endsWith("i"));
		System.out.println("String endswith-->"+str2.endsWith("I"));
		
		System.out.println("String IgnoreEqualCase-->"+str.equalsIgnoreCase(str2));
		System.out.println("String Equals-->"+str.equals(str2));
		
		System.out.println("String Indexof-->"+str.indexOf("e"));
		System.out.println("String LastIndexOf-->"+str.lastIndexOf("l"));
		
		System.out.println("String Trim-->"+str2.trim());
		
		System.out.println();
		
		String [] arr=str2.split("e",2);
		for(String a:arr) {
			System.out.println("String Split-->"+a);
		}
		

	}

}
