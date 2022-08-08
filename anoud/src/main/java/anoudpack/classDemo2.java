package anoudpack;

public class classDemo2 {
public static void main(String[] args) {
	xyz obj=new xyz();
	Bottle bot=new Bottle();
	obj.setBottle(bot);
	System.out.println(obj.getBottle(bot).size);
}
}
class xyz{
	public void setBottle(Bottle b) {
		b.size=5;
	}
	public Bottle getBottle(Bottle b) {
		return b;
	}
}
class Bottle{
	int size=10;
}