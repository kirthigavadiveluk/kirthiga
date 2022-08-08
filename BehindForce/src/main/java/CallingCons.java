class circle {
	circle() {
		System.out.println("Inside A's constructor.");
	}
}

class area extends circle {
	area() {
		System.out.println("Inside B's constructor.");
	}
}


class C extends area {
	C() {
		System.out.println("Inside C's constructor.");
	}
}

class CallingCons {
	public static void main(String args[]) {
		C c = new C();

		
	}
}
