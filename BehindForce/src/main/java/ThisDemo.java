
public class ThisDemo {

	public static void main(String[] args) {
		Fan khaitan = new Fan();
		khaitan.setup();

	}

}

class Fan {
	public Fan() {
		System.out.println("Fan Object Created..");
	}

	public void on() {
		System.out.println("Fan Switched on..");
	}

	public void setup() {
		Room myRoom = new Room();
		myRoom.fix(this);
		myRoom.fix(new Fan());

	}
}

class Room {
	public void fix(Fan f) {
		f.on();
	}
}
