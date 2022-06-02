
public class InherDemo5 {

	public static void main(String[] args) {
		//ShakthiPlug indianPlug = new ShakthiPlug();
		AmericanPlug americanPlug = new LenovaPlug();
		ShakthiSocket indianSocket = new ShakthiSocket();
		IndianAdapter adapter = new IndianAdapter(americanPlug);
		indianSocket.roundPinHole(adapter);

	}

}

abstract class IndianPlug {
	public abstract void roundPin();
}

abstract class IndianSocket {
	public abstract void roundPinHole(IndianPlug ip);
}

abstract class AmericanPlug {
	public abstract void SlapPin();
}

abstract class AmericanSocket {
	public abstract void SlapPinHole(AmericanPlug ap);
}

class ShakthiPlug extends IndianPlug {
	@Override
	public void roundPin() {

		System.out.println("Shakthi Plug Working...");

	}
}

class ShakthiSocket extends IndianSocket {
	public void roundPinHole(IndianPlug ip) {
		ip.roundPin();
	}
}

class IndianAdapter extends IndianPlug {
	AmericanPlug ap;

	public IndianAdapter() {
	}

	public IndianAdapter(AmericanPlug ap) {
		this.ap = ap;
	}

	@Override
	public void roundPin() {
		ap.SlapPin();

	}

}

class LenovaPlug extends AmericanPlug {
	@Override
	public void SlapPin() {
		// TODO Auto-generated method stub
		System.out.println("American Slab Pin Plug Working...");
	}

}
