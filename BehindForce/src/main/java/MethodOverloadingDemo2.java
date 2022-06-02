
public class MethodOverloadingDemo2 {

	public static void main(String[] args) {
		Dog tiger=new Dog();
		tiger.play(new Biscuit());
		tiger.play(new Stick());
		tiger.play(new Stone());
	}

}
class Dog{
	public void play(Biscuit b) {
		System.out.println("nai valattum");
	}
	public void play(Stick s) {
		System.out.println("nai odi pogum");
	}
	public void play(Stone s) {
		System.out.println("nai kadikum");
	}
}
class Biscuit{}
class Stick{}
class Stone{}