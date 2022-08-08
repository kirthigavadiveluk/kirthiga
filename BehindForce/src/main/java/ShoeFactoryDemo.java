
public class ShoeFactoryDemo {

	public static void main(String[] args) {
		ShoeFactory.makerShoe();

	}

}

abstract class ShoeFactory implements ShoeManufacturer  {
	static void makerShoe() {
		Shoe.getname();
		System.out.println("Manufacturer-->I Export To 2 Tons Of Bata Shoe to Shoe Shop");
		ShoeShop.sellshoe();
		
	}

	
}

interface ShoeManufacturer {
	Shoe makeShoe();
	
}

class ShoeShop {
	static void sellshoe() {
		System.out.println("Sales Shop-->I Have Import 2 Tons Of Bata Shoes.....");
		SalesMan.seller();
		Customer.buyshoe();
		
	}

}

class SalesMan {
	static void seller() {
		System.out.println("SalesMan-->i selled to pair of shoes");
	}
}

class Customer {
	static void buyshoe() {
		System.out.println("Customer-->i buy to pair of shoes");
	}
}

class Shoe {
	static void getname() {
		System.out.println("Manufacturing Product -->Bata");
	}

}
