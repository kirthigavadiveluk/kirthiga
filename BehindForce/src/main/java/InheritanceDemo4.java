
public class InheritanceDemo4 {
	public static void main(String[] args) {
		Ibaco ibacoicecream=new Vanila();
		System.out.println("Cost of Vanila..:"+ibacoicecream.cost());
		ibacoicecream = new Strawberry(ibacoicecream);
		System.out.println("Cost of Strawberry and Vanila..:"+ibacoicecream.cost());
		Ibaco mycream=new Strawberry(new Fruit(new Nuts()));
		System.out.println("Cost of Strawberry with Fruit and Nut..:"+mycream.cost());
		
	}
}
abstract class Ibaco{
	public abstract int cost();
}
abstract class IceCream extends Ibaco{
	
}
abstract class Topping extends Ibaco{
	
}
class Vanila extends IceCream{
	Ibaco ibaco;
	public Vanila() {
		
	}
	@Override
	public int cost() {
		
		if(ibaco==null) {
			return 10;
		}
		else {
			return 10+ibaco.cost();
			}
	}
}
class Strawberry extends IceCream{
	Ibaco ibaco;
	public Strawberry() {
		
	}
	public Strawberry(Ibaco ibaco) {
		this.ibaco=ibaco;
	}
	@Override
	public int cost() {
		if(ibaco==null) {
		return 15;
	}
		else {
			return 15+ibaco.cost();
		}
	}
}
class Fruit extends IceCream{
	Ibaco ibaco;
	public Fruit() {
		
	}
	public Fruit(Ibaco ibaco) {
		this.ibaco=ibaco;
	}
	@Override
	public int cost() {
		if(ibaco==null) {
		return 5;
	}
		else {
			return 5+ibaco.cost();
		}
	}
	
}
class Nuts extends IceCream{
	Ibaco ibaco;
	public Nuts() {
		
	}
	public Nuts(Ibaco ibaco) {
		this.ibaco=ibaco;
	}
	@Override
	public int cost() {
		if(ibaco==null) {
		return 10;
	}
		else {
			return 10+ibaco.cost();
		}
	}
	
}






