
public class SuperKeywordDemo {

	public static void main(String[] args) {
		Medium m1=new Medium();
		m1.topMet();
		
	}

}
abstract class TopTopStar{
	public void topMet() {
		System.out.println("Top Top Met Method Called..");
	}
}
abstract class TopStar extends TopTopStar{
	public void topMet(){
		super.topMet();
		System.out.println("Top Met Method Called..");
		
	}
}
abstract class Top extends TopStar{
	final public void topMet() {
		super.topMet();
		System.out.println("Top Met Called..");
	}
}
class Medium extends Top{
	
}