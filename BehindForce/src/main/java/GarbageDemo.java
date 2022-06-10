
public class GarbageDemo {

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Availabe Memory"+r.maxMemory());
		System.out.println("Available Processor.."+r.availableProcessors());;
		System.out.println("Free Memory"+r.freeMemory());
		r.gc();
		System.out.println("Free Memory"+r.freeMemory());
		
		GrandFather tatha=new GrandFather();
		System.out.println("Free Memory.."+r.freeMemory());
		tatha=null;
		System.out.println("After tathas Death.."+r.freeMemory());;
		System.out.println("tatha kariyam starts..");
		r.gc();
		System.out.println("After tathas Kariyam..."+r.freeMemory());
	}

}
class GrandFather{
	String age;
	private String gold="Under The Tree...";
	public GrandFather() {
		for(int i=0;i<1000;i++) {
			age=new String("My Name Is ..Billa...."+i);
		}
	}
	protected String getGold() {
		return "The Gold Is..."+gold;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println(getGold());
	}
}

