
public class TransactionTestDemo {

	public static void main(String[] args) {
Transaction tr1=Transaction.createTransactionObject();
		
		Transaction tr2=Transaction.createTransactionObject();
				
		tr1.amt=1000;
		
		tr2.amt=2000;
		
		System.out.println("Tr1 amt...:"+tr1.amt);
		System.out.println("Tr2 amt...:"+tr2.amt);
	

	}

}
